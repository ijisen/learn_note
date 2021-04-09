const Koa = require('koa');
const bodyParser = require('koa-body');
const router = require('./controllers');
const app = new Koa();

app.use(async (ctx, next) => {
  console.log(`Process ${ctx.request.method} ${ctx.request.url} ...`);
  console.log(`Process ${ctx.method} ${ctx.url} ...`);
  await next();
});


// @ts-ignore
app.use(async (ctx, next) => {
  const start = Date.now();
  await next();
  const ms = Date.now() - start;
  ctx.set('X-Response-Time', `${ms}ms`);
});

// @ts-ignore
app.use(async (ctx, next) => {
  const start = Date.now();
  await next();
  const ms = Date.now() - start;
  console.log(`${ctx.method} ${ctx.url} - ${ms}ms`);
});

app.use(bodyParser({ multipart: true }));
app.use(router.routes());

app.listen(8999);
console.log('app started at port 8999...');
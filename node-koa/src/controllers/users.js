/** 处理用户管理相关URL */


const router = require('koa-router')();

router.get('/user', async (ctx, next) => {
  ctx.response.body = `<h1>Hello User World</h1>`
});

router.post('/user/:userId', async (ctx, next) => {
  const {body, params} = ctx.request;
  console.log(params);
  console.log(body);
  ctx.response.set('Content-Type', 'application/json');
  ctx.body = {
    code: 1000,
    success: true,
    message: '创建成功'
  }
  // ctx.response.body = `<h1>Hello ${params.name} World</h1>`
});

router.get('/user/:name', async (ctx, next) => {
  const {params} = ctx;
  // console.log(params);
  // console.log(ctx.request.params);
  ctx.response.set('Content-Type', 'application/json');
  ctx.response.body = {
    name: params.name
  }
  // ctx.response.body = `<h1>Hello ${params.name} World</h1>`
});

const router = require('koa-router')();


router.get('/login', async (ctx, next) => {
  ctx.body = `<h1>Index</h1>
        <form action="/signin" method="post">
            <p>Name: <input name="name" value="koa"></p>
            <p>Password: <input name="password" type="password"></p>
            <p><input type="submit" value="Submit"></p>
        </form>`;
});

router.post('/signin', async (ctx, next) => {
  const {body={}} = ctx.request;
  console.log(body);
  const name = body.name || '';
  const password = body.password || '';
  console.log(`signin with name: ${name}, password: ${password}`);
  if (name === 'koa' && password === '12345') {
    ctx.body = `<h1>Welcome, ${name}!</h1>`;
  } else {
    ctx.body = `<h1>Login failed!</h1><p><a href="/login">Try again</a></p>`;
  }
});
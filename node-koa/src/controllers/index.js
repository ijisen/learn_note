
const router = require('koa-router')();

require('./users');
require('./login');

// @ts-ignore
router.get('/', async ctx => {
  ctx.response.type = 'text/html';
  ctx.body = '<h1>Hello World</h1>';
});


module.exports = router;
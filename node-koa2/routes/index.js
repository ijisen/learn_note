'use strict'

module.exports = {
    'GET /': async (ctx, next) => {
       // ctx.response.body = {title : 'Welcome'}
        ctx.render('index.html', {
            title: 'Welcome'
        });
    }
};
//将ecm7 代码转换成 ECMA6 运行

var register = require('babel-core/register');

register({
    presets: ['stage-3']
});

require('./index')
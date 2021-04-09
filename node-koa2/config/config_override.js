'use strict'

// 储存特定配置， 可用于实际配置 == 线上 production environment

//运维使用;
var config = {
    database : 'production', //数据库名称
    username : 'www', //用户名
    password : 'www', //口令
    host : '192.168.1,89', //主机名
    port : 3306 //端口号
}

module.exports = config;
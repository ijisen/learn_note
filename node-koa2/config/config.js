'use strict'

//默认配置
const config_default = './config_default';

//develop environment 开发环境
const config_test = './config_test';

//product environment 
const config_override = './config_override';
/*
config-default.js：存储默认的配置；
config-override.js：存储特定的配置；
config-test.js：存储用于测试的配置。
	开发环境下，团队统一使用默认的配置，并且无需config-override.js。
	部署到服务器时，由运维团队配置好config-override.js，以覆盖config-override.js的默认设置。
	测试环境下，本地和CI服务器统一使用config-test.js，测试数据库可以反复清空，不会影响开发。
*/
const fs = require('fs');

var config = null;

if(process.env.NODE_ENV === 'test'){
	//console.log(`Load ${config_test}`);
	
	config = require(config_test);
}else{
	//console.log(`Load ${config_default}`);
	config = require(config_default);
	try {
		if(fs.statSync(config_override).isFile()){
			//console.log(`Load ${config_override}`);
			
			config = Object.assign(config, require(config_override));
		}
	}catch(err){
		//console.log(`Cannot load ${config_override}`);
	}
}
module.exports = config;
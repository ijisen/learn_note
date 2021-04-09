'use strict'

const Sequelize = require('sequelize');

console.log('init sequelize ...');

var sequelize = new Sequelize('dbname', 'username', 'password', {
	host : 'localhost',
	dialect : 'mysql',
	pool : {
		max : 5,
		min : 0,
		idle : 1000
	}
});

const ID_TYPE = Sequelize.STRING(50);

function defineModel(name, attributes){
	var attrs = {};
	for(let key in attributes) {
		let value = attributes[key];
		if(typeof value === 'object' && value['type']){
			value.allowNull = value.allowNull || false;
			attrs[key] = value;
		}else{
			attrs[key] = {
				type : value,
				allowNull : false
			}
		}
	}
	attrs.id = {
		type : ID_TYPE,
		primarKey : true
	};
	attr.createAt = {
		type : Sequelize.BIGING,
		allowNull : false
	};
	attrs.updatedAt = {
		type : Sequelize.BIGING,
		allowNull : false
	};
	attrs.version = {
		type : Sequelize.BIGING,
		allowNull : false
	};
	return sequelize.define(name, attrs, {
		tableName : name,
		timestamps : false,
		hooks : {
			beforeValidate : function(obj){
				let now = Date.now();
				//根据iaNewRecord设置主键，
				if(obj.isNewRecord){
					if(!obj.id){
						obj.id = genertateId();
					}
					obj.createAt = now;
					obj.updatedAt = now;
					obj.version = 0;
				}else{
					obj.updatedAt = Date.now();
					obj.version ++;
				}
			}
		}
	});
}







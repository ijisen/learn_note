'use strict'


const fs = require('fs');

const db = require('./db');



let files = fs.readdirSync(__dirname + '/');
let files_js = files.filter((f) => {
	return f.endsWith('.js');
}, files);


module.exports = {};

for(let f of files_js){
	if(f == 'model.js' || f == 'db.js'){
		console.log(`break model from file ${f}`);
	}else{
		console.log(`inport model from file ${f}`);
		let name = f.substring(0, f.length - 3);
		module.exports[name] = require(__dirname + '/' + f);
	}
}

module.exports.sync = () => {
	db.sync();
}
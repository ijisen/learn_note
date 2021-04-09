'use strict'

const db = require('./db');

module.exports = db.defineModel('pet', {
	birth: db.STRING(10),
	name : db.STRING(100),
	gender : db.BOOLEAN
})
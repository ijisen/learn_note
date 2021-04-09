'use strict'

var fs = require('fs');
var ws = fs.createWriteStream('2.txt');
var rs = fs.createReadStream('1.txt');

rs.pipe(ws);
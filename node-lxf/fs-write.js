'use strict'

var data = 'Hello nodejs';
var data2 = 'Hello nodejs Sync'
var fs = require('fs');

fs.writeFile('1.txt', data, 'UTF-8', function(err){
    if(err){
        console.log(err)
    }else{
        console.log('ok')
    }
});

console.log('i don\'t need wait writeFile');


fs.writeFileSync('1.txt', data2)//字符编码默认UTF-8

console.log('i muset wait writeFileSync')
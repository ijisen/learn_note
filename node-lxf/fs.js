'use strict'

var  fs = require('fs');
//异步读取
fs.readFile('1.js', function(err, data){ //readFile(txt, gbk, function(err, data){})
    if(err){
        console.log(err);
    }else{
        console.log(data); // Buffer
        //console.log(data.length); 
        //console.log(data.toString('UTF-8'))  //原文
    }
});

console.log('----------------------');

console.log('i don\'t wait ReadFile down！');


console.log('----------------------');
//同步读取文件，
var data = fs.readFileSync('1.js', 'UTF-8');

console.log('----------------------');

console.log(data);

console.log('I must wait readFileSync down! ');

console.log('----------------------');








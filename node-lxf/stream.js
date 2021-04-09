'use strict'

var fs = require('fs');

var rs = fs.createReadStream('1.txt', 'UTF-8');
var ws = fs.createWriteStream('2.txt', 'UTF-8');

rs.on('data', function(chunk){
    console.log(chunk)
})
    .on('end', function(){
        console.log('end')
    })
    .on('error', function(err){
        console.log(err)
    });

//pipe  数据自动从Readable流进入Writable流，这种操作叫pipe。

rs.pipe(ws);//将rs的文件复制到ws中
//stat 用于获取文件的相关信息  创建时间、大小等

'use strict'

var fs = require('fs');

fs.stat('1.txt', function(err, stat){
    if(err){
        console.log(err)
    }else{
        console.log('isFIle :' +stat.isFile());
        console.log('is Directory: ' +  stat.isDirectory());
        console.log('File Size : ' + stat.size);
        console.log('birth time :' + stat.birthtime); //创建时间
        console.log('modified time : ' + stat.mtime); //修改时间
        console.log('Change Time: ' + stat.ctime);  
        console.log('Access Time : ' + stat.atime) //访问时间
    }
})
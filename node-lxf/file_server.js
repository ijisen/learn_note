'use strict'

var fs = require('fs');
var url = require('url');
var path = require('path');
var http = require('http');

var port = 8080;

var hostname = '127.0.0.1';

//从命令行参数获取root目录，默认是当前目录
var root = path.resolve(process.argv[2] || '.');

console.log(`Static root dir : ${root}`); 

var server = http.createServer((req, res) =>{
    //获取当前url的path 
    var pathname = url.parse(req.url).pathname;
    console.log('pathname :' + pathname);
    console.log(url.parse(req.url));
    
    //获取对应文件的本地路径
    var filepath = path.join(root, pathname);
    console.log(`filepath is : ${filepath}`);
    fs.stat(filepath, (err, stat) => {
      if(err){
		  console.log('err')
        readError(req, res, `<h1>404 ${filepath} not found</h1>`);
      }else{
        if(stat.isFile()){
         readSuccess(req, res);
        }else{
			console.log('is dir')
          isDir(req, res);
        }

      }
    
    })
    function readError(req, res, data){
      console.log('404' + req.url);
	  res.writeHead(404,{'Content-Type': 'text/html'});
      res.end(data);
    }
    function readSuccess(req, res){
      console.log('200 : ' + req.url); 
      res.writeHead(200,{'Content-Type': 'text/html'});
      //res.write('<head><meta charset="utf-8"/></head>');  
      res.write('<h1>Node.js</h1>');  
      fs.createReadStream(filepath).pipe(res);
    }
	function isDir(req, res){
		console.log(filepath)
		fs.readdir(filepath, (err, files) => {
			if (err) {
				readError(req, res, `<h1>404 ${filepath} not found</h1>`);
			} else {
				console.log(`files is ${files}`); //file []为数组，列出当前目录

				var names = files.filter(function (x) {
					return x === 'index.html' || x === 'default.html';
				}); // names 为数组  ['index.html', 'default.html'] 如果目录存在的情况下

				if (names.length !== 0) {
					console.log(`old filepath is ${filepath}`);

					console.log(`names[0] is ${names[0]}`);

					filepath = path.join(filepath, names[0]);

					console.log(`new filepath is ${filepath}`);

					readSuccess(req, res);
				} else {
					readError(req, res, `<h1>404 ${filepath} not found</h1>`);
				}
        	}
    });
	}

});

server.listen(port, hostname, () => {
  console.log(`server has running at http://${hostname}:${port} `)
})

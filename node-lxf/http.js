'use strict'

var http = require('http');

var port = 8080;

var hostname = '127.0.0.1'

var server = http.createServer(function(req, res){
    console.log(req.url);
    res.writeHead(200, {'Content-Type' : 'text/html'});
    res.end('<h1>Hello Node Word</h1>');
});
server.listen(port, hostname, function(){
    console.log(`server has running at http://${hostname}:${port}`);
});


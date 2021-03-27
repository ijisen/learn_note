
//job1.then(job2).then(job3).catch(handleError);

//串行执行异步任务
	new Promise(function(resolve, reject){
		setTimeout(resolve, 500);
	})
	.then(function(){
		console.log('promise 1')
	})
	.then(function(){
		console.log('promise 2')
	})
	.catch(function(){
		console.log('error')
	})



//Promise.all()  并行执行异步任务

	var p1 = new Promise(function(resolve, reject){
		setTimeout(resolve, 800, 'P1');
	});

	var p2 = new Promise(function(resolve, reject){
		setTimeout(resolve, 500, 'P2')
	});


	Promise.all([p1, p2]).then(function(results){
		console.log(results)   // 获得一个Array: ['P1', 'P2']
	})

//Promise.race() //谁先执行完就输出谁的结果， 容错

	var r1 = new Promise(function(resolve, reject){
		setTimeout(resolve, 500, 'R1')
	});

	var r2 = new Promise(function(resolve, reject){
		setTimeout(resolve, 700, 'R2')
	});

	Promise.race([r1, r2]).then(function(result){ console.log(result)});




// 0.5秒后返回input*input的计算结果:
function multiply(input) {
	return new Promise(function (resolve, reject) {
		log('calculating ' + input + ' x ' + input + '...');
		setTimeout(resolve, 500, input * input);
	});
}

// 0.5秒后返回input+input的计算结果:
function add(input) {
	return new Promise(function (resolve, reject) {
		log('calculating ' + input + ' + ' + input + '...');
		setTimeout(resolve, 500, input + input);
	});
}

var p = new Promise(function (resolve, reject) {
	var a = 5;
	log('start new Promise...');
	if (a< 1) {
		log('call resolve()...');
		resolve('200 OK');
	} else {
		log('call reject()...');
		reject('timeout in ' + a+ ' seconds.');
	}
	//resolve(123);
});

p.then(multiply)
	.then(add)
	.then(multiply)
	.then(add)
	.then(function (result) {
		log('Got value: ' + result);
	}).catch(function(val){console.log(val)})


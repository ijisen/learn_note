//错误处理
	try{
		console.log(dd)
	}catch(e){
		if(e instanceof TypeError){
			console.log('type Error')
		}else if(e instanceof Error){
			console.log(e)
		}else{
			console.log('Error: ' + e)
		}
	}finally{
		console.log('finally')
	}
/*
	typeof操作符可以判断出number、boolean、string、function和undefined;

	null [] {} == object
	
	判断Array要使用Array.isArray(arr);
	
	判断null请使用myVar === null

*/
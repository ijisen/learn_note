//typeof 操作符获取对象的类型，它总是返回一个字符串：
	typeof 123; // 'number'
	typeof NaN; // 'number'
	typeof 'str'; // 'string'
	typeof true; // 'boolean'
	typeof undefined; // 'undefined'
	typeof Math.abs; // 'function'
	typeof null; // 'object'
	typeof []; // 'object'
	typeof {}; // 'object'
	typeof Symbol() //"symbol"
/*
	typeof操作符可以判断出number、boolean、string、function和undefined;

	null [] {} == object
	
	判断Array要使用Array.isArray(arr);
	
	判断null请使用myVar === null

*/
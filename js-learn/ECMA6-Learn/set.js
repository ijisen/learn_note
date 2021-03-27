// Set是一组key的集合，但不存储value。且key不能重复，Set没有索引值！！！


var s = new Set([1,2,3,4,5,]);
	console.log(s)  // Set {1, 2, 3, 4, 5}
var n = new Map();
	n.add(85);  // 添加新的key
	n.has(4) // 是否存在key 4 : true/false
	n.delete(4);  // 删除key 4 成功返回 true  失败 false
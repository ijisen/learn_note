// Map是一组键值对的结构，具有极快的查找速度

var m = new Map([['Michael', 95], ['Bob', 75], ['Tracy', 85]]);
	m.get('Michael'); // 95
	m.get('Tracy'); // 85
	m.get('Bob'); // 75
var n = new Map();
	n.set('JiSen', 85);  // 添加新的key-value
	n.set('Michael', 65); // 添加新的key-value
	n.set('HMM', 95); // 添加新的key-value
	n.has('jisen') // 是否存在key 'Adam': true
	n.delete('Michael', 65);  // 删除key 'Adam' 成功返回 true  失败 false
	
// Map 高阶应用：

	var arr = [1,2,3,4,5,6,9,7];
	var saqs = function(x){
		return x*x;
	}
	arr.map(saqs); // [1, 4, 9, 16, 25, 36, 81, 49]
	arr.map(Srting); //["1", "2", "3", "4", "5", "6", "9", "7"]
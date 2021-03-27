// forEach()方法是ES5.1标准引入的，可用于遍历Array，Set, Map

var a = ['A', 'B', 'C'];
a.forEach(function (element, index, array) {
    // element: 指向当前元素的值
    // index: 指向当前索引
    // array: 指向Array对象本身
    console.log(element);
    console.log(index);
    console.log(array);
});

var s = new Set(['A', 'B', 'C']);
s.forEach(function (element, sameElement, set) {
	// ps:Set没有索引，因此回调函数的前两个参数都是元素本身：
	// element: 指向当前元素的值 A
    // sameElement: 指向当前元素的值  A
    // set: 指向Set对象本身  Set {"A", "B", "C"}
    console.log(element);
    console.log(sameElement);
    console.log(set);
});

var m = new Map([[9, 'x'], [8, 'y'], [7, 'z']]);
m.forEach(function (value, key, map) {
	// value: 指向当前元素的值 x
    // key: 指向当前元素的key 9
    // map: 指向Map对象本身 Map {1 => "x", 2 => "y", 3 => "z"}
    console.log(value); 
    console.log(key);
    console.log(map);
});
function sumger(max){
	var sum = 0;
	for(var i=1; i <= max; i+=3){
	  sum += i;
	  //console.log(i)
	}
	return sum
}

/** =================
 *       【Array】
 *  ================= */

/** ====== Array ES5 API ===== */

let arr_a = [1, 2, 3, 4, 5, 6];
let arr_b = [7, 8, 9, 10, 11, 12];
/** concat() 合并数组
 *  array1.concat(array2,array3,...,arrayX)
 *  */
arr_a.concat(arr_b);

/** filter() 元素过滤， 不会修改原数组,会生成新数组
 *  array.filter((currentValue, index, arr) => {});
 *  currentValue 必选参数,当前元素值，
 *  index 可选，当前元素索引值
 *  arr 可选,当前数组对象
 *  */
// eg：
let filter_arr = [1, 2, 3, 4, 5, 6];
filter_arr.filter((currentValue) => {
  return currentValue % 2 === 0
});

/** forEach() 数组遍历， 没有返回值！！！
 *  array.forEach((currentValue, index, arr) => {});
 *  currentValue 必选参数,当前元素值，
 *  index 可选，当前元素索引值
 *  arr 可选,当前数组对象
 *  */
// eg：
let foreach_arr = [1, 2, 3, 4, 5, 6];
foreach_arr.forEach((currentValue, index) => {
  console.log(currentValue);
  console.log(index);
});

/** map() 数组遍历, 有返回值，可以return
 *  array.map((currentValue, index, arr) => {});
 *  currentValue 必选参数,当前元素值，
 *  index 可选，当前元素索引值
 *  arr 可选,当前数组对象
 *  */
// eg：
let map_arr = [1, 2, 3, 4, 5, 6];
let new_map_arr = map_arr.map((currentValue, index) => {
  return currentValue += 2;
  console.log(index);
});
console.log(new_map_arr);
// [3, 4, 5, 6, 7, 8]

/** ----- map() && forEach() 区别 -----
 * 能用forEach()实现的map()也能实现，反之亦然，
 * map()会分配内存空间储存新数组并返回，forEach()不会返回数据
 * for系遍历总体性能好于forEach、map等数组方法
 * forEach性能优于map
 * */



/** indexOf() 元素查找，返回匹配的第一条数据的下标，没有找到返回-1
 *  array.indexOf(item, start);
 *  item 必选参数,查找的元素，
 *  start 可选（0 - (arr.length - 1)）,起始位置
 *  */
// eg：
arr_a.indexOf(item, start);

/** lastIndexOf() 元素查找，返回匹配的最后一条数据的下标，没有找到返回-1
 *  array.lastIndexOf(item, start);
 *  item 必选参数,查找的元素，
 *  start 可选（0 - (arr.length - 1)）,起始位置
 *  */
// eg：
arr_a.lastIndexOf(item, start);

/** Array.isArray(obj) 元素查找，true/false
 *  Array.includes(obj);
 *  obj 必选参数
 *  */
// eg：
Array.isArray(arr_a);

/** join() 数组转字符串
 *  arr.join(separator);
 *  separator 可选参数, 分隔符，默认使用','
 *  */
// eg：
let arr_join = [1, 2, 3, 4, 5, 6];
arr_join.join(''); // '123456'
arr_join.join(); // '1,2,3,4,5,6'

/** reduce()
 *  arr.reduce((total, currentValue, currentIndex, arr) => {});
 *  total 必须，初始值或计算后的返回值， 【默认第一条数据值】
 *  currentValue 必须，当前元素【从第二条数据开始】
 *  currentIndex 可选，当前元素索引【从第二条数据开始】
 *  arr 可选，当前元素所属的数组对象
 *  */
// eg：
let arr_reduce = [1, 2, 3, 4, 5, 6];
arr_reduce.reduce((total, currentValue, currentIndex, arr) => {
  total += currentValue;
  console.log(total);
  console.log(currentValue);
  console.log(currentIndex);
  console.log(arr);
  return total;
});

/** slice() 数组截取【不会改变原始数据】
 *  arr.slice(start, end);
 *  start 可选
 *  end 可选, 不包括该元素
 *  */
// eg：
let arr_slice = [0, 1, 2, 3, 4, 5, 6];
arr_slice.slice(0, 4); // [0, 1, 2, 3]

/** splice() 数组截取【会改变原始数据】
 *  arr.splice(index, howmany, item1, item2,...itemX);
 *  index 必选，插入|删除元素的位置
 *  howmany 个数
 *  item1 插入的数据
 *  */
// eg：
let arr_splice = [0, 1, 2, 3, 4, 5, 6];
arr_splice.splice(1, 2); // [1, 2]
console.log(arr_splice); // [0, 3, 4, 5, 6];

/** sort() 数组排序
 *  arr.sort(sortfunction);
 *  sortfunction 可选，排序方式
 *  */
// eg：
let arr_sort = [40,100,1];
arr_sort.sort(); // [1, 100, 40]
// 升序
arr_sort.sort((a, b) => { return a - b }); // [1, 100, 40]
// 降序
arr_sort.sort((a, b) => { return b - a }); // [100, 40, 1]

/** ====== Array ES6 API ===== */

/** fill() 用一个固定值替换数组元素
 *  array.fill(value, start, end)
 *  value 必选参数，
 *  start 可选，默认0
 *  end 可选 默认arr.length
 *  */
// eg： 电话号码加密
let _tel = 13981673665;
_tel.toString().split('').fill('*', 3, 7).join('');

/** includes() 元素查找，true/false
 *  array.includes(item, start);
 *  item 必选参数,查找的元素，
 *  start 可选（0 - (arr.length - 1)）,起始位置
 *  */
// eg：
arr_a.includes(item, start);

/** find(callback)
 *  callback(currentValue, index, arr)
 *  currentValue 必选，当前元素;
 *  index 可选,索引，
 *  arr 数组对象
 *  */
// eg：
let arr_find = [1, 2, 3, 4, 5, 6];
arr_find.find((currentValue) => {
  // 返回元素值 || undefined
  return currentValue > 3
});

/** findIndex(callback)
 *  callback(currentValue, index, arr)
 *  currentValue 必选，当前元素;
 *  index 可选,索引，
 *  arr 数组对象
 *  */
// eg：
let arr_find_index = [1, 2, 3, 4, 5, 6];
arr_find_index.findIndex((currentValue) => {
    // 返回元素下标 || -1
    return currentValue > 3
});

/** entries()，keys() 和 values() */
// eg：
let arr_of = ['a', 'b', 'c'];
for (let item of arr_of.values()) {
  console.log(item); // a b c
}
for (let index of arr_of.keys()) {
  console.log(index) //0, 1, 2
}
for (let [index, item] of arr_of.entries()) {
  console.log(index, item) // 0 a; 1 b; 2 c
}
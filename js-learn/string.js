/** =================
 *       【String】
 *  ================= */

/** ====== String ES5 API ===== */

/** charAt()
 *  返回指定位置的字符
 */
let str_charat = 'Hello Word';
str_charat.charAt(2); // l

/** charAt()
 *  返回指定位置的字符 Unicode 编码:
 */
str_charat.charCodeAt(2); // 108

/** fromCharCode()
 *  Unicode 编码 转换成 字符:
 *  item1, item2...itemX
 */
String.fromCharCode(108, 75); // l K

/** repeat()
 *  字符串复制
 *  repeat(count)
 */
let str_repeat = 'kd';
str_repeat.repeat(2); // kdkd

/** replace()
 *  字符串替换
 *  replace(searchValue, newValue)
 *  searchValue 必选，支持正则
 */
let str_replace = 'kd lk ok kd';
str_replace.replace('kd', 'hk'); // hk lk ok hk

/** slice()
 *  字符串截取
 *  slice(start, end)
 *  start 必选
 *  end 可选，不包括该元素
 */
let str_slice = 'kdlkokkd';
str_slice.slice(1, 3); // dl

/** split()
 *  字符串拆分
 *  split(separator, limit)
 *  start 可选。字符串或正则表达式
 *  end 可选。该参数可指定返回的数组的最大长度。
 */
let str_split = 'kdlkokkd';
str_split.split(''); // ["k", "d", "l", "k", "o", "k", "k", "d"]

/** ====== String ES6 API ===== */

/** substr()
 *  字符串截取
 *  substr(start, length)
 *  start 必选
 *  length 可选，截取个数
 */
let str_substr = 'kdlkokkd';
str_substr.substr(2, 3); // lko

/** substring()
 *  字符串截取
 *  substring(start, end)
 *  start 必选
 *  end 可选，不包括该元素
 */
let str_substring = 'kdlkokkd';
str_substring.substring(1, 3); // dl
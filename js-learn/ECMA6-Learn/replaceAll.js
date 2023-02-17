/**
 * 替换字符串
 * */

const str = 'a+b+c+d+e'

/** es2021- */
// => 'a-b-c-d-e'
str.replace(/\+/g, '-')

/** es2021+ */
str.replace(/\+/g, '-')
str.replaceAll('+', '-');

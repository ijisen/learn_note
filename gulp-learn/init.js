/*================初始化目录结构===================
 * +_+ 说明：      自动创建项目目录结构
 * j_s 编辑人：    jisen
 * r_r 编辑时间：  2017-03-15
 * -_- 使用说明：  node init
 * ==============================================*/

const fs = require('fs');



//默认根目录名称
var basePath = 'src';

//默认子目录结果即名称

var childPath = {
  "css" : null, //css文件夹
  "fonts" : null, //字体库
  "icons" : ["icon", "svg"],  //图标文件，独立出来，方便生成雪碧图
  "img" : null, //图片文件
  "js" : null, //js文件
  "static" : ["js", "css"] //静态文件，用于存放引用的文件 如果jquery bootstrap等插件
};


function createSrc(father, obj){
  var root = father,
    child_arr = [root],
    s = '',
    k = 0;
   for(s in obj){
     var path  =  root + '/' + s,
       child = obj[s],
       child_len = 0;
     child_arr.push(path);
     if(child){
       child_len = child.length;
       for(k = 0; k < child_len; k++){
         path  = (root + '/' + s + '/' + child[k]);
         child_arr.push(path);
       }
     }
   }
 // console.log(child_arr)
  checkSrc(child_arr)
};


function checkSrc(arr){
  var child_arr = arr,
    child_arr_len = child_arr.length,
    k = 0,
    absolute_src = '';
  for(k; k < child_arr_len; k++){
    absolute_src = __dirname  + '/' + child_arr[k];
    if (!fs.existsSync(absolute_src)) {
      fs.mkdirSync(absolute_src);
      console.log( 'Create : ' + absolute_src );
    }else{
      console.log('Exist : ' + absolute_src);
    }
  }
}

module.exports = createSrc(basePath, childPath);





/**
 name：定时器处理数组
 
 description： 
  可能应用到的场景：
	01. 要处理的数据过于庞大
	02. process函数处理过于复杂
  可能实现的效果：
	异步写入数据（容易造成过度页面重绘）
 
 ps： 定时器延迟至少25ms，因为再小的延迟对于大多数UI更新不够用
 优点： 避免数据处理时间过长，dom加载时间过久,浏览器被锁定;
 缺点： 由于使用了定时器，整体时间会有所增加
*/

function setData(){
  let arr = [1,2,3,4,5,6,7,8,9,10];

  //克隆得到的数据
  let todo = arr.concat();

  setTimeout(function(){
    //取得到数据的第一条进行处理，同时删除数组的第一条
    process(todo.shift());

    if(todo.length > 0){
      //arguments.callee 回调
      setTimeout(arguments.callee, 25)
    }else{
      //callback(arr);
      console.log('null')
    }
  }, 25)


  function process(k){
    console.log(k)
  }
};

//封装为公共库

function processArray(data, process, callback){
  let todo = data.concat();
  setTimeout(function(){
    process(todo.shift());
    if(todo.length > 0){
      setTimeout(arguments.callee, 25);
    }else{
      callback && typeof callback == 'function' && callback(data);
    }
  }, 25)
}

//eg: 任务分割
//当一个大的json串包含很多块时
function getData(){
  let data = [
    {"header" : [1,2,4,5]},
    {"main" : [1,2,3,4,5]},
    {"footer" : [1,2,4,5,6]}
  ];

  //常规方法：
  setHeader(data.header);
  setMain(data.main);
  setFooter(data.footer);

  //new 
  let task = [setHeader, setMain, setFooter];
  processArray(data, task, function(){
    console.log('Done!!')
  })

  function setHeader(data){
    console.log(data);
  }
  function setMain(data){
    console.log(data);
  }
  function setFooter(data){
    console.log(data);
  }
}
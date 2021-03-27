/** ================
 *    递归尾掉
 * ================= */

function factorial(n, total) {
  if (n === 1) return total;
  return factorial(n -1, n * total)
}

factorial(5, 1);

let data = [
  {
  id: 1,
  type: 1,
  content: '第一大题',
  subject: [
      {
        id: 11,
        type: 2,
        content: '第一大题-11',
        options: [
          {
            id: 111,
            type: 4,
            content: '选项A'
          },
          {
            id: 112,
            type: 4,
            content: '选项B'
          },
          {
            id: 113,
            type: 4,
            content: '选项C'
          },
          {
            id: 114,
            type: 4,
            content: '选项D'
          }
        ]
      },
      {
        id: 12,
        type: 3,
        content: '第一大题-12',
      }
    ]
  },
  {
    id: 2,
    type: 1,
    content: '第二大题',
    subject: [
      {
        id: 21,
        type: 3,
        content: '第二大题-21',
      },
      {
        id: 21,
        type: 3,
        content: '第二大题-22',
      }
    ]
  }
];
tree(data, []);
function tree(data, arr){
  for(var i = 0, len = data.length; i < len; i++){
   
     var _data = data[i];
     var _child = _data.subject;
      console.log(_data.content);
     var _obj = null;     
     if (_data.type !== 1) {
       _obj = {
        id: _data.id,
        type: _data.type,
        content: _data.content
       };
       if (_data.type === 2) {
         _obj.options = _data.options;
       }
       arr.push(_obj);
     }
     if (_child) {
       tree(_child, arr)
     }
  }
  return arr;
}

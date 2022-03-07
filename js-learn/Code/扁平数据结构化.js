let arr = [
  { id: 1, name: '部门1', pid: 0 },
  { id: 2, name: '部门2', pid: 1 },
  { id: 3, name: '部门3', pid: 1 },
  { id: 4, name: '部门4', pid: 3 },
  { id: 5, name: '部门5', pid: 4 }
]

const arrayToTree = (data) => {
  let result = [];
  let itemMap = {};
  for (let item of data) {
    const { id, pid } = item;

    itemMap[id] = {
      ...item,
      children: itemMap[id] ? itemMap[id].children : []
    };
    const treeItem = itemMap[id];

    if (pid === 0) {
      result.push(treeItem);
    } else {
      if (!itemMap[pid]) {
        itemMap[pid] = {
          children: []
        }
      }
      itemMap[pid].children.push(treeItem)
    }
  }
  return result;
}

/**
 * 输出结果
 [
 {
      "id": 1,
      "name": "部门1",
      "pid": 0,
         "children": [
             {
                "id": 2,
                "name": "部门2",
                "pid": 1,
                "children": []
             },
             {
                "id": 3,
                "name": "部门3",
                "pid": 1,
                "children": [
                   // 结果 ,,,
                ]
              }
          ]
      }
 ]
 * */

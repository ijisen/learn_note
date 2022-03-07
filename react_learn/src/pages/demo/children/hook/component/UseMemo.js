/**
 * Hook useMemo
 * 适用场景： 子组件的 props 和 state 没有变化时，即便父组件渲染，也不要渲染子组件。
 * */

import React, { useState, useMemo, useCallback } from 'react';
import {
  Button,
  Card
} from 'antd';


function CustomComponent() {
  console.log('CustomComponent Refresh');
  return (
    <p>CustomComponent</p>
  )
}

const MemoComponent = React.memo((props) => {
  const { count, addCount } = props;
  console.log("函数重新渲染");
  return <div>
    <Button onClick={addCount}>Memo Click</Button>
    <p>count: {count}</p>
  </div>
});


const Example = () => {
  const [count, setCount] = useState(0);

  let double = useMemo(() => {
    return count * 2
  }, [count === 3]);

  /** useCallback 可以看成useMemo返回函数时的简写，赋值给onClick 不会引发函数重新渲染 */
  /** 括号可以看成依赖数组，当为空时，只有第一次挂载时才会渲染，当有数据时如[count]，当count改变时才会改变，有多个数据时，所有数据改变时才会改变 */
  let addCount = useCallback(() => {
    setCount((count) => count + 1)
  }, []);
  /*const addCount = () => {
    setCount((count) => count + 1)
  }*/
  return (
    <Card title="UseContext" bordered={true} style={{ width: 500, marginTop: 10 }}>
      {/** 防止传入函数会重复渲染，可以用上面的useMemo()或者它的简易实现useCallback 返回一个函数，节省性能 */}
      {/** 直接赋值当数据改变时，这个函数会重复渲染浪费性能 */}
      <Button onClick={() => {
        setCount(count => count + 1)
      }}>count+1</Button>
      <p>{count} - {double}</p>
      <CustomComponent />
      <MemoComponent addCount={addCount} count={double} />
    </Card>
  );
}

export default Example;

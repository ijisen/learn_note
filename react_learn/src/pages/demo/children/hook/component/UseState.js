/**
 * Hook useState
 * */
import React, { useEffect, useState } from "react";
import { Button, Card } from "antd";

const Example = () => {
  const [count, setCount] = useState(0);

  // 跟 useState 一样，你可以在组件中多次使用 useEffect ：
  useEffect(() => {
    console.log('set html Title')
    document.title = `${count} times`;
  }, [count]);

  return (
    <Card title="useState">
      <h1>count: {count}</h1>
      <div style={{ marginTop: 10}}>
        <Button type="primary" onClick={() => setCount(count + 1)}>Click</Button>
      </div>
    </Card>
  )
}

export default Example

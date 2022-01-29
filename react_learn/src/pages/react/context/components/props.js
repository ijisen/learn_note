/**
 * props 传参得按组件 一层一层传递
 * */

import React from "react";
import {
  Card,
  Button
} from "antd";

const ThemeButton = (props) => {
  /**
   * 从父级 Toolbar 接收 theme 参数
   * */
  return (
    <Button type={props.theme}>Button</Button>
  )
};

const Toolbar = (props) => {
  /**
   * Toolbar 组件接受一个额外的“theme”属性， 然后传递给 ThemeButton 组件。
   * 如果应用中每一个单独的按钮都需要知道 theme 的值， 这会是件麻烦的事情。
   * 因为必须将这个值层层传递给所有组件
   * */
  return (
    <div>
      <ThemeButton theme={props.theme}></ThemeButton>
    </div>
  )
}

const App = () => {
  return (
    <Card title="Props 传参" style={{ marginBottom: 10 }}>
      <Toolbar theme="primary" />
    </Card>
  )
}
export default App;

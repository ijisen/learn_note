/**
 * 使用 context 就可以避免中间元素传递 props
 * */

import React, { useContext, useState } from "react";
import {
  Card,
  Button
} from "antd";

const btnTheme = {
  dark: {
    backgroundColor: '#f00'
  },
  light: {
    backgroundColor: '#0ff'
  }
}

const ThemeContext = React.createContext(btnTheme.dark)

const ThemeButton = () => {
  /**
   * 指定 contextType 读取当前的 theme context
   * React 会往上找到最近的 theme Provider， 然后直接使用它的值
   * */
    // hook 写法
  const contextType = useContext(ThemeContext);
  return (
    <div style={{ height: 100, ...contextType }}>Button</div>
  )
};

const Toolbar = () => {
  /**
   * Toolbar 组件接受一个额外的“theme”属性， 然后传递给 ThemeButton 组件。
   * 如果应用中每一个单独的按钮都需要知道 theme 的值， 这会是件麻烦的事情。
   * 因为必须将这个值层层传递给所有组件
   * */
  return (
    <ThemeButton />
  )
}

const App = () => {
  const [theme, setTheme] = useState('dark');

  const handleChangeTheme = () => {
    setTheme(theme === 'dark' ? 'light' : 'dark');
  }
  return (
    <Card title="Props 传参" style={{ marginBottom: 10 }}>
      <ThemeContext.Provider value={btnTheme[theme]}>
        <Button style={{marginBottom: 10}} onClick={handleChangeTheme}>Change Theme</Button>
        <Toolbar />
      </ThemeContext.Provider>
    </Card>
  )
}
export default App;

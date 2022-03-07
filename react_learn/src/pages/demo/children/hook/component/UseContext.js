/**
 * Hook useContext
 * const value = useContext(MyContext);
 * */

import React, { useState, useContext } from 'react';
import {
  Button,
  Card
} from 'antd';


const themes = {
  light: {
    color: '#f00',
    backgroundColor: '#ccc'
  },
  dark: {
    color: '#0ff',
    backgroundColor: '#0c0'
  }
}

const ThemeContext = React.createContext(themes);

function ThemeButton() {
  const theme = useContext(ThemeContext);
  return (
    <div style={{ ...theme, height: 100, fontSize: 18 }}>
      <p>ThemeButton</p>
    </div>
  )
}

const Example = () => {
  const [theme, setTheme] = useState('dark');
  const handleChangeTheme = () => {
    setTheme(theme === 'dark' ? 'light' : 'dark')
  }
  return (
    <ThemeContext.Provider value={themes[theme]}>
      <Card title="UseContext" bordered={true} style={{ width: 500, marginTop: 10 }}>
        <Button style={{marginBottom: 10}} onClick={handleChangeTheme}>切换主题</Button>
        <ThemeButton />
      </Card>
    </ThemeContext.Provider>
  );
}

export default Example;

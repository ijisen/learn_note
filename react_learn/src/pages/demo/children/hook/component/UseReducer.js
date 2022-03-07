/**
 * Hook useReducer
 * const [state, dispatch] = useReducer(reducer, initialArg, init);
 *
 * */

import React, { useEffect, useReducer } from 'react';
import {
  Typography,
  Button,
  Card
} from 'antd';

const { Text } = Typography;


const initFomData = {
  name: '',
  gender: '',
  age: 0
}

const todoReducer = (state, action) => {
  const { type, payload = {} } = action || {};
  switch (type) {
    case 'increment':
      return {
        ...state,
        age: state.age + 1
      };
    case 'decrement':
      return {
        ...state,
        age: state.age - 1
      };
    case 'patch':
      return {
        ...state,
        ...payload
      }
    default:
      return {
        ...initFomData
      };
  }
}


const Example = () => {
  // STATE HOOK
  // 声明一个新的叫做 “count” 的 state 变量
  // 自定义 HOOK
  // const [state, dispatch] = useReducer(reducer, initialState)
  const [formData, setFormData] = useReducer(todoReducer, initFomData)


  // EFFECT HOOK
  // 相当于 componentDidMount 和 componentDidUpdate:
  useEffect(() => {
    console.log('componentDidMount', 'componentDidUpdate');
    return () => {
      console.log('componentUnMount');
    }
  }, []);

  const { age, name } = formData;
  return (
    <Card title="useReducer" style={{ width: 500, marginTop: 10 }}>
      <div style={{ marginBottom: 10 }}>
        <Text type="success">Hello {name}; Your {age} times;</Text>
        <div style={{ marginTop: 10 }}>
          <Button type="primary"
                  style={{ marginRight: 10 }}
                  onClick={() => setFormData({ type: 'decrement' })}>decrement</Button>
          <Button type="primary"
                  style={{ marginRight: 10 }}
                  onClick={() => setFormData({ type: 'increment' })}>increment</Button>
          <Button type="primary"
                  style={{ marginRight: 10 }}
                  onClick={() => setFormData({ type: 'reset' })}>reset</Button>
          <Button type="primary"
                  style={{ marginRight: 10 }}
                  onClick={() => setFormData({ type: 'patch', payload: { name: 'Tom' } })}>patch</Button>
        </div>
      </div>
    </Card>
  );
}

export default Example;

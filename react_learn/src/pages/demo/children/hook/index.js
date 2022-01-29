/**
 * Hook 是 React 16.8 的新增特性。它可以让你在不编写 class 的情况下使用 state 以及其他的 React 特性。
 *      Hook 是一些可以让你在函数组件里“钩入” React state 及生命周期等特性的函数。
 * 【Hook 使用规则】
 *    规则校验插件： eslint-plugin-react-hooks
 *    1、只能在函数最外层调用 Hook。不要在循环、条件判断或者子函数中调用。
 *    2、只能在 React 的函数组件中调用 Hook。不要在其他 JavaScript 函数中调用。
 *
 * */

import React, { useEffect } from 'react';
import {
  Row,
  Col,
  Card
} from 'antd';
import UseStateComponent from "./component/UseState"
import UseReducerComponent from "./component/UseReducer"
import UseContextComponent from "./component/UseContext"

const Example = () => {

  // EFFECT HOOK
  // 相当于 componentDidMount 和 componentDidUpdate:
  useEffect(() => {
    console.log('componentDidMount', 'componentDidUpdate');
    return () => {
      console.log('componentUnMount');
    }
  }, []);

  return (
    <Card title="Hook">
      <Row>
        <Col>
          <UseStateComponent />
        </Col>
        <Col>
          <UseReducerComponent />
        </Col>
        <Col>
          <UseContextComponent />
        </Col>
      </Row>
    </Card>
  );
}

export default Example;

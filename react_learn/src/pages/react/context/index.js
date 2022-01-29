/**
 * Context
 *  Context 提供了一个无需为每层组件手动添加 props，就能在组件树间进行数据传递的方法。
 * */

/**
 *  【何时使用 Context】
 *      Context 设计目的是为了共享那些对于一个组件树而言是“全局”的数据，
 *      例如当前认证的用户、主题或首选语言。举个例子，在下面的代码中，我们通过一个 “theme” 属性手动调整一个按钮组件的样式：
 * */

import React, { useEffect } from "react";
import {
  Card, Col, Row
} from "antd";
import PropsComponent from "./components/props";
import ContextComponent from "./components/context";


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
    <Card title="React Context">
      <Row>
        <Col>
          <PropsComponent />
        </Col>
        <Col>
          <ContextComponent />
        </Col>
      </Row>
    </Card>
  );
}

export default Example;

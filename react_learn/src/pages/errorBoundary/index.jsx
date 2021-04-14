/**
 * 错误边界（Error Boundaries）
 * 错误边界是一种 React 组件，
 * 这种组件可以捕获并打印发生在其子组件树任何位置的 JavaScript 错误，
 * 并且，它会渲染出备用 UI，而不是渲染那些崩溃了的子组件树。
 * 错误边界在渲染期间、生命周期方法和整个组件树的构造函数中捕获错误。
 * */

import React, { useState } from "react";
import {
  Button
} from "antd"

class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      errorInfo: null
    }
  }

  // 捕获错误信息
  componentDidCatch(error, errorInfo) {
    this.setState({
      error: error,
      errorInfo: errorInfo
    })
  }

  render() {
    if (this.state.errorInfo) {
      // Error path
      return (
        <div>
          <h2>Something went wrong.</h2>
          <details style={{ whiteSpace: 'pre-wrap' }}>
            {this.state.error && this.state.error.toString()}
            <br/>
            {this.state.errorInfo.componentStack}
          </details>
        </div>
      )
    }
    return this.props.children;
  }
}

function BuggyCounter() {
  const [counter, setCounter] = useState(0);

  const handleClick = () => {
    // ps： 错误边界无法捕获事件处理器内部的错误。
    // throw new Error('I Click !')
    try {
      // 执行操作，如有错误则会抛出，但无法捕获
      // throw new Error('I Click !')
      setCounter(counter + 1)
    } catch (error) {
      // 无法捕获
      // throw new Error('I Click !')
    }
  }
  if (counter > 4) {
    throw new Error('I crashed !')
  }
  return (
    <Button type="primary" onClick={handleClick}>{counter}</Button>
  )
}

function Index() {
  return (
    <div>
      <p>
        <b>
          This is an example of error boundaries in React 16.
          <br/><br/>
          Click on the numbers to increase the counters.
          <br/>
          The counter is programmed to throw when it reaches 5. This simulates a JavaScript error in a component.
        </b>
      </p>
      <hr/>
      <ErrorBoundary>
        <p>These two counters are inside the same error boundary. If one crashes, the error boundary will replace both
          of them.</p>
        <BuggyCounter/>
        <BuggyCounter/>
      </ErrorBoundary>
      <hr/>
      <p>These two counters are each inside of their own error boundary. So if one crashes, the other is not
        affected.</p>
      <ErrorBoundary>
        <BuggyCounter/>
      </ErrorBoundary>
      <ErrorBoundary>
        <BuggyCounter/>
      </ErrorBoundary>
    </div>
  )
}

export default Index

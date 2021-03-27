import React from 'react'
import {createStore} from 'redux'
import {Button} from 'antd'

/**
 * 这是一个 reducer，形式为 (state, action) => state 的纯函数。
 * 描述了 action 如何把 state 转变成下一个 state。
 *
 * state 的形式取决于你，可以是基本类型、数组、对象、
 * 甚至是 Immutable.js 生成的数据结构。惟一的要点是
 * 当 state 变化时需要返回全新的对象，而不是修改传入的参数。
 *
 * 下面例子使用 `switch` 语句和字符串来做判断，但你可以写帮助类(helper)
 * 根据不同的约定（如方法映射）来判断，只要适用你的项目即可。
 */
function counter(state = 0, action) {
  switch (action.type) {
    case 'increment' :
      return state + 1;
    case 'decrement':
      return state - 1;
    default:
      return state
  }
}

// 创建 Redux store 来存放应用的状态。
// API 是 { subscribe, dispatch, getState }。
let store = createStore(counter);

class CreateStore extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    }
  }

  counter = (type) => {
    console.log(type);
    // 改变内部 state 惟一方法是 dispatch 一个 action。
    // action 可以被序列化，用日记记录和储存下来，后期还可以以回放的方式执行
    store.dispatch({
      type: type
    })
  };

  componentDidMount() {
    console.log(this.props)
    store.subscribe(() => {
      // 可以手动订阅更新，也可以事件绑定到视图层
      let _state = store.getState();
      this.setState({
        count: _state
      });
    });
  }

  render() {
    return (
      <div>
        <h1>CreateStore</h1>
        <p className="ptl pbl">{store.getState()}</p>
        <div>
          <Button className="mrl" icon="minus" onClick={this.counter.bind(this, 'decrement')}>decrement</Button>
          <Button className="mrl" icon="plus" onClick={this.counter.bind(this, 'increment')}>increment</Button>
          <Button onClick={this.counter.bind(this, 10)}>Dashed</Button>
        </div>
      </div>
    )
  }
}

export default CreateStore;

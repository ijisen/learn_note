React学习笔记

## React
- React 是一个用于构建用户界面的 JAVASCRIPT 库。
- React 主要用于构建UI，很多人认为 React 是 MVC 中的 V（视图）。
## React 特点
- 声明式设计 − React采用声明式设计，可以轻松描述应用。
- 高效 − React通过对DOM的模拟，最大限度地减少与DOM的交互。
- 灵活 − React可以与已知的库或框架很好地配合。
- 虚拟DOM - Virtual DOM。
    虚拟DOM可以分为两类
        DOM元素 DOM element =》 原生DOM元素
        组件元素 Component element =》自定义组件
- JSX − JSX 是 JavaScript 语法的扩展。React 开发不一定使用 JSX ，但我们建议使用它。
- 组件 − 通过 React 构建组件，使得代码更加容易得到复用，能够很好的应用在大项目的开发中。
- 单向响应的数据流 − React 实现了单向响应的数据流，从而减少了重复代码，这也是它为什么比传统数据绑定更简单。
    JSX：
        JavaScript 扩展语法
        规范1： JSX 用 () 括起来， 可以增强代码可读性，同时防止分号自动插入BUG
        eg: const _jsx = (<h1>hello</h1>);
    元素： 构成 React 应用的最小单位
        eg： const react = <h1>hello react</h1>;
    组件：
        组件声明方式：
            方式1：React.createClass
                eg: const Button = React.createClass({})
            方式2: ES6 classes
                eg: class Button extends Component {}; 
            方式3：无状态函数（stateless Function） 官方推荐的
                eg: const Button = (props) => {}; 
        组件的生命周期：
            componentWillReceiveProps【17.0 开始废弃】
            Mounting： 已插入真实DOM
                componentWillMount 组件挂载前【17.0 开始废弃】
                componentDidMount 组件挂载完成，此时才渲染DOM，获取DOM元素
            Updating： 正在被重新渲染
                componentWillUpdate【17.0 开始废弃】
                shouldComponentUpdate
                componentDidUpdate
            Unmounting：已移除真是DOM
                componentWillUnmount
                componentDidUnmount
        组件间通信：
            利用回调函数
            利用自定义事件机制
    State(状态)：
        React 把组件看成是一个状态机（State Machines）。通过与用户的交互，实现不同状态，然后渲染 UI，让用户界面和数据保持一致。
        React 里，只需更新组件的 state，然后根据新的 state 重新渲染用户界面（不要操作 DOM）。
        组件挂载前： UNSAFE_componentWillMount()
        组件挂载：   componentDidMount()
        组件接收到新的参数： UNSAFE_componentWillReceiveProps(object nextProps)
        组件判断是否需要重新渲染： shouldComponentUpdate(object nextProps, object nextState)
        组件更新前： componentWillUpdate(object nextProps, object nextState)
        组件更新：   componentDidUpdate(object prevProps, object prevState)
        组件卸载前： componentWillUnmount()
    Props:
        state 和 props 主要的区别在于 props 是不可变的，而 state 可以根据与用户交互来改变。
            这就是为什么有些容器组件需要定义 state 来更新和修改数据。 而子组件只能通过 props 来传递数据。
        Element.defaultProps 设置默认Props
        Element.propTypes prop 验证
            Props 验证使用 propTypes，它可以保证我们的应用组件被正确使用，React.PropTypes 提供很多验证器 (validator) 来验证传入数据是否有效。
            当向 props 传入无效数据时，JavaScript 控制台会抛出警告。
    OnClick :
    Keys: 标识符，可以在 DOM 中的某些元素被增加或删除的时候帮助 React 识别哪些元素发生了变化
    React 组件 API：
        设置状态 setState(object nextState[, function callback])
            nextState，将要设置的新状态，该状态会和当前的state合并
            callback，可选参数，回调函数。该函数会在setState设置成功，且组件重新渲染后调用。
            不能在组件内部通过this.state修改状态，因为该状态会在调用setState()后被替换。

            setState()并不会立即改变this.state，而是创建一个即将处理的state。setState()并不一定是同步的，为了提升性能React会批量执行state和DOM渲染。

            setState()总是会触发一次组件重绘，除非在shouldComponentUpdate()中实现了一些条件渲染逻辑。
        替换状态：replaceState(object nextState[, function callback])
            nextState，将要设置的新状态，该状态会替换当前的state。
            callback，可选参数，回调函数。该函数会在replaceState设置成功，且组件重新渲染后调用。
    class命名技巧：
        BEM规范:
            BLOCK: 对应模块名称：Dialog
            ELEMENT: 对应模块中的节点名称： button
            MODIFIER: 对应节点的状态： disabled || show || highlight
            eg: dialog__button--highlight

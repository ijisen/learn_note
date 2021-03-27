import React from 'react'
import {Icon} from 'antd'

class TodoList extends React.Component {
  state = {};

  componentDidMount() {
    const {subscribe, getState} = this.props;
    subscribe(() => {
      console.log(getState());
      this.setState({...getState()})
    });
  }

  render() {
    let todos = this.state.todos;
    console.log(this.props);
    console.log(this.state);
    console.log(todos);
    return (
      <ul>
        {todos && todos.length
          ? todos.map((todo, index) => {
            return (
              <li className="pts pbs plm" key={`todo-${index}`} onClick={(e) => this.props.click(index, e)}>
                {todo.select ? (<Icon type="heart" theme="twoTone" twoToneColor="#eb2f96"/>)
                  : (<Icon type="heart" theme="twoTone"/>)}
                <span className="pls">{todo.text} - {todo.select ? 'true' : 'false'}</span>
              </li>);
          })
          : "No todos, yay!"}
      </ul>
    )
  }
}

export default TodoList;

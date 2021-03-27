import React from 'react'
import { combineReducers, createStore } from 'redux'
import { Button } from 'antd'
import TodoList from './todoList.js'

function visibilityFilter(state = 'SHOW_ALL', action) {
  switch (action.type) {
    case 'SET_VISIBILITY_FILTER':
      return action.filter;
    default:
      return state
  }
}

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


function todos(state = [], action) {
  switch (action.type) {
    case 'ADD_TODO':
      return [
        ...state,
        {
          text: action.text,
          select: false
        }
      ];
    case 'COMPLETE_TODO':
      return state.map((todo, index) => {
        if (index === action.index) {
          let _obj = Object.assign({}, todo, {
            select: !todo.select
          });
          return _obj
        }
        return todo
      });
    case 'SELECT_ALL':
      return state.map((todo) => {
        return Object.assign({}, todo, {
          select: !todo.select
        })
      });
    default:
      return state
  }
}

let reducer = combineReducers({ visibilityFilter, counter, todos });

let store = createStore(reducer);

store.subscribe(() =>
  console.log(store.getState())
);
class Reducer extends React.Component {
  state = {
    id: 0
  };
  todoAdd = () => {
    console.log('todoAdd');
    let id = this.state.id + 1;
    this.setState({
      ...this.state,
      id: id
    });
    store.dispatch({
      type: 'ADD_TODO',
      text: 'ADD_TODO' + id
    });
    let { counter } = store.getState();
    console.log(counter);
    console.log(store.getState());
  };
  selectAll = () => {
    store.dispatch({
      type: 'SELECT_ALL'
    });
    console.log(store.getState());
  };
  select = (index) => {
    store.dispatch({
      type: 'COMPLETE_TODO',
      index
    });
    console.log(store.getState());
  };

  componentDidMount () {
    console.log(this.props)
  }
  render () {
    return (
      <div>
        <h1>reducer</h1>
        <div className="ptl">
          <Button className="mll" onClick={this.todoAdd}>ADD</Button>
          <Button className="mll" onClick={this.selectAll}>selectAll</Button>
          {/*<Button className="mll" onClick={this.select.bind(this, 0)}>select</Button>*/}
        </div>
        <div className="ptl">
          <TodoList {...store} click={this.select} />
        </div>
      </div>
    )
  }
}

export default Reducer;

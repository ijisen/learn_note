import React from "react";
import AddTodo from "./components/AddTodo";
import TodoList from "./components/TodoList";
import VisibilityFilters from "./components/VisibilityFilters";

class TodoApp extends React.Component {
  render () {
    console.log(this.props)
    return (
      <div className="todo-app">
        <h1 className="pbl">Todo List</h1>
        <AddTodo {...this.props} />
        <TodoList />
        <VisibilityFilters />
      </div>
    )
  }
}
export default TodoApp

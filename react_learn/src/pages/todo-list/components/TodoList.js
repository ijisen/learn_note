import React from "react";
import { connect } from "react-redux";
import Todo from "./Todo";
import { getTodos } from "@/store/selectors";
import { VISIBILITY_FILTERS } from "./constants";

const TodoList = ({ todos }) => (
  <ul className="todo-list ptl pbl">
    {todos && todos.length
      ? todos.map((todo, index) => {
        return <Todo key={`todo-${todo.id}`} todo={todo} />;
      })
      : "No todos, yay!"}
  </ul>
);

const mapStateToProps = state => {
  const { visibilityFilter } = state;
  const allTodos = getTodos(state);
  console.log(state);
  return {
    todos:
      visibilityFilter === VISIBILITY_FILTERS.ALL
        ? allTodos
        : visibilityFilter === VISIBILITY_FILTERS.COMPLETED
        ? allTodos.filter(todo => todo.completed)
        : allTodos.filter(todo => !todo.completed)
  };
};
export default connect(mapStateToProps)(TodoList);

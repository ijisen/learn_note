import React from "react";
import { connect } from "react-redux";
import { Icon  } from 'antd';
import { toggleTodo } from "@/store/actions";

const Todo = ({ todo, toggleTodo }) => (
  <li className="todo-item" onClick={() => toggleTodo(todo.id)}>
    {todo && todo.completed ? (
      <Icon type="check-circle" theme="twoTone" twoToneColor="#52c41a" />) :
      (
      <Icon type="check-circle" />)}{" "}
    <span
      className="bix"
    >
      {todo.content}
    </span>
  </li>
);

export default connect(
  null,
  { toggleTodo }
)(Todo);

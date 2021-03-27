/*
 * Action 修改store 唯一途径
 * action 类型
 */

const ADD_TODO = 'ADD_TODO';
const TOGGLE_TODO = 'TOGGLE_TODO';
const SET_FILTER = 'SET_FILTER';

let nextTodoId = 0;

export const addTodo = content => ({
  type: ADD_TODO,
  payload: {
    id: ++nextTodoId,
    content
  }
});

export const toggleTodo = id => ({
  type: TOGGLE_TODO,
  payload: {id}
});

export const setFilter = filter => ({
  type: SET_FILTER,
  payload: {filter}
});

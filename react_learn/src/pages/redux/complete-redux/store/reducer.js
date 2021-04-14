/**
 * ==============================================================
 * Reducer
 * Reducer 指定了应用状态的变化如何响应 actions 并发送到 store 的，
 *  actions 只是描述了有事情发生了这一事实，并没有描述应用如何更新 state。
 *  reducer 是纯函数
 *  PS: reducer  类似于 vuex 的 state
 * ============================================================== */

import { combineReducers } from 'redux';
import {
  ADD_TODO,
  TOGGLE_TODO,
  SET_VISIBILITY_FILTER,
  VisibilityFilters
} from './actionTypes';

const { SHOW_ALL } = VisibilityFilters;

function visibilityFilter(state = SHOW_ALL, action) {
  switch (action.type) {
    case SET_VISIBILITY_FILTER:
      return action.filter;
    default :
      return state
  }
}

function todos(state = [], action) {
  switch (action.type) {
    case ADD_TODO:
      const { id, content } = action.payload;
      return [
        ...state,
        {
          id,
          content,
          completed: false
        }
      ];
    case TOGGLE_TODO:
      return state.map((todo, index) => {
        if (index === action.index) {
          return Object.assign({}, todo, {
            completed: !todo.completed
          })
        }
        return todo;
      });
    default:
      return state
  }
}

const reducer = combineReducers({
  visibilityFilter,
  todos
});

export default reducer

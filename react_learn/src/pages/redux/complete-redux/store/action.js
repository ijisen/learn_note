/**
 * ==============================================================
 * Action
 * Action 是把数据从应用传到 store 的有效载荷。它是 store 数据的唯一来源。
 * 一般来说你会通过 store.dispatch() 将 action 传到 store。
 * Action 就是一个描述“发生了什么”的普通对象。
 *  eg: store.dispatch(addTodo(content))
 *  PS: Action  类似于 vuex 的 mutations, 用于操作 reducer 数据
 * ============================================================== */

import {
  ADD_TODO,
  TOGGLE_TODO,
  SET_VISIBILITY_FILTER
} from './actionTypes'

let nextTodoId = 0;

export function addTodo (content) {
  return {
    type: ADD_TODO,
    payload: {
      id: ++nextTodoId,
      content
    }

  }
}

export function toggleTodo (index) {
  return {
    type: TOGGLE_TODO,
    index
  }
}

export function setVisibilityFilter(filter) {
  return {
    type: SET_VISIBILITY_FILTER,
    filter
  }

}

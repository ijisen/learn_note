/**
 * ==============================================================
 * Store
 * store.getState() 获取state数据
 * store.dispatch(action) 更新state数据
 * store.subscribe(listener) 监听state更新
 * store.unsubscribe() 停止监听 state 更新
 * ============================================================== */

import { createStore } from 'redux';
import reducer from './reducer'

let store = createStore(reducer);

export default store;

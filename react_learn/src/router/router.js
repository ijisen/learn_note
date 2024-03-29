
import Home from '../pages/home';
import Welcome from '../pages/welcome';
import DomainTrIn from '../pages/dpp/DomainTrIn';

import TodoList from '../pages/todo-list';

// React 学习笔记
import ReactComponent from '../pages/react';
import Context from '../pages/react/context/index';

// redux 学习笔记
import Redux from '../pages/redux';
import CreateStore from '../pages/redux/create-store';
import Reducer from '../pages/redux/reducer'
import ErrorBoundary from '../pages/errorBoundary'
// 演示用例
import Demo from '../pages/demo';
import ES5 from '../pages/demo/children/es5';
import ES6 from '../pages/demo/children/es6';
import Hook from '../pages/demo/children/hook/index';

// 用户登录||注册
import User from '../pages/user';
import Login from '../pages/user/login';
import Register from '../pages/user/register';
import RegisterResult from '../pages/user/register-result';

import Pet from '../pages/pet'

import NoMatch from '../pages/404';

export default [
  {
    name: 'User',
    path: '/user',
    component: User,
    routes: [
      {
        path: '/user',
        exact: true,
        redirect: '/user/login',
        meta: {
          type: 'redirect'
        }
      },
      {
        name: 'Login',
        path: '/user/login',
        component: Login,
      },
      {
        name: 'Register',
        path: '/user/register',
        component: Register,
      },
      {
        name: 'RegisterResult',
        path: '/user/register-result',
        component: RegisterResult,
      },
      {
        path: '*',
        component: NoMatch
      }
    ]
  },
  {
    path: '/',
    component: Home,
    meta: {
      type: 'pageRoute',
      authority: ['admin', 'user']
    },
    routes: [
      {
        path: '/',
        exact: true,
        redirect: '/welcome',
        meta: {
          type: 'redirect',
        }
      },
      {
        name: 'Welcome',
        path: '/welcome',
        component: Welcome,
        meta: {
          type: 'page',
          icon: 'home'
        }
      },
      {
        name: 'DomainTrIn',
        path: '/domainTrIn',
        component: DomainTrIn,
        meta: {
          type: 'page',
          icon: 'vertical-align-bottom'
        }
      },
      {
        name: 'TodoList',
        path: '/todo-list',
        component: TodoList,
        meta: {
          type: 'page',
          icon: 'vertical-align-bottom'
        }
      },
      {
        name: 'Pets',
        path: '/pet',
        component: Pet,
        meta: {
          type: 'page',
          icon: 'reddit'
        }
      },
      {
        name: 'React',
        path: '/react',
        component: ReactComponent,
        meta: {
          type: 'pageRoute',
          icon: 'slack',
          desc: 'redux'
        },
        routes: [
          {
            name: '',
            path: '/react',
            exact: true,
            redirect: '/react/context',
            meta: {
              type: 'redirect'
            }
          },
          {
            name: 'Context',
            path: '/react/context',
            component: Context,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'slack'
            }
          },
          {
            name: 'Hook',
            path: '/react/hook',
            component: Hook,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'vertical-align-bottom'
            }
          }
        ]
      },
      {
        name: 'Redux',
        path: '/redux',
        component: Redux,
        meta: {
          type: 'pageRoute',
          icon: 'slack',
          desc: 'redux'
        },
        routes: [
          {
            name: '',
            path: '/redux',
            exact: true,
            redirect: '/redux/create-store',
            meta: {
              type: 'redirect'
            }
          },
          {
            name: 'CreateStore',
            path: '/redux/create-store',
            component: CreateStore,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'slack'
            }
          },
          {
            name: 'Reducer',
            path: '/redux/reducer',
            component: Reducer,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'slack'
            }
          }
        ]
      },
      {
        name: 'Demo',
        path: '/demo',
        component: Demo,
        meta: {
          type: 'pageRoute',
          icon: 'vertical-align-bottom',
          desc: '演示用例'
        },
        routes: [
          {
            name: '',
            path: '/demo',
            exact: true,
            redirect: '/demo/es5',
            meta: {
              type: 'redirect'
            }
          },
          {
            name: 'ES5',
            path: '/demo/es5',
            component: ES5,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'vertical-align-bottom'
            }
          },
          {
            name: 'ES6',
            path: '/demo/es6',
            component: ES6,
            meta: {
              type: 'page',
              requireAuth: false,
              icon: 'vertical-align-bottom'
            }
          },
        ]
      },
      {
        name: '错误边界',
        path: '/error-boundary',
        component: ErrorBoundary,
        meta: {
          type: 'page',
          icon: 'reddit'
        }
      },
      {
        name: 'Ref',
        path: '/ref',
        component:  require('../pages/ref').default,
        meta: {
          type: 'page',
          icon: 'reddit'
        }
      },
      {
        name: 'customHook',
        path: '/customHook',
        component:  require('../pages/customHook').default,
        meta: {
          type: 'page',
          icon: 'reddit'
        }
      },
      {
        path: '*',
        component: NoMatch
      }
    ]
  },
  {
    path: '*',
    component: NoMatch
  }
];


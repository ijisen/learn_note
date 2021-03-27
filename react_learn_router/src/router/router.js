import React from 'react';
import { renderRoutes } from "react-router-config";
import {
  BrowserRouter as Router,
  Switch
} from 'react-router-dom';
import asyncComponent from '../utils/asyncComponent'
import Root from '../App';
// import Home from asyncComponent(() => import("./home"))'../components/Home';
// import About from '../components/About';
// import About from './components/About'; // 导入About组件
// import Inbox from '../components/Inbox';
// import tab1 from "../components/Inbox-first";
// import tab2 from "../components/Inbox-second";
// import tab3 from "../components/Inbox-third";
// import NoMatch from '../components/NoMatch';
const Home = asyncComponent(() => import('../pages/Home'));
const About = asyncComponent(() => import('../pages/About'));
const Inbox = asyncComponent(() => import('../pages/Inbox'));
const tab1 = asyncComponent(() => import('../pages/Inbox-first'));
const tab2 = asyncComponent(() => import('../pages/Inbox-second'));
const tab3 = asyncComponent(() => import('../pages/Inbox-third'));
const NoMatch = asyncComponent(() => import('../pages/NoMatch'));
const routes = [
  {
    component: Root,
    routes: [
      {
        path: "/",
        exact: true,
        component: Home,
        meta: {
          name: 'Home'
        }
      },
      {
        path: "/about",
        exact: true,
        component: About,
        meta: {
          name: 'About'
        }
      },
      {
        path: "/inbox",
        component: Inbox,
        meta: {
          name: 'Inbox'
        },
        routes: [
          {
            path: "/",
            component: tab1
          },
          {
            path: "/inbox/tab1",
            component: tab1
          },
          {
            path: "/inbox/tab2/:id",
            component: tab2
          },
          {
            path: "/inbox/tab3",
            component: tab3
          },
          {
            path: '*',
            component: NoMatch,
            meta: {
              title: '404页面',
              pageType: 'redirect'
            }
          }
        ]
      },
      {
        path: "/404",
        component: NoMatch
      },
      {
        path: '*',
        component: NoMatch,
        meta: {
          title: '404页面',
          pageType: 'redirect'
        }
      }
    ]
  }
];

function RouteConfigExample() {
  return (
    <Router>
      <Switch>
        {/* renderRoutes(routes, extraProps, switchProps) */}
        {renderRoutes(routes)}
      </Switch>
    </Router>
  );
}
export default RouteConfigExample;

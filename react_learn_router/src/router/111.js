import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route
}from 'react-router-dom';

import Home from '../App';
import About from '../pages/About';
// import About from './components/About'; // 导入About组件
import Inbox from '../pages/Inbox';
import tab1 from "../pages/Inbox-first";
import tab2 from "../pages/Inbox-second";
import tab3 from "../pages/Inbox-third";
import NoMatch from '../pages/NoMatch';

const routes = [
  {
    path: "/",
    component: Home
  },
  {
    path: "/about",
    component: About
  },
  {
    path: "/inbox",
    component: Inbox,
    children: [
      {
        path: "/inbox/tab1",
        component: tab1
      },
      {
        path: "/inbox/tab2",
        component: tab2
      },
      {
        path: "/inbox/tab3",
        component: tab3
      },
    ]
  }
];

/*
function RouteWithSubRoutes(data, _routes) {
  data.map((route, index) => {
    _routes.push(<Route key={index} path={route.path} component={route.component} />);
    if (route.children && route.children.length) {
      RouteWithSubRoutes(route.children, _routes)
    }
  });
  return (_routes);
}*/
/*
function RouteConfigExample() {
  let _routes = [
    <Route key="1" exact path="/" component={Home} />,
    <Route key="2" path="/about" component={About} />,
    <Route key="3" path="/inbox" component={Inbox} />,
    <Route key="4" path="/inbox/tab1/:id" component={tab1} />,
    <Route key="5" path="/inbox/tab2/:id" component={tab2} />,
    <Route key="6" path="/inbox/tab3" component={tab3} />,
    <Route key="7" component={NoMatch} />
  ];
  _routes = RouteWithSubRoutes(routes, []);
  console.log(_routes)
  return (
    <Router><Switch>{RouteWithSubRoutes(routes, [])}</Switch></Router>
  );
}*/
/*
const BasicRoute = () => (
  <Router>
    <Switch>
      <Route exact path="/" component={App} />
      <Route path="/about" component={About} />
      <Route path="/inbox" component={Inbox} />
      <Route path="/inbox/tab1/:id" component={tab1} />
      <Route path="/inbox/tab2/:id" component={tab2} />
      <Route path="/inbox/tab3" component={tab3} />
      <Route component={NoMatch} />
    </Switch>
  </Router>
);*/
function RouteWithSubRoutes(route) {
  return (
    <Route
      path={route.path}
      render={props => (
        // pass the sub-routes down to keep nesting
        <route.component {...props} routes={route.children} />
      )}
    />
  );
}

function RouteConfigExample() {
  return (
    <Router>
      {routes.map((route, i) => (
        <RouteWithSubRoutes key={i} {...route} />
      ))}
    </Router>
  );
}
export default RouteConfigExample;

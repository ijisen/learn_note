import React from 'react';
import {
  BrowserRouter as Router,
} from "react-router-dom";

import routes from './router/router'

import './App.less';

import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'

class App extends React.Component {
  render() {
    return (
      <Router>
        <RouteWithSubRoutes routes={routes}/>
      </Router>
    )
  }
}

export default App;

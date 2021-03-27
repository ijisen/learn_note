import React, { Component } from 'react';
import { renderRoutes } from "react-router-config";

class App extends Component {
  render() {
    console.log(this.props)
    return (
      <div id="root">
        {renderRoutes(this.props.route.routes)}
      </div>
    );
  }
}

export default App;

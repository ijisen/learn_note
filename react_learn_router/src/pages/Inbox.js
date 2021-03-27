import React from 'react';
import { Button } from 'antd';
import {
  Link,
  Redirect
}from 'react-router-dom';
import { renderRoutes } from "react-router-config";
export default class Inbox extends React.Component {
  constructor (props) {
    super(props);
    this.state = {
      login: true
    }
  }
  componentWillMount () {
    console.log(111);
    /*this.props.history.push({
      pathname: `/404`,
      state: {
        from: this.props.location
      }
    });*/
    return false
  }
  render() {
    console.log(222)
    let arr = [
      <h1 key="1">1</h1>,
      <h1 key="2">5</h1>,
      <h1 key="3">2</h1>,
      <h1 key="4">3</h1>,
      <h1 key="5">4</h1>
    ]
    console.log(this.props);
    return !this.state.login ? (<Redirect to={{
      pathname: "/404",
      state: {
        from: this.props.location
      }
    }}/>) : (
      <div className="App">
        <Button type="primary" onClick={() => this.props.history.push('/')}>Button</Button>
        <div>
          <Button onClick ={ () => {
            console.log(`${this.props.match.url}/tab1`);
            this.props.history.push({
              pathname: `${this.props.match.url}/tab1`,
              state: {
                id: 2
              },
              search: '?id=search-string',
            });
            console.log(this.props.history)
          }}>App</Button>
          <Link to={`${this.props.match.url}/tab2/9`}>App</Link>
          <Link to={{
            pathname: `${this.props.match.url}/tab2`,
            state: { id: 20 }
          }}>App</Link>
          <Link to="/inbox/tab3">App</Link>
          {arr}
          {/* renderRoutes(routes, extraProps, switchProps) */}
          {renderRoutes(this.props.route.routes, { someProp: "these extra props are optional" })}
        </div>
      </div>
    );
  }
}

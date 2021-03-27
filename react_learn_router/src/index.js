/** 入口文件配置 */

import React from 'react';
import ReactDOM from 'react-dom';
import './layouts/global.less';
import './layouts/theme.less';
import Router from './router/router';
import * as serviceWorker from './serviceWorker';

/*ReactDOM.render((
  <Router>
    <Route path="/" component={App} />
  </Router>
), document.getElementById('root'))*/

/*export default class Hello extends Component{
  render(){
    return (
      <Router>
        <Route exact path="/" component={App} />
        <Route path="/Inbox" component={Inbox} />
      </Router>
    )
  }
}*/

ReactDOM.render(<Router />, document.getElementById('app'));
// ReactDOM.render(<Router />, document.getElementsByTagName('body')[0]);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();

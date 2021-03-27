import React from "react";
import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'
import './index.less';
class User extends React.Component {
  render () {
    return (
      <div className="user-content">
        <RouteWithSubRoutes routes={this.props.routes}/>
      </div>
    );
  }
}
export default User

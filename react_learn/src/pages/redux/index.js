import React from 'react'
import { PageHeader } from 'antd';
import { queryUserInfo } from '@/services';
import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'
export default class Redux extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      data: []
    }
  }

  UNSAFE_componentWillMount(){
    queryUserInfo().then(res => {
      console.log(res);
    })
    .catch((err) => {
      console.log(err);
    })
  }

  render(){
    return(
      <div>
        <PageHeader
          style={{
            padding: 0,
          }}
          title="Redux 学习笔记"
        />

        <RouteWithSubRoutes routes={this.props.routes}/>
      </div>
    )
  }
}

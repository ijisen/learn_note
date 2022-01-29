import React from 'react'
import { PageHeader } from 'antd';
import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'
export default class Redux extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      data: []
    }
  }

  UNSAFE_componentWillMount(){

  }

  render(){
    return(
      <div>
        <PageHeader
          style={{
            padding: 0,
          }}
          title="React 学习笔记"
        />

        <RouteWithSubRoutes routes={this.props.routes}/>
      </div>
    )
  }
}

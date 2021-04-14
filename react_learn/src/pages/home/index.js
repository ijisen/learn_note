import React from 'react';

import {
  Layout,
  Icon
} from 'antd';
import LeftNavbar from './LeftNavbar'
import RouteWithSubRoutes from '../../commponents/RouteWithSubRoutes'

const {Header, Content, Sider} = Layout;

class App extends React.Component {
  constructor(props) {
    super(props);
    console.log(this.props);
    this.state = {
      collapsed: false,
    };
  }

  // 导航栏缩放
  toggle = () => {
    this.setState({
      collapsed: !this.state.collapsed,
    });
  };


  render() {

    return (
      <Layout style={{
        height: '100%'
      }}>
        <Sider trigger={null} collapsible collapsed={this.state.collapsed}>
          <div className="logo"/>
          <LeftNavbar data={this.props.routes} location={this.props.location} history={this.props.history}/>
        </Sider>
        <Layout>
          <Header style={{background: '#fff', padding: 0}}>
            <Icon
              className="trigger"
              type={this.state.collapsed ? 'menu-unfold' : 'menu-fold'}
              style={{
                fontSize: '18px',
                lineHeight: '64px',
                padding: '0 24px',
                cursor: 'pointer',
                transition: 'color 0.3s'
              }}
              onClick={this.toggle}
            />
          </Header>
          <Content style={{
            margin: '15px',
            padding: '15px',
            minHeight: 'initial',
            backgroundColor: '#fff'
          }}>
            <RouteWithSubRoutes routes={this.props.routes}/>
          </Content>
        </Layout>
      </Layout>
    )
  }
}

export default App;

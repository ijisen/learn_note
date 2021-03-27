import React, { Component } from 'react';
import { Link }from 'react-router-dom';
import { Layout, Menu, Button } from 'antd';
const { Header, Content } = Layout;
class App extends Component {
  constructor (props) {
    super(props);
    this.state = {
      classContent : {
        padding: '20px',
        textAlign: 'center'
      },
      mrl: {
        marginRight: '20px'
      }
    }
  }
  render() {
    return (
      <Layout>
        <Header>
          <Menu
            theme="dark"
            mode="horizontal"
            defaultSelectedKeys={['2']}
            style={{ lineHeight: '64px' }}>
            <Menu.Item key="1"><Link to="/">App</Link></Menu.Item>
            <Menu.Item key="2"><Link to="/About">About</Link></Menu.Item>
            <Menu.Item key="3"><Link to="/Inbox">Inbox</Link></Menu.Item>
          </Menu>
        </Header>
        <Content style={this.state.classContent}>
          <Button style={this.state.mrl} type="primary"><Link to="/">App</Link></Button>
          <Button style={this.state.mrl} type="primary"><Link to="/About">About</Link></Button>
          <Button style={this.state.mrl} type="primary"><Link to="/Inbox">Inbox</Link></Button>
        </Content>
      </Layout>
    );
  }
}

export default App;

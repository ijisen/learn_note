/**
 ==============================================================
 Theme Name:  左侧菜单配置
 Description:  左侧菜单配置
 Author:  jisen
 Edit Time: 2019-08-20
 ============================================================== */

import React from "react";
import {
  Icon,
  Menu
} from "antd";

const {SubMenu} = Menu;

function buildMenuData(data) {
  let _menu = [];
  data = data || [];
  for (let i = 0, len = data.length; i < len; i++) {
    let item = data[i];
    let _meta = item.meta || {};
    if (_meta.type === 'page') {
      _menu.push(
        <Menu.Item key={i}>
          <Icon type={item.meta.icon}/>
          <span>{item.name}</span>
        </Menu.Item>
      )
    } else if (_meta.type === 'pageRoute') {
      let _child = item.routes || [];
      let _child_len = _child.length;
      let _child_menu = [];
      if (_child && _child_len) {
        for (let k = 0; k < _child_len; k++) {
          let _child_item = _child[k];
          let _child_id = `${i}-${k}`;
          if (_child_item.meta && _child_item.meta.type === 'page') {
            _child_menu.push(
              <Menu.Item key={_child_id}>
                <Icon type={_child_item.meta.icon}/>
                <span>{_child_item.name}</span>
              </Menu.Item>
            )
          }
        }
        _menu.push(
          <SubMenu
            key={i}
            title={
              <span>
                <Icon type={item.meta.icon}/>
                <span>{item.name}</span>
              </span>
            }
          >
            {_child_menu}
          </SubMenu>
        );
      }
    }
  }
  return _menu;
}

class LeftNavbar extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      selectedNav: ['0']
    }
  }

  // 菜单切换
  handleChangeNav = ({item, key, keyPath, domEvent}) => {
    let _key_path = key && key.split('-');
    let _item = null;
    if (_key_path && _key_path.length) {
      let _len = _key_path.length;
      if (_len === 1) {
        _item = this.props.data[_key_path[0]]
      } else if (_len === 2) {
        _item = this.props.data[_key_path[0]];
        _item = _item.routes[_key_path[1]]
      }
    }
    if (_item) {
      this.props.history.push(_item.path)
    }
  };

  // 页面打开时，自动获取菜单焦点
  autoSelectNavBar() {
    console.log(this.props);
    /*let _path = this.props.location.pathname;
    console.log(_path);
    let _nav = this.props.data.find(item => item.id === _path);
    console.log(_nav);
    if (_nav) {
      this.selectedNav = [_nav.key];
    }*/
  }

  // 组件渲染前调用
  UNSAFE_componentWillMount() {
    console.log('component will mount');
    this.autoSelectNavBar();
  };

  render() {
    let _menu = buildMenuData(this.props.data);
    return (
      <Menu theme="dark" mode="inline"
            defaultSelectedKeys={this.state.selectedNav} onClick={this.handleChangeNav}>
        {_menu}
      </Menu>
    )
  }
}

export default LeftNavbar;

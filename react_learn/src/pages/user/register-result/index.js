import React from "react";
import {
  Result,
  Button
} from "antd";

export default class RegisterResult extends React.Component {
  render () {
    let { state } = this.props.location;
    console.log(state)
    return (<Result
      status="success"
      title={`你的账户：${state.account} 注册成功`}
      subTitle="激活邮件已发送到你的邮箱中，邮件有效期为24小时。请及时登录邮箱，点击邮件中的链接激活帐户。"
      extra={[
        <Button type="primary" key="console">查看邮箱</Button>,
        <Button key="buy">返回首页</Button>,
      ]}
    />)
  }
}

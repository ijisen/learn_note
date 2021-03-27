import React from "react";
import {
  Row,
  Col,
  Form,
  Icon,
  Input,
  Button,
  Checkbox,
  Tabs
} from 'antd';
import './index.less'

const {TabPane} = Tabs;

class LoginForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      disabled: false,
      submitting: false,
      formData: {
        username: 'aa.cn',
        password: '123456',
        cellPhone: '789456',
        captcha: 8451,
        admin: 8563,
        tech: 8641,
        billing: 8566
      },
      res_msg: {
        type: '',
        msg: ''
      },
    }
  }

  handleSubmit = e => {
    e.preventDefault();
    this.props.form.validateFields((err, values) => {
      if (!err) {
        console.log(values)
      }
    })
  };

  callbackd = (key) => {
    console.log(key);
  };

  render() {
    const {getFieldDecorator} = this.props.form;
    return (
      <div className="login-form">
        <header>
          <p className="logo">&nbsp;</p>
          <span className="title">企业数字资产管理平台</span>
        </header>
        <div className="login-form-content">
          <Form onSubmit={this.handleSubmit}>
          <Tabs defaultActiveKey="credentials" onChange={this.callbackd}>
            <TabPane tab="账户密码登录" key="credentials">
              <Form.Item>
                {getFieldDecorator('username', {
                  rules: [{required: true, message: '请输入用户名!'}],
                })(
                  <Input size="large"
                         prefix={<Icon type="user" style={{color: 'rgba(0,0,0,.25)'}}/>}
                         placeholder="用户名"
                  />,
                )}
              </Form.Item>
              <Form.Item>
                {getFieldDecorator('password', {
                  rules: [{required: true, message: '请输入密码！'}],
                })(
                  <Input size="large"
                         prefix={<Icon type="lock" style={{color: 'rgba(0,0,0,.25)'}}/>}
                         type="password"
                         placeholder="密码"
                  />,
                )}
              </Form.Item>
              <Form.Item>
                {getFieldDecorator('cellPhone', {
                  rules: [{required: true, message: '请输入手机号！'}],
                })(
                  <Input size="large"
                         prefix={<Icon type="mobile" style={{color: 'rgba(0,0,0,.25)'}}/>}
                         placeholder="手机号"
                  />,
                )}
              </Form.Item>
              <Form.Item>
                <Row>
                  <Col span={16}>
                    {getFieldDecorator('captcha', {
                      rules: [{required: true, message: '请输入验证码！'}],
                    })(
                      <Input size="large"
                             prefix={<Icon type="mail" style={{color: 'rgba(0,0,0,.25)'}}/>}
                             placeholder="验证码"
                      />,
                    )}
                  </Col>
                  <Col span={8} className="plm">
                    <Button size="large" block>获取验证码</Button>
                  </Col>
                </Row>
              </Form.Item>
            </TabPane>
            <TabPane tab="手机验证码登录" key="captcha">
              <Form.Item>
                {getFieldDecorator('cellPhone', {
                  rules: [{required: true, message: '请输入手机号！'}],
                })(
                  <Input size="large"
                         prefix={<Icon type="mobile" style={{color: 'rgba(0,0,0,.25)'}}/>}
                         placeholder="手机号"
                  />,
                )}
              </Form.Item>
              <Form.Item>
                <Row>
                  <Col span={16}>
                    {getFieldDecorator('captcha', {
                      rules: [{required: true, message: '请输入验证码！'}],
                    })(
                      <Input size="large"
                             prefix={<Icon type="mail" style={{color: 'rgba(0,0,0,.25)'}}/>}
                             placeholder="验证码"
                      />,
                    )}
                  </Col>
                  <Col span={8} className="plm">
                    <Button size="large" block>获取验证码</Button>
                  </Col>
                </Row>
              </Form.Item>
            </TabPane>
          </Tabs>
            <Form.Item>
              <Row>
                <Col span={18} className="text-lf">
                  {getFieldDecorator('自动登录', {
                    valuePropName: 'checked',
                    initialValue: true,
                  })(<Checkbox>自动登录</Checkbox>)}
                </Col>
                <Col span={6} className="text-rt">
                  <span className="color-info">忘记密码</span>
                </Col>
              </Row>
            </Form.Item>

            <Form.Item>
              <Row>
                <Col span={24}>
                  <Button type="primary" htmlType="submit" block size="large">
                    登录
                  </Button>
                </Col>
                <Col span={24} className="text-rt"><span className="color-info">注册账户!</span></Col>
              </Row>
            </Form.Item>
          </Form>
        </div>
      </div>

    );
  }
}

const Login = Form.create({name: 'normal_login'})(LoginForm);

export default Login

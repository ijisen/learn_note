import {
  Button,
  Col,
  Form,
  Input,
  Popover,
  Progress,
  Row,
  Select,
  message
} from 'antd';
import React, {Component} from 'react';
import {Link} from 'react-router-dom'
import './style.less';

const FormItem = Form.Item;
const {Option} = Select;
const InputGroup = Input.Group;
const passwordStatusMap = {
  ok: (
    <div className="success">
      <p>强度：强</p>
    </div>
  ),
  pass: (
    <div className="warning">
      <p>强度：中</p>
    </div>
  ),
  poor: (
    <div className="error">
      <p>强度：太短</p>
    </div>
  ),
};
const passwordProgressMap = {
  ok: 'success',
  pass: 'normal',
  poor: 'exception',
};

class UserRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      submitting: false,
      count: 0,
      confirmDirty: false,
      visible: false,
      help: '',
      userRegister: {
        status: ''
      },
      formData: {
        email: '4123@qq.cn',
        password: '123456',
        confirmPassword: '123456',
        prefix: '86',
        mobile: '12345678912',
        captcha: '4123'
      }
    };
    this.interval = undefined;
  }

  componentDidUpdate = () => {
    const {form} = this.props;
    const {userRegister} = this.state;
    const account = form.getFieldValue('email');

    if (userRegister.status === 'ok') {
      message.success('注册成功！');
      this.props.history.push({
        pathname: '/user/register-result',
        state: {
          account,
        },
      });
    }
  };

  componentWillUnmount = () => {
    clearInterval(this.interval);
  };

  onGetCaptcha = () => {
    let count = 59;
    this.setState({
      count,
    });
    this.interval = window.setInterval(() => {
      count -= 1;
      this.setState({
        count,
      });

      if (count === 0) {
        clearInterval(this.interval);
      }
    }, 1000);
  };

  getPasswordStatus = () => {
    const {form} = this.props;
    const value = form.getFieldValue('password');

    if (value && value.length > 9) {
      return 'ok';
    }

    if (value && value.length > 5) {
      return 'pass';
    }

    return 'poor';
  };

  handleSubmit = e => {
    e.preventDefault();
    const {form} = this.props;
    console.log(this.props);
    form.validateFields(
      {
        force: true,
      },
      (err, values) => {
        if (!err) {
          let _success = Math.random();
          console.log({...values, prefix: this.state.formData.prefix});
          if (_success > 0.5) {
            this.setState({
              userRegister: {
                status: 'ok'
              }
            })
          } else {
            this.setState({
              userRegister: {
                status: 'error'
              }
            })
          }
        }
      },
    );
  };
  checkConfirm = (rule, value, callback) => {
    const {form} = this.props;

    if (value && value !== form.getFieldValue('password')) {
      callback('两次输入的密码不匹配');
    } else {
      callback();
    }
  };
  checkPassword = (rule, value, callback) => {
    const {visible, confirmDirty} = this.state;

    if (!value) {
      this.setState({
        help: '请输入密码！',
        visible: !!value,
      });
      callback('error');
    } else {
      this.setState({
        help: '',
      });

      if (!visible) {
        this.setState({
          visible: !!value,
        });
      }

      if (value.length < 6) {
        callback('error');
      } else {
        const {form} = this.props;

        if (value && confirmDirty) {
          form.validateFields(['confirm'], {
            force: true,
          });
        }

        callback();
      }
    }
  };
  changePrefix = value => {
    this.setState({
      formData: {
        ...this.state.formData,
        prefix: value
      }
    });
  };
  renderPasswordProgress = () => {
    const {form} = this.props;
    const value = form.getFieldValue('password');
    const passwordStatus = this.getPasswordStatus();
    return value && value.length ? (
      <div className={`progress-${passwordStatus}`}>
        <Progress
          status={passwordProgressMap[passwordStatus]}
          className="progress"
          strokeWidth={6}
          percent={value.length * 10 > 100 ? 100 : value.length * 10}
          showInfo={false}
        />
      </div>
    ) : null;
  };

  render() {
    const {form} = this.props;
    const {getFieldDecorator} = form;
    const {count, help, visible, formData, submitting} = this.state;
    return (
      <div className="main">
        <h3>
          注册
        </h3>
        <Form onSubmit={this.handleSubmit}>
          <FormItem>
            {getFieldDecorator('email', {
              initialValue: formData.email,
              rules: [
                {
                  required: true,
                  message: '请输入邮箱地址！',
                },
                {
                  type: 'email',
                  message: '邮箱地址格式错误！',
                },
              ],
            })(
              <Input
                size="large"
                placeholder="邮箱"
              />,
            )}
          </FormItem>
          <FormItem help={help}>
            <Popover
              getPopupContainer={node => {
                if (node && node.parentNode) {
                  return node.parentNode;
                }

                return node;
              }}
              content={
                <div
                  style={{
                    padding: '4px 0',
                  }}
                >
                  {passwordStatusMap[this.getPasswordStatus()]}
                  {this.renderPasswordProgress()}
                  <div
                    style={{
                      marginTop: 10,
                    }}
                  >
                    <p>请至少输入 6 个字符。请不要使用容易被猜到的密码。</p>
                  </div>
                </div>
              }
              overlayStyle={{
                width: 240,
              }}
              placement="right"
              visible={visible}
            >
              {getFieldDecorator('password', {
                initialValue: formData.password,
                rules: [
                  {
                    validator: this.checkPassword,
                  },
                ],
              })(
                <Input
                  size="large"
                  type="password"
                  placeholder="至少6位密码，区分大小写"
                />,
              )}
            </Popover>
          </FormItem>
          <FormItem>
            {getFieldDecorator('confirm', {
              initialValue: formData.confirmPassword,
              rules: [
                {
                  required: true,
                  message: "请确认密码！",
                },
                {
                  validator: this.checkConfirm,
                },
              ],
            })(
              <Input
                size="large"
                type="password"
                placeholder="确认密码"
              />,
            )}
          </FormItem>
          <FormItem>
            <InputGroup compact>
              <Select
                size="large"
                value={formData.prefix}
                onChange={this.changePrefix}
                style={{
                  width: '20%',
                }}
              >
                <Option value="86">+86</Option>
                <Option value="87">+87</Option>
              </Select>
              {getFieldDecorator('mobile', {
                initialValue: formData.mobile,
                rules: [
                  {
                    required: true,
                    message: "请输入手机号！",
                  },
                  {
                    pattern: /^\d{11}$/,
                    message: "手机号格式错误！",
                  },
                ],
              })(
                <Input
                  size="large"
                  style={{
                    width: '80%',
                  }}
                  placeholder="手机号"
                />,
              )}
            </InputGroup>
          </FormItem>
          <FormItem>
            <Row gutter={8}>
              <Col span={16}>
                {getFieldDecorator('captcha', {
                  initialValue: formData.captcha,
                  rules: [
                    {
                      required: true,
                      message: "请输入验证码！",
                    },
                  ],
                })(
                  <Input
                    size="large"
                    placeholder="验证码"
                  />,
                )}
              </Col>
              <Col span={8}>
                <Button
                  size="large"
                  disabled={!!count}
                  className="getCaptcha"
                  onClick={this.onGetCaptcha}
                >
                  {count
                    ? `${count} s`
                    : "获取验证码"}
                </Button>
              </Col>
            </Row>
          </FormItem>
          <FormItem>
            <Button
              size="large"
              loading={submitting}
              className="submit"
              type="primary"
              htmlType="submit"
            >
              注册
            </Button>
            <Link className="login" to="/user/login">
              其他登录方式
            </Link>
          </FormItem>
        </Form>
      </div>
    );
  }
}

export default Form.create({name: 'user_register'})(UserRegister);

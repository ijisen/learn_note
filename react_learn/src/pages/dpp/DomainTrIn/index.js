import React from "react";
import axios from '../../../axios';
import {
  Form,
  Input,
  Select,
  Checkbox,
  Button,
  Typography,
  PageHeader
} from 'antd';
import UserRemoteSelect from "./userSelect";

const {Option} = Select;
const {Text} = Typography;

class MessageFeedback extends React.Component {
  render () {
    const buildTextType = () => {
      console.log(this.props);
      let _type = this.props.data.type;
      switch (_type) {
        case 'error':
          _type = 'danger';
          break;
        default:
          _type = 'secondary'
      }
      return _type
    };
    return (
      <p><Text type={buildTextType()}>{ this.props.data.msg }</Text></p>
    )
  }
}

class RegistrationForm extends React.Component {
  constructor (props) {
    super(props);
    this.state = {
      disabled: false,
      submitting: false,
      registrantData: [],
      formData: {
        domainName: 'aa.cn',
        authInfo: '123456',
        registrantAuthInfo: '789456',
        registrant: 8451,
        admin: 8563,
        tech: 8641,
        billing: 8566
      },
      res_msg: {
        type: '',
        msg: ''
      }
    };
  }


  handleSubmit = e => {
    e.preventDefault();
    this.props.form.validateFieldsAndScroll((err, values) => {
      if (!err) {
        console.log(values);
        this.setState({
          submitting: true,
          disabled: true,
          res_msg: {
           type: 'loading',
           msg: '提交中...'
          }
        });
        setTimeout(() => {
          let _success = Math.random() > 0.5;
          this.setState({
            submitting: false,
            disabled: _success,
            res_msg: {
              type: _success ? 'success' : 'error',
              msg: _success ? '提交成功' : '提交失败'
            }
          });
          console.log(this.state.disabled);
          console.log(this.state.submitting)
        }, 2000);
      }
    });
  };

  handleValidateDomain = (e) => {
    e.preventDefault();
    const {validateFields} = this.props.form;
    validateFields(['domainName'], (err, value) => {
      console.log(err);
      console.log(value);
    });
  };

  handleValidateDomainErr = (e) => {
    e.preventDefault();
    const {validateFields, setFields} = this.props.form;
    validateFields(['domainName'], (err, value) => {
      console.log(err);
      console.log(value);
      setFields({
        domainName: {
          value: value.domainName,
          errors: [new Error('该域名不可转入')],
        },
      });
    });
  };

  // 域名格式校验
  validateDomainName = (rule, value, callback) => {
    const reg = /^[a-zA-Z0-9\u4E00-\u9FA5][-a-zA-Z0-9\u4E00-\u9FA5]{0,62}\.[a-zA-Z0-9\u4E00-\u9FA5][-a-zA-Z0-9\u4E00-\u9FA5]{0,62}$/;
    if (reg.test(value)) {
      callback()
    } else {
      callback(`请输入有效的域名`)
    }
  };

  // 获取用户信息
  getContactTemplate() {
    axios.get('dpp/contactTemplate/getTemplateListByUserId', {
      params: {
        userId: 2,
        userName: 'jingdong'
      }
    })
    .then((res) => {
      let resData = [];
      if (res && res.status === 'success') {
        resData = res.result;
      }
      this.setState({
        registrantData: resData
      });
      console.log(res)
    })
    .catch((err) => {
      this.setState({
        registrantData: []
      });
      console.log(err)
    })
  }

  // 组件挂载前
  UNSAFE_componentWillMount() {
    this.getContactTemplate();
  }

  render() {
    let {getFieldDecorator} = this.props.form;
    const {formData} = this.state;

    const formItemLayout = {
      labelCol: {
        xs: {span: 24},
        sm: {span: 8},
      },
      wrapperCol: {
        xs: {span: 24},
        sm: {span: 16},
      },
    };
    const tailFormItemLayout = {
      wrapperCol: {
        xs: {
          span: 24,
          offset: 0,
        },
        sm: {
          span: 16,
          offset: 8,
        },
      },
    };
    let _option = [];
    this.state.registrantData.map((item) =>
      _option.push(
        <Option value={item.id} key={item.id}>{item.contactName}</Option>
      )
    );

    const filterOption = (input, option) => {
      return option.props.children.toLowerCase().indexOf(input.toLowerCase()) >= 0
    };

    if (this.state.disabled) {
      getFieldDecorator = (...rest) => {
        return element => {
          let NewElement = React.cloneElement(element, {
            disabled: true
          });
          return this.props.form.getFieldDecorator(...rest)(NewElement);
        };
      };
    }
    return (
      <div>
        <PageHeader title="域名转入" style={{
          marginBottom: '20px',
          paddingLeft: 0,
          paddingTop: 0,
          borderBottom: '1px solid #d8d8d8'
        }} />
        <Form {...formItemLayout} onSubmit={this.handleSubmit} style={{
          width: '600px'
        }}>

          <Form.Item label="域名" hasFeedback>
            {getFieldDecorator('domainName', {
              initialValue: formData.domainName,
              rules: [
                {
                  message: '请输入需要转入的域名！',
                },
                {
                  required: true,
                  validator: this.validateDomainName,
                },
              ],
            })(<Input autoComplete="off"/>)}
          </Form.Item>

          <Form.Item label="域名密码" hasFeedback>
            {getFieldDecorator('authInfo', {
              initialValue: formData.authInfo,
              rules: [
                {
                  required: true,
                  message: '请输入域名密码!',
                }
              ],
            })(<Input.Password/>)}
          </Form.Item>

          <Form.Item label="注册联系人密码" hasFeedback extra={(
            <Text type="danger">BANK域名转入需要输入原注册联系人的密码.</Text>
          )}>
            {getFieldDecorator('registrantAuthInfo', {
              initialValue: formData.registrantAuthInfo,
              rules: [
                {
                  required: true,
                  message: '请输入注册联系人密码!'
                }
              ],
            })(<Input.Password/>)}
          </Form.Item>

          {
            false && (
              <Form.Item label="所属会员">
                <UserRemoteSelect/>
              </Form.Item>)
          }

          <Form.Item label="Registrant">
            {getFieldDecorator('registrant', {
              initialValue: formData.registrant,
              rules: [
                {required: true, message: '请选择联系人!'}
              ],
            })(<Select showSearch filterOption={filterOption}>
              {_option}
            </Select>)}
          </Form.Item>

          <Form.Item label="Admin">
            {getFieldDecorator('admin', {
              initialValue: formData.admin,
              rules: [
                {required: true, message: '请选择联系人!'}
              ],
            })(<Select showSearch filterOption={filterOption}>
              {_option}
            </Select>)}
          </Form.Item>

          <Form.Item label="Tech">
            {getFieldDecorator('tech', {
              initialValue: formData.tech,
              rules: [
                {required: true, message: '请选择联系人!'}
              ],
            })(<Select showSearch filterOption={filterOption}>
              {_option}
            </Select>)}
          </Form.Item>

          <Form.Item label="Billing">
            {getFieldDecorator('billing', {
              initialValue: formData.billing,
              rules: [
                {required: true, message: '请选择联系人!'},
              ],
            })(<Select showSearch filterOption={filterOption}>
              {_option}
            </Select>)}
          </Form.Item>
          <Form.Item {...tailFormItemLayout} required>
            {getFieldDecorator('agreement', {
              valuePropName: 'checked',
              rules: [
                {required: true, message: '请同意条款!'},
              ]
            })(
              <Checkbox>
                I have read the <a href="/domainTrIn">agreement</a>
              </Checkbox>
            )}
          </Form.Item>
          <Form.Item {...tailFormItemLayout}>
            {this.state.res_msg.type && (<MessageFeedback data={this.state.res_msg} />)}
            <Button type="primary"
                    htmlType="submit"
                    disabled={this.state.disabled && !this.state.submitting}
                    loading={this.state.submitting}>Register</Button>
            <Button onClick={this.handleValidateDomain} disabled={this.state.disabled}>Domain Validate</Button>
            <Button onClick={this.handleValidateDomainErr} disabled={this.state.disabled}>Domain Error</Button>
          </Form.Item>
        </Form>
      </div>
    );
  }
}

const DomainTrIn = Form.create({name: 'register'})(RegistrationForm);
export default DomainTrIn;

import React from 'react';
import {
  Form,
  Input,
  Button,
  Select
} from 'antd';

const {Option} = Select;

class PetForm extends React.Component {
  state = {
    formData: {
      gener: '1',
      first: 0,
      second: 0,
      growthRate: 0
    }
  };

  total({first = 1, second = 1, age = 8} = {}) {
    var a = (96.4 - 0.0035 * first) * age + 0.2886 * first - 26.26;
    var b = (96.4 - 0.0035 * second) * age + 0.2886 * second - 26.26;
    let point = a / 1698 * 66.7 + b / 1693 * 33.3;
    if (point > 94) {
      // 95~100：优秀；
      return `优秀 ${point}`
    } else if (point > 90) {
      // 91~94：良好
      return `良好 ${point}`
    } else if (point > 87) {
      // 87~90：及格
      return `及格 ${point}`
    } else {
      // <87：差；不想放生可以放仙府*/
      return `差 ${point}`
    }
  };

  handleSubmit = (e) => {
    e.preventDefault();
    this.props.form.validateFields((err, vaules) => {
      if (!err) {
        console.log(vaules);
      }
    })
  };
  handleReset = () => {
    this.props.form.resetFields();
  };

  render() {
    const {getFieldDecorator} = this.props.form;
    const {formData} = this.state;
    const formItemLayout = {
      labelCol: { span: 6 },
      wrapperCol: { span: 14 },
    };
    const tailFormItemLayout = {
      wrapperCol: {
        span: 14,
        offset: 6,
      }
    };
    return (
      <div style={{
        width: '400px'
      }}>
        <Form {...formItemLayout}  onSubmit={this.handleSubmit}>
          <Form.Item label="宠物类型" hasFeedback>
            {getFieldDecorator('gener', {
              initialValue: formData.gener,
              rules: [{required: true, message: '请输入用户名!'}],
            })(
              <Select placeholder="请选择">
                <Option value="1">一代</Option>
                <Option value="2">二代</Option>
              </Select>
            )}
          </Form.Item>
          <Form.Item label="主资质" hasFeedback>
            {getFieldDecorator('first', {
              initialValue: formData.first,
              rules: [{required: true, message: '请输入主资质!'}],
            })(
              <Input size="large"
                     type="number"
                     placeholder="主资质"
              />,
            )}
          </Form.Item>
          <Form.Item label="辅资质" hasFeedback>
            {getFieldDecorator('second', {
              initialValue: formData.second,
              rules: [{required: false, message: '请输入辅资质!'}],
            })(
              <Input size="large"
                     type="number"
                     placeholder="辅资质"
              />,
            )}
          </Form.Item>
          <Form.Item label="成长率" hasFeedback>
            {getFieldDecorator('growthRate', {
              initialValue: formData.growthRate,
              rules: [{required: true, message: '请输入成长率!'}],
            })(
              <Input size="large"
                     type="number"
                     placeholder="成长率"
              />,
            )}
          </Form.Item>

          <Form.Item {...tailFormItemLayout}>
            <Button type="primary" htmlType="submit" className="mrl">计算</Button>
            <Button type="primary" onClick={this.handleReset}>重置</Button>
          </Form.Item>
        </Form>
      </div>
    )
  }
}

const Pet = Form.create({name: 'pet_login'})(PetForm);

export default Pet

import React from "react";
import { connect } from "react-redux";
import { Input  } from 'antd';
import { addTodo } from "@/store/actions";
const { Search  } = Input
class AddTodo extends React.Component {
  constructor(props) {
    super(props);
    this.state = { input: "" };
  }

  updateInput = input => {
    console.log(input)
    this.setState({ input });
  };
  updateTodo = input => {
    console.log(this.props)
    this.state.input && this.props.addTodo(this.state.input)
  };

  render() {
    return (
      <div>
        <Search
          placeholder="input search text"
          enterButton="Search"
          onChange={e => this.updateInput(e.target.value)}
          onSearch={this.updateTodo}
          style={{ width: 400 }}
        />
        <p>{ this.state.input }</p>
      </div>
    );
  }
}

export default connect(
  null,
  { addTodo }
)(AddTodo);

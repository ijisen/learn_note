import React from 'react'
import {
  Button
} from 'antd'

class Count extends React.Component {
  constructor() {
    super();
    this.state = {
      step: 1
    }
    this.handleAddState = this.handleAddState.bind(this)
  }

  handleAddState() {
    const { step } = this.state;
    this.setState({
      step: step + 1
    })
  }

  render() {
    return (
      <h1>{this.state.step}</h1>
    )
  }
}

class Index extends React.Component {
  ref = React.createRef()

  componentDidMount() {
    console.log(this.ref)
  }

  handleAddClick = () => {
    const {
      current = {
        handleAddState: () => {
        }
      }
    } = this.ref || {};
    current.handleAddState();
  }

  render() {
    return (
      <div>
        <Button onClick={this.handleAddClick}>添 加</Button>
        <Count ref={this.ref}/>
      </div>
    )
  }
}

export default Index

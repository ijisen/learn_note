import React from 'react';

export default class NoMatch extends React.Component {
  render() {
    console.log(this.props.location.pathname)
    return (
      <h1>NoMatch : { this.props.location.pathname }</h1>
    );
  }
}

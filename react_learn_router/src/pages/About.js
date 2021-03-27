import React, { Component } from 'react';
import '../layouts/App.css';
import { Link }from 'react-router-dom';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <ul className="nav">
            <li><Link to="/">App</Link></li>
            <li><Link to="/About">About</Link></li>
            <li><Link to="/Inbox">Inbox</Link></li>
          </ul>
          <h1>AboutAboutAboutAbout</h1>
        </header>
      </div>
    );
  }
}

export default App;

import React, {Component} from 'react';
import Clock from './clock';
import './App.css';

class App extends Component { 
  
  render() {
    return (
      <div className = "App">
        <div className="clock">
        <div class="box">
          <div style={{backgroundColor: "black",width: "200px",margin: "auto",
    position: "center",padding:"5px",fontWeight: 'bold',fontSize: 20,color: 'white'}
}>
      		<p>Digital Clock</p>
      	</div>
  <div class="shape"></div>
  <div class="date"></div>
</div>
          <Clock />
        </div>
      </div>
    );
  }
}

export default App;
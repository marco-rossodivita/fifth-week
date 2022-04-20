import React from 'react';

class Timer extends React.Component{

    constructor(props){
        super(props);

        //imposto il time e lo start a 0
        this.state = {
            time: 0,
            start: 0
          };

        //bindo la funzione
        this.startTimer = this.startTimer.bind(this);
        this.stopTimer = this.stopTimer.bind(this);
    }

    //modifico lo stato assegnato a time e start
    startTimer() {
        this.setState({
            isOn: true,
            time: this.state.time,
            start: Date.now() - this.state.time
        });

        this.timer = setInterval(() => this.setState({
            time: Date.now() - this.state.start
        }), 1);

      }
      
    stopTimer() {
        clearInterval(this.timer)
        this.setState({time:0})
      }
    

    render(){
        return (
            <div className="timer"> 
                <button onClick={this.startTimer}>Start</button>
                <button onClick={this.stopTimer}>Stop</button>
            </div>
        );
    }
}

export default Timer;
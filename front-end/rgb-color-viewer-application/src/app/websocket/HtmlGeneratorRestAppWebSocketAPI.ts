import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
import {RgbColorComponent} from '../rgb-color/rgb-color.component';

export class HtmlGeneratorRestAppWebSocketAPI {

  webSocketEndPoint = 'http://localhost:8080/ws';
  topic = '/topic/greetings';
  stompClient: any;
  appComponent: RgbColorComponent;

  constructor(appComponent: RgbColorComponent) {
    this.appComponent = appComponent;
  }
  _connect() {
    console.log('Initialize WebSocket Connection');
    const ws = new SockJS(this.webSocketEndPoint);
    this.stompClient = Stomp.over(ws);
    // tslint:disable-next-line:variable-name
    const _this = this;
    // tslint:disable-next-line:only-arrow-functions
    _this.stompClient.connect({}, function(frame) {
      // tslint:disable-next-line:only-arrow-functions
      _this.stompClient.subscribe(_this.topic, function(sdkEvent) {
        alert(sdkEvent);
        _this.onMessageReceived(sdkEvent);
      });
      // _this.stompClient.reconnect_delay = 2000;
    }, this.errorCallBack);
  }

  _disconnect() {
    if (this.stompClient !== null) {
      this.stompClient.disconnect();
    }
    console.log('Disconnected');
  }

  // on error, schedule a reconnection attempt
  errorCallBack(error) {
    console.log('errorCallBack -> ' + error);
    setTimeout(() => {
      this._connect();
    }, 5000);
  }

  /**
   * Send message to sever via web socket
   * @param {*} message
   */
  _send(message) {
    console.log('calling logout api via web socket');
    this.stompClient.send('/app/hello', {}, JSON.stringify(message));
  }

  onMessageReceived(message) {
    console.log('Message Recieved from Server :: ' + message);
    this.appComponent.handleMessage(JSON.stringify(message.body));
  }
}

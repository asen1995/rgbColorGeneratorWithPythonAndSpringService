import {Component, OnDestroy, OnInit} from '@angular/core';
import {Options} from '@angular-slider/ngx-slider';
import {HtmlGeneratorRestAppWebSocketAPI} from '../websocket/HtmlGeneratorRestAppWebSocketAPI';

@Component({
  selector: 'app-rgb-color',
  templateUrl: './rgb-color.component.html',
  styleUrls: ['./rgb-color.component.css']
})
export class RgbColorComponent implements OnInit , OnDestroy{

  redColor = 0;
  greenColor = 0;
  blueColor = 0;

  rgbOptions: Options = {
    floor: 0,
    ceil: 250
  };

  colorPickerText: string;

  webSocketAPI: HtmlGeneratorRestAppWebSocketAPI;


  constructor() { }

  ngOnInit() {
    this.webSocketAPI = new HtmlGeneratorRestAppWebSocketAPI(new RgbColorComponent());
    this.connect();
  }

  connect() {
    this.webSocketAPI._connect();
  }

  disconnect() {
    this.webSocketAPI._disconnect();
  }

  ngOnDestroy(): void {
   this.disconnect();
  }

  handleMessage(htmlCode: string) {
    console.log(htmlCode);
  }
}

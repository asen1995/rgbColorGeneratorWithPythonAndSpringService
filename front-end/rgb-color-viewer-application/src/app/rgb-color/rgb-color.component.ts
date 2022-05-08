import {Component, OnDestroy, OnInit} from '@angular/core';
import {Options} from '@angular-slider/ngx-slider';
import {HtmlGeneratorRestAppWebSocketAPI} from '../websocket/HtmlGeneratorRestAppWebSocketAPI';
import {RgbGeneratorRequestModel} from '../model/RgbGeneratorRequest.model';
import {RgbGeneratorService} from '../service/rgb-generator.service';

@Component({
  selector: 'app-rgb-color',
  templateUrl: './rgb-color.component.html',
  styleUrls: ['./rgb-color.component.css']
})
export class RgbColorComponent implements OnInit, OnDestroy {

  redColor = 0;
  greenColor = 0;
  blueColor = 0;

  rgbOptions: Options = {
    floor: 0,
    ceil: 250
  };

  colorPickerText = '';

  webSocketAPI: HtmlGeneratorRestAppWebSocketAPI;


  constructor(private rgbGeneratorService: RgbGeneratorService) {
  }

  ngOnInit() {
    this.webSocketAPI = new HtmlGeneratorRestAppWebSocketAPI(new RgbColorComponent(this.rgbGeneratorService));
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

  sliderValueChange() {
    this.callRgbCssGeneratorService();
  }

  textChanged(value: string) {
    this.colorPickerText = value;
    this.callRgbCssGeneratorService();
  }

  private callRgbCssGeneratorService() {
    let request: RgbGeneratorRequestModel = new RgbGeneratorRequestModel(this.redColor, this.greenColor, this.blueColor,
      this.colorPickerText);

    this.rgbGeneratorService.callRgbCssGeneratorService(request).subscribe((data: string) => {
      console.log(data);
    }, error => {
      console.warn('error');
    });

  }
}

import { Component, OnInit } from '@angular/core';
import {Options} from '@angular-slider/ngx-slider';

@Component({
  selector: 'app-rgb-color',
  templateUrl: './rgb-color.component.html',
  styleUrls: ['./rgb-color.component.css']
})
export class RgbColorComponent implements OnInit {

  redColor = 0;
  greenColor = 0;
  blueColor = 0;

  rgbOptions: Options = {
    floor: 0,
    ceil: 250
  };

  text: string;

  constructor() { }

  ngOnInit() {
  }

}

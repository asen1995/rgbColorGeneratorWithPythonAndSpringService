import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RgbColorComponent } from './rgb-color/rgb-color.component';
import {NgxSliderModule} from '@angular-slider/ngx-slider';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {RgbGeneratorService} from './service/rgb-generator.service';

@NgModule({
  declarations: [
    AppComponent,
    RgbColorComponent
  ],
  imports: [
    BrowserModule,
    NgxSliderModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [RgbGeneratorService],
  bootstrap: [AppComponent]
})
export class AppModule { }

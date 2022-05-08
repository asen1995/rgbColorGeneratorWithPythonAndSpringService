import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {RgbGeneratorRequestModel} from '../model/RgbGeneratorRequest.model';
import {environment} from '../../environments/environment';

@Injectable()
export class RgbGeneratorService {
  private rgbGeneratorUrl: string = environment.url;

  httpOptions = {
  };

  constructor(private http: HttpClient) {
  }


  callRgbCssGeneratorService(request: RgbGeneratorRequestModel): Observable<string> {
    return this.http.post<string>(this.rgbGeneratorUrl + '/cssRgbGenerator', request);
  }
}

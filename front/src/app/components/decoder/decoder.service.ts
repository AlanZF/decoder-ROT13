import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Decoder } from './model/decoder';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DecodeMessageService {

  private readonly API = "api/";

  private readonly httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  decodeMessage(decoder: Decoder): Observable<Decoder> {
    return this.http.post<Decoder>(this.API + 'decode',
      decoder, this.httpOptions)
      .pipe(
        map((obj) => obj));
  }

}
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class RecetasService {

  constructor(private clienteHttp: HttpClient) { }

  public getAllRecetasURL(): Observable<any>{
    return this.clienteHttp.get('https://dummyjson.com/recipes');
  }

  public getRecetaIdURL(): Observable<any>{
    return this.clienteHttp.get('https://dummyjson.com/recipes/${id}')
  }

  // 'https://dummyjson.com/recipes'
}

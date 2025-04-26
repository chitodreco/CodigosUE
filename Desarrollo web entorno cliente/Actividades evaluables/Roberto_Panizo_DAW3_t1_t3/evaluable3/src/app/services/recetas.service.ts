import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Receta } from '../model/receta';


@Injectable({
  providedIn: 'root'
})
export class RecetasService {

  private favoritas: Receta[] = [];

  constructor(private clienteHttp: HttpClient) { }

  public getAllRecetasURL(): Observable<any>{
    return this.clienteHttp.get('https://dummyjson.com/recipes');
  }

  public getRecetaIdURL(id: number): Observable<any>{
    return this.clienteHttp.get(`https://dummyjson.com/recipes/${id}`)
  }

  agregarAFavoritas(receta: Receta): void {
    if (!this.favoritas.find(fav => fav.id === receta.id)) {
      this.favoritas.push(receta);
    }
  }

  obtenerFavoritas(): Receta[] {
    return this.favoritas;
  }
  eliminarFavorita(id: number): void {
    this.favoritas = this.favoritas.filter(fav => fav.id !== id);
  }

  // 'https://dummyjson.com/recipes'
}

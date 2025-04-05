import { Component } from '@angular/core';
import { Producto } from '../../model/producto';

@Component({
  selector: 'app-ejercicio4',
  standalone: false,
  templateUrl: './ejercicio4.component.html',
  styleUrl: './ejercicio4.component.css'
})
export class Ejercicio4Component {
  productos: Producto[] = [
    { nombre: 'Producto 1', precio: 10, cantidad: 5, categoria: 'Categoria 1' },
    { nombre: 'Producto 2', precio: 20, cantidad: 3, categoria: 'Categoria 2' },
    { nombre: 'Producto 3', precio: 15, cantidad: 8, categoria: 'Categoria 1' },
    { nombre: 'Producto 4', precio: 30, cantidad: 2, categoria: 'Categoria 3' },
    { nombre: 'Producto 5', precio: 25, cantidad: 4, categoria: 'Categoria 2' },
  ]

  eliminarElemento(_t4: Producto) {
    this.productos = this.productos.filter(
      (producto) => producto !== _t4);
  }

}

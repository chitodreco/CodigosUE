import { Component } from '@angular/core';
import { Conocimiento } from '../../model/modelos';

@Component({
  selector: 'app-listado',
  standalone: false,
  templateUrl: './listado.component.html',
  styleUrl: './listado.component.css'
})
export class ListadoComponent {
  nombre = 'Roberto';
  nombreConocimiento = '';
  nivelConocimiento = '';
  conocimientos: Conocimiento[] = []; /* declara la variable conocimiento, de tipo interfaz como array vacío. Luego la función lo rellenará */

  url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwhFNGv9UvSO3RW0hpy2WCoZ1Q2PJ1zmqHZg&s';

  guardarElemento(){


  let conocimiento: Conocimiento = {nombre:this.nombreConocimiento, nivel:this.nivelConocimiento} /* dentro de la función guardarElemento declara variable conomiento, que es de tipo interfaz Conocimiento 
  y guarda las variables introducidas en el html como tipo JSON -->atributo:valor*/

    this.conocimientos.push(conocimiento); /* desde aquí se meterán en el array los conocimientos */


    console.log(this.nombreConocimiento);
    ;
    console.log(this.nivelConocimiento);    
    ;
  }
}

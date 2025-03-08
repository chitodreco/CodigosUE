import { Component } from '@angular/core';
import { Conocimiento } from '../../model/modelos';
import Swal from 'sweetalert2'

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
  mostrar = false;
  conocimientos: Conocimiento[] = []; /* declara la variable conocimiento, de tipo interfaz como array vacío. Luego la función lo rellenará */

  url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwhFNGv9UvSO3RW0hpy2WCoZ1Q2PJ1zmqHZg&s';

  guardarElemento(){

    if (this.nombreConocimiento.length == 0 && this.nivelConocimiento.length == 0){
        /*alert("Faltan datos");*/      
        Swal.fire({
        title: "Fallo",
        text: "Faltan datos por rellenar",
        icon: "warning"
      });

    } else{

      let conocimiento: Conocimiento = {nombre:this.nombreConocimiento, nivel:this.nivelConocimiento}; /* dentro de la función guardarElemento crea un objeto de tipo conomiento (interfaz) 
      y guarda las variables introducidas en el html como tipo JSON -->atributo:valor*/
  
      this.conocimientos.push(conocimiento); /* desde aquí se meterán en el array los conocimientos */
      this.vaciarDatos();
    }

  }

  vaciarDatos(){
    this.nombreConocimiento = '';
    this.nivelConocimiento = '';
  }

  mostrarConocimientos() {
      this.mostrar = !this.mostrar;
    }
    
}

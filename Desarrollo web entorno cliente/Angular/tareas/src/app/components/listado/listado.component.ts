import { Component } from '@angular/core';

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
  url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwhFNGv9UvSO3RW0hpy2WCoZ1Q2PJ1zmqHZg&s';

  guardarElemento(){
    this.nombreConocimiento = nombreConocimiento;
    this.nivelConocimiento = nivelConocimiento;    
  }
}

import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';
import { log } from 'console';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  autor = 'Roberto Panizo';
  asignaturaa = "Desarrollo cliente";
  seleccion = 4;

  constructor(private router: Router){

  }
  
  navegar() {
    console.log("procedo a navegar");
    this.router.navigate(['listado',this.seleccion]);
  }
}

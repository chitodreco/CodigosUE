import { Component } from '@angular/core';
import { Receta } from '../../model/receta';
import { RecetasService } from '../../services/recetas.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-recetas',
  standalone: false,
  templateUrl: './recetas.component.html',
  styleUrl: './recetas.component.css'
})
export class RecetasComponent {

  recetas: Receta[] = [];

  constructor(private dataService: RecetasService) {
    this.dataService.getAllRecetasURL().subscribe((data) => {
      this.recetas = data.recipes;
    });

  }

  agregarAFavoritas(receta: Receta): void {
    this.dataService.agregarAFavoritas(receta);
    Swal.fire({
      icon: 'success',
      title: '¡Añadida a Favoritas!',
      text: `${receta.name} se ha añadido a tus recetas favoritas.`,
      showConfirmButton: false,
      timer: 2500
    });
  }
    
}

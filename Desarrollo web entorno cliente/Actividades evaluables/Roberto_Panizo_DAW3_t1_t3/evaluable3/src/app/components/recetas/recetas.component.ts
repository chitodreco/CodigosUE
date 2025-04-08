import { Component } from '@angular/core';
import { Receta } from '../../model/receta';
import { RecetasService } from '../../services/recetas.service';

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
}

import { Component } from '@angular/core';
import { RecetasService } from '../../services/recetas.service';
import { Receta } from '../../model/receta';

@Component({
  selector: 'app-detalle',
  standalone: false,
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css'
})
export class DetalleComponent {
  constructor(private dataService: RecetasService) {
    this.dataService.getRecetaIdURL().subscribe((data) => {
      
    });
  }
}

import { Component, OnInit } from '@angular/core';
import { Receta } from '../../model/receta';
import { RecetasService } from '../../services/recetas.service';

@Component({
  selector: 'app-favoritas',
  standalone: false,
  templateUrl: './favoritas.component.html',
  styleUrl: './favoritas.component.css'
})
export class FavoritasComponent implements OnInit {
  favoritas: Receta[] = [];

  constructor(private recetasService: RecetasService) {
    this.favoritas = this.recetasService.obtenerFavoritas();
  }

  ngOnInit(): void {
  this.favoritas = this.recetasService.obtenerFavoritas();
  }

  eliminarFavorita(id: number): void {
    this.recetasService.eliminarFavorita(id);
    this.favoritas = this.recetasService.obtenerFavoritas();
  }


}

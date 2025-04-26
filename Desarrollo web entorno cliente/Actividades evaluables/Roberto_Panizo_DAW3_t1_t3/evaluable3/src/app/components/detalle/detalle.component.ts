import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RecetasService } from '../../services/recetas.service';
import { Receta } from '../../model/receta';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-detalle',
  standalone: false,
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css'
})
export class DetalleComponent implements OnInit {
  receta: Receta | null = null;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private recetasService: RecetasService
  ) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.recetasService.getRecetaIdURL(id).subscribe((data) => {
        this.receta = data;
      });
    }
  }

  volverARecetas() {
    this.router.navigate(['/recetas']);
    }

    agregarAFavoritas(): void {
      if (this.receta) {
        this.recetasService.agregarAFavoritas(this.receta);

        Swal.fire({
          icon: 'success',
          title: '¡Añadida a Favoritas!',
          text: `${this.receta.name} se ha añadido a tus recetas favoritas.`,
          showConfirmButton: false,
          timer: 2500
        });
      };
      
    }

}

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RecetasComponent } from './components/recetas/recetas.component';
import { HomeComponent } from './components/home/home.component';
import { ErrorComponent } from './components/error/error.component';
import { DetalleComponent } from './components/detalle/detalle.component';

const routes: Routes = [
  {path: '', redirectTo: '/recetas', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'recetas', component: RecetasComponent},
  {path: 'detalle/:id', component: DetalleComponent},
  {path: '**', component: ErrorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

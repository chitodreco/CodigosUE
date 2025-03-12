import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AsignaturasComponent } from './components/asignaturas/asignaturas.component';
import { ListadoComponent } from './components/listado/listado.component';
import { error } from 'console';
import { ErrorComponent } from './components/error/error.component';
import { TecnologiasComponent } from './components/tecnologias/tecnologias.component';
import path from 'path';

const routes: Routes = [
  {path:'', redirectTo:'asignaturas',pathMatch:'full'},
  {path:'asignaturas',component: AsignaturasComponent},
  {path:'tecnologias',component:TecnologiasComponent,
    children:[
      {path:'angular',component: AsignaturasComponent} , 
      {path:'react',component: ListadoComponent} ]},
  {path:'listado/:id', component:ListadoComponent},
  {path:'**',component: ErrorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

"use client";
import { use, useState } from "react";
import { Usuario } from "../models/usuario";

export default function Formulario() {
  const [nombre, setNombre] = useState("");
  const [apellido, setApellido] = useState("");
  const [correo, setCorreo] = useState("");

  const [usuarios, setUsuarios] = useState<Usuario[]>([]);

  function limpiarFormulario() {}

  function anadirUsuario() {
    //captura la variable lista, quédate con lo que hay en la lista y añade un usuario nuevo

    setUsuarios([...usuarios, { nombre, apellido, correo }]); // los 3 puntos es: coge lo que ya estaba, y añade lo nuevo.
    console.log(usuarios);
  }

  return (
    <div>
      <h2>Formulario App</h2>
      <input
        value={nombre}
        type="text"
        placeholder="Introduce nombre"
        className="form-control mb-3"
        onChange={(e) => {
          setNombre(e.target.value);
        }}
      />
      <input
        value={apellido}
        type="text"
        placeholder="Introduce apellido"
        className="form-control mb-3"
        onChange={(e) => {
          setApellido(e.target.value);
        }}
      />
      <input
        value={correo}
        type="text"
        placeholder="Introduce correo"
        className="form-control mb-3"
        onChange={(e) => {
          setCorreo(e.target.value);
        }}
      />
      <button
        className="btn btn-primary mb-3"
        onClick={() => {
          anadirUsuario();
          limpiarFormulario();
        }}
      >
        Guardar
      </button>
      <ul className="list-group">
        {usuarios.map((item, index) => {
          return (
            <li key={index} className="list-group-item">
              {item.nombre} {item.apellido} {item.correo}
            </li>
          );
        })}
      </ul>
    </div>
  );
}

/* en vez de mostrar los elementos en una lista, mostrarlos en un conjunto de cartas  
si los datos del formulario no son correctos, sacar un sweetalert
*/

"use client";
import React, { useEffect, useState } from "react";
import { Pais } from "../models/usuario";

const Consultas = () => {
  //useEffect -> primer parámetro que es una función (realizar la petición al API)
  // y segundo parámetro un array de dependencias (que si cambian, se vuele a ejecutar la función del primer parámetro)

  const [paises, setPaises] = useState<Pais[]>([]);

  useEffect(() => {
    //PETICIONES A UN API ANGULAR
    // 1. en el servicio HTTPClientModule
    // 2. http.get('https://restcountries.com/v3.1/all') return un Observable
    // 3. subscribe -> el observable se convierte en una promesa

    //PETICIONES A UN API REACT
    // 1. hago una función fetch() con opcion async await
    // 2. la función fetch() retorna una promesa
    // 3. guardo los datos de la respuesta JSON utilizando el useState

    const peticion = async () => {
      const respuesta = await fetch("https://restcountries.com/v3.1/all");
      const data = await respuesta.json();
      setPaises(data);
    };

    peticion();
  }, []);

  return (
    <div>
      <h2>Consultas a API</h2>
      {/* Mostrar todos los países en sus carta */}

      <div className="row row-cols-1 row-cols-md-2 g-4">
        {paises.map((pais: Pais) => {
          return (
            <div className="col" key={pais.ccn3}>
              <div className="card">
                <img
                  src={pais.flags.png}
                  className="card-img-top"
                  alt="..."
                ></img>
                <div className="card-body">
                  <h5 className="card-title">{pais.name.official}</h5>
                  <p className="card-text">{pais.continents} </p>
                </div>
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default Consultas;

import React from "react";
import { PropsPais } from "../models/usuario";

const Carta = (data: PropsPais) => {

const {pais} = data;

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
};

export default Carta;

"use client";

import { log } from "console";
import React, { useState } from "react";

export default function Contador() {
  //useState es un hook que permite crear estado

  const [contador, setContador] = useState(0);

  const eventHandler = (e) => {
    const id = e.target.id;
    switch (id) {
      case "1":
        setContador(contador + 1);
        break;
      case "2":
        setContador(contador - 1);
        break;
      case "3":
        setContador(0);
        break;
    }
  };

  return (
    <div>
      <h2>Contador App</h2>
      <p>el valor de contador es: {contador}</p>
      <button id="1" className="btn btn-primary" onClick={eventHandler}>
        Incrementa
      </button>
      <button id="2" className="btn btn-primary" onClick={eventHandler}>
        Decrementa
      </button>
      <button id="3" className="btn btn-primary" onClick={eventHandler}>
        Resetear
      </button>
    </div>
  );
}

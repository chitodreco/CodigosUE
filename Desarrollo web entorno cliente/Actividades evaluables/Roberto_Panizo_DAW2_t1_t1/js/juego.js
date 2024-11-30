// nombreJugador = prompt("Introduzca su nombre: ");
let baraja = [];
let palos = ["C", "T", "P", "D"];

// Crear la baraja
for (let index = 0; index < palos.length; index++) {
  for (let i = 1; i <= 13; i++) {
    switch (i) {
      case 11:
        baraja.push(new carta("J" + palos[index]));
        break;
      case 12:
        baraja.push(new carta("Q" + palos[index]));

        break;
      case 13:
        baraja.push(new carta("K" + palos[index]));
        break;

      default:
        baraja.push(new carta(i + palos[index]));
        break;
    }
  }
}

// Barajar
baraja = _.shuffle(baraja);
console.log(baraja);

// Comienza el juego -> la banca comienza sacando carta cada 2"

let cuentaBanca = 0;

let intervalo = setInterval(() => {
  if (cuentaBanca < 17) {
    cuentaBanca += baraja.pop().valor;
    console.log(cuentaBanca);
  } else {
    clearInterval(intervalo);
  }
}, 2000);

/* while (cuentaBanca < 17){
}
 */

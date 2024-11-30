let nombreJugador = prompt("Introduzca su nombre: ");
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

/* Bienvenida al jugador */
let bienvenida = document.querySelector("h5");
bienvenida.innerHTML =
  `Bienvenido ${nombreJugador}` + ` a la mejor partida de BlackJack`;
let nombreJugador2 = document.querySelector(".jugador");
nombreJugador2.innerHTML = `${nombreJugador}`;
let intervalo2 = setInterval(() => {
  bienvenida.innerHTML = `La banca comienza primero`;
}, 2000);

// Barajar
baraja = _.shuffle(baraja);
console.log(baraja);

// Comienza el juego -> la banca comienza sacando carta cada 2"

let cuentaBanca = 0;

let intervalo = setInterval(() => {
  if (cuentaBanca < 17) {
    cuentaBanca += baraja.pop().valor;
    console.log(cuentaBanca);
    let tiradaBanca = document.querySelector(".tiradaBanca");
    tiradaBanca.innerHTML += `<img src="${baraja.imagen}" class="carta me-3 mb-1" width="100" height="130"></img>`;
  } else {
    clearInterval(intervalo);
  }
}, 4000);

/* while (cuentaBanca < 17){
}
 */

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
bienvenida.innerHTML = `Bienvenido ${nombreJugador}` + ` a la partida`;
let nombreJugador2 = document.querySelector(".jugador");
nombreJugador2.innerHTML = `${nombreJugador}`;

// Barajar
baraja = _.shuffle(baraja);
console.log(baraja);

// Comienza el juego

let cuentaBanca = 0;

let intervalo = setInterval(() => {
  /* Comienza jugando la banca */
  if (cuentaBanca < 17) {
    let cartaSacada = baraja.pop();
    cuentaBanca += cartaSacada.valor;
    let contadorBanca = document.querySelector(".banca");
    contadorBanca.innerHTML = `Banca ${cuentaBanca}`;
    console.log(cuentaBanca);
    console.log("Cuenta de la banca:", cuentaBanca);
    console.log("Carta sacada:", cartaSacada);
    let tiradaBanca = document.querySelector(".tiradaBanca");
    tiradaBanca.innerHTML += `<img src="${cartaSacada.imagen}" class="carta me-3 mb-1" width="100" height="130"></img>`;
    /* Si saca = o superior a 22 pierde directamente */
  } else if (cuentaBanca >= 22) {
    Swal.fire({
      position: "top-center",
      icon: "success",
      title: "La banca ha sacado más de 22 puntos, ¡Has ganado!",
      showConfirmButton: false,
      timer: 3000,
    });
    clearInterval(intervalo);
  } else {
    /* Comienza la partida del jugador sacando los 2 botones: Pedir carta y Plantarse */
    clearInterval(intervalo);
    /* Configuración botón Pedir carta */
    let sacarCarta = document.querySelector(".boton1");
    sacarCarta.innerHTML =
      '<button type="button" class="btn btn-primary ms-2">Pedir carta</button>';
    let pedirCarta = document.querySelector(".boton1");
    pedirCarta.addEventListener("click", (event) => {
      let cartaJugador = baraja.pop();
      cuentaJugador += cartaJugador.valor;
      let contadorJugador = document.querySelector(".puntuacionJugador");
      contadorJugador.innerHTML = ` ${cuentaJugador}`;
      let lanceJugador = document.querySelector(".tiradaJugador");
      lanceJugador.innerHTML += `<img src="${cartaJugador.imagen}" class="carta me-3 mb-1" width="100" height="130"></img>`;
      if (cuentaJugador >= 22) {
        Swal.fire({
          icon: "error",
          title: "Oops...",
          text: "Has obtenido 22 puntos o más, ¡has perdido!",
        });
        sacarCarta.innerHTML = "";
        plantarse.innerHTML = "";
      }
    });
    /* Configuración botón Plantarse */
    let plantarse = document.querySelector(".boton2");
    plantarse.innerHTML =
      '<button type="button" class="btn btn-success ms-2 me-2">Plantarse</button>';
    plantarse.addEventListener("click", (event) => {
      if (cuentaJugador == 21 && cuentaBanca == 21) {
        Swal.fire("¡Empate!");
        plantarse.innerHTML = "";
        sacarCarta.innerHTML = "";
      } else if (cuentaJugador > cuentaBanca) {
        Swal.fire({
          title: "¡Has ganado!",
          imageUrl:
            "https://de2.sportal365images.com/process/smp-betway-images/blog.betway.com.es/20032024/aa295e20-3e35-4dd9-9e0a-e6c775642ee9.jpg",
          imageWidth: 400,
          imageHeight: 200,
          imageAlt: "Custom image",
        });
      } else {
        Swal.fire({
          icon: "error",
          title: "Oops...",
          text: "¡Has perdido!",
        });
        plantarse.innerHTML = "";
      }
    });
  }
}, 3000);

let cuentaJugador = 0;

/* while (cuentaBanca < 17){
}
 */

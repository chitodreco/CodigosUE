const baraja = [];
const corazones = [];
const diamantes = [];
const picas = [];
const treboles = [];

// Array del palo Corazones
for (let i = 0; i < 13; i++) {
  var valor = i + 1;
  if (valor == 11) {
    valor = "J";
  } else if (valor == 12) {
    valor = "Q";
  } else if (valor == 13) {
    valor = "K";
  }
  corazones[i] = `${valor}C`;
}

//Array del palo Diamantes
for (let i = 0; i < 13; i++) {
  var valor = i + 1;
  if (valor == 11) {
    valor = "J";
  } else if (valor == 12) {
    valor = "Q";
  } else if (valor == 13) {
    valor = "K";
  }
  diamantes[i] = `${valor}D`;
}
//Array del palo Picas
for (let i = 0; i < 13; i++) {
  var valor = i + 1;
  if (valor == 11) {
    valor = "J";
  } else if (valor == 12) {
    valor = "Q";
  } else if (valor == 13) {
    valor = "K";
  }
  picas[i] = `${valor}P`;
}

//Array del palo Tréboles
for (let i = 0; i < 13; i++) {
  var valor = i + 1;
  if (valor == 11) {
    valor = "J";
  } else if (valor == 12) {
    valor = "Q";
  } else if (valor == 13) {
    valor = "K";
  }
  treboles[i] = `${valor}T`;
}

corazones.forEach((element) => {
  baraja.push(element);
});
diamantes.forEach((element) => {
  baraja.push(element);
});
picas.forEach((element) => {
  baraja.push(element);
});
treboles.forEach((element) => {
  baraja.push(element);
});

const barajaMezclada = _.shuffle(baraja);
console.log(barajaMezclada);

function sacarCarta() {
  const numero = Math.floor(Math.random() * 52) + 1;
  console.log(`Carta aleatoria: ${barajaMezclada[numero]}`);
}

function obtenerInformación(param1) {
  let carta = param1;

  var valor = carta.substring(0, carta.length - 1);
  var paloCarta = carta[carta.length - 1];

  console.log(`Carta: ${carta}\n`);
  console.log(`Valor: ${valor}\n`);
  console.log(`Palo: ${paloCarta}\n\n`);
}

sacarCarta();
obtenerInformación("10K");

// //Saca cada carta de la baraja
// for (let i = 0; i < barajaMezclada.length; i++) {
//   setTimeout(() => {
//     //Sacar cada carta cada 5"
//     let carta = barajaMezclada[i];
//     for (let j = 0; j < carta.length; j++) {
//       var valor = carta.substring(0, carta.length - 1);
//       var paloCarta = carta[j];
//     }
//     console.log(`Carta: ${carta}\n`);
//     console.log(`Valor: ${valor}\n`);
//     console.log(`Palo: ${paloCarta}\n\n`);
//   }, i * 1000);
//   barajaMezclada.shift[i];
// }

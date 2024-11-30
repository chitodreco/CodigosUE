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

corazones.forEach(element => {baraja.push(element)});
diamantes.forEach(element => {baraja.push(element)});
picas.forEach(element => {baraja.push(element)});
treboles.forEach(element => {baraja.push(element)});

//baraja.push(corazones);
//baraja.push(diamantes);
//baraja.push(picas);
//baraja.push(treboles);

console.log(baraja);
const barajaMezclada = _.shuffle(baraja);
console.log(barajaMezclada);

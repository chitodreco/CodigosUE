let numero1 = Number(prompt("Introduzca un número: "));
let numero2 = Number(prompt("Introduzca un número: "));

function suma(param1, param2 = 0) {
  return param1 + param2;
}
function resta(param1, param2 = 0) {
  return param1 - param2;
}
function multi(param1, param2 = 0) {
  return param1 * param2;
}
function divi(param1, param2 = 0) {
  return param1 / param2;
}

alert(
  `La suma es: ${suma(numero1, numero2)}\nLa resta es: ${resta(
    numero1,
    numero2
  )}\nLa multiplicación es: ${multi(numero1, numero2)}\nLa división es: ${divi(
    numero1,
    numero2
  )}`
);

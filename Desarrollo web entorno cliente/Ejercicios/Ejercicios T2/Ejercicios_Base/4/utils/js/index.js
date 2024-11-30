const dia = prompt("Introduce el día de tu cumpleaños: ");
const mes = prompt("Introduce el mes de tu cumpleaños: ");
const ano = prompt("Introduce el año de tu cumpleaños: ");
const diaActual = 10;
const mesActual = 30;

let anos = 2024 - (ano + 1);
let dias = anos * 365;

if (mes % 2 != 0) {
  dias += 31;
} else {
  dias += 30;
}

dias += dia;

console.log(dias);

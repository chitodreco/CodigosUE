let array = [];

for (let i = 0; i < 20; i++) {
  let numeroAleatorio = Math.floor(Math.random() * 50 + 1);
  array.push(numeroAleatorio);
}
//Muestra el array
console.log(array);
console.log("\n");

//Muestra los pares
for (let i = 0; i < array.length; i++) {
  let numero = array[i];
  if (numero % 2 == 0) {
    console.log(numero);
  }
}
console.log("\n");

//Muestra todo los números
for (let i = 0; i < array.length; i++) {
  let numero = array[i];

  console.log(numero);
}
console.log("\n");

//Muestra el máximo
let numeroAlto = 0;
for (let i = 0; i < array.length; i++) {
  let numero = array[i];
  if (numero > numeroAlto) {
    numeroAlto = numero;
  }
}
console.log(numeroAlto);
console.log("\n");

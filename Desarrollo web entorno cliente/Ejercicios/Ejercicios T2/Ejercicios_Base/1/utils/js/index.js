const numero = prompt("Introduzca un número");

console.log(`Cuantas filas quieres que aparezca: ${numero}`);

let linea = "";

for (let i = 0; i < numero; i++) {
  linea += "+";
  console.log(linea);
}

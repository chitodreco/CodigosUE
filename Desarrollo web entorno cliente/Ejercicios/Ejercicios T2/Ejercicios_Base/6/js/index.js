var numLetras = 0;
do {
  var frase = prompt("Introduzca una frase: ");
  for (let i = 0; i < frase.length; i++) {
    if (frase[i] != " " && frase[i] != ".") {
      numLetras++;
    }
  }
} while (numLetras < 10);

let fraseCortada = frase.split(" ").length;
let frases = frase.split(".").length;
alert(
  `El dato introducido tiene:\n${numLetras} letras\n${fraseCortada} palabras\n${frases} frases`
);

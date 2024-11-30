const numero = 8;

for (let i = 0; i < numero; i++) {
  let fila = "";
  for (let j = 0; j < numero; j++) {
    if ((i + j) % 2 != 0) {
      fila += " ";
    } else {
      fila += "#";
    }
  }
  console.log(fila);
}

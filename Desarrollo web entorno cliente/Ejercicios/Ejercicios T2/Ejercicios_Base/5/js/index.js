let opcion;
do {
  let numero1 = Number(prompt("Introduzca un  número: "));
  let numero2 = Number(prompt("Introduzca otro  número: "));
  if (numero1 < 0 || numero2 < 0 || isNaN(numero1) || isNaN(numero2)) {
    alert("Los datos introducidos son incorrectos");
  } else {
    const suma = numero1 + numero2;
    const resta = numero1 - numero2;
    const multi = numero1 * numero2;
    const divi = numero1 / numero2;
    alert(
      `Suma: ${suma}\nResta: ${resta}\nMultiplicación: ${multi}\nDivisión: ${divi}`
    );
    if (suma < 0 || resta < 0 || multi < 0 || divi < 0) {
      break;
    } else {
      opcion = confirm("¿Desea realizar más operaciones?");
    }
  }
} while (opcion);

const numero1 = Number(prompt("Introduzca un número: "));
const numero2 = Number(prompt("Introduzca otro número: "));

function suma() {
  return numero1 + numero2;
}
function resta() {
  return numero1 - numero2;
}
function multi() {
  return numero1 * numero2;
}
function divi() {
  return numero1 / numero2;
}

var pregunta = confirm("¿Desea realizar las operaciones?");

if (pregunta) {
  setTimeout(() => {
    alert(`La suma es: ${suma()}`);

    setTimeout(() => {
      alert(`La resta es: ${resta()}`);

      setTimeout(() => {
        alert(`La multiplicación es: ${multi()}`);

        setTimeout(() => {
          alert(`La división es: ${divi()}`);
        }, 2000);
      }, 2000);
    }, 2000);
  }, 2000);
}

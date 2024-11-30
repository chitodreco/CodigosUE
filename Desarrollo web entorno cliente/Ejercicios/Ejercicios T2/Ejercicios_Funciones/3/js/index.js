let numero1 = Number(prompt("Introduzca un número: "));
let numero2 = Number(prompt("Introduzca un número: "));

function suma(param1, param2) {
  if (arguments.length != 2) {
    throw new Error("Se están pasando más argumentos de los solicitados");
  } else {
    return param1 + param2;
  }
}
function resta(param1, param2) {
  if (arguments.length != 2) {
    throw new Error("Se están pasando más argumentos de los solicitados");
  } else {
    return param1 - param2;
  }
}
function multi(param1, param2) {
  if (arguments.length != 2) {
    throw new Error("Se están pasando más argumentos de los solicitados");
  } else {
    return param1 * param2;
  }
}
function divi(param1, param2) {
  if (arguments.length != 2) {
    throw new Error("Se están pasando más argumentos de los solicitados");
  } else {
    return param1 / param2;
  }
}

try {
  const suma1 = suma(numero1, numero2, 5); // aquí está el argumento de más
  const resta1 = resta(numero1, numero2);
  const multi1 = multi(numero1, numero2);
  const divi1 = divi(numero1, numero2);

  alert(
    `La suma es: ${suma1}\nLa resta es: ${resta1}\nLa multiplicación es: ${multi1}\nLa división es: ${divi1}`
  );
} catch (error) {
  alert(error.message);
}

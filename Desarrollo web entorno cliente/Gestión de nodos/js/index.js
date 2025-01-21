let inputNombre = document.querySelector("#nombreInput");
let inputEmail = document.querySelector("#emailInput");
let inputPass = document.querySelector("#passInput");
let inputGenero = document.querySelector("#generoSelect");
let checkGuardar = document.querySelector("#checkGuardar");
let btnGuardar = document.querySelector("#btnGuardar");

btnGuardar.addEventListener("click", (e) => {
  let nombre = inputNombre.value;
  let email = inputEmail.value;
  let pass = inputPass.value;
  let genero = inputGenero.value;

  clearInputs();
});

function clearInputs() {
  inputNombre.value = "";
  inputEmail.value = "";
  inputPass.value = "";
  inputGenero.value = "";
}

/* muestra el valor de la contraseña por consola */
// inputPass.addEventListener('keyup', (e)=>{
//     console.log(e.target.value);

// })

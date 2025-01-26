let inputNombre = document.querySelector("#nombreInput");
let inputEmail = document.querySelector("#emailInput");
let inputPass = document.querySelector("#passInput");
let inputGenero = document.querySelector("#generoSelect");
let checkGuardar = document.querySelector("#checkGuardar");
let btnGuardar = document.querySelector("#btnGuardar");
let divResultados = document.querySelector("div.row.g-4");

btnGuardar.addEventListener("click", (e) => {
  let nombre = inputNombre.value;
  let email = inputEmail.value;
  let pass = inputPass.value;
  let genero = inputGenero.value;

  if (checkGuardar.checked) {
    if (
      nombre.length > 0 &&
      email.length > 0 &&
      pass.length > 0 &&
      genero.length > 0
    ) {
      Swal.fire({
        title: "Exito!",
        text: "Usuario guardado correctamente",
        icon: "success",
      });

      agregarNodo(nombre, email, genero);

      clearInputs();
    } else {
      Swal.fire({
        title: "Error!",
        text: "Falta algún dato",
        icon: "error",
      });
    }
  }
});

function agregarNodo(nombre, email, genero) {
  let columna = document.createElement("div");
  columna.className = "col";
  let carta = document.createElement("div");
  carta.className = "card animate__animated animate__fadeInDown";
  let imagen = document.createElement("img");
  imagen.className = "card-img-top";
  if ((genero == 1)) {
    imagen.src = "https://cdn-icons-png.flaticon.com/512/2922/2922716.png";
  } else {
    imagen.src = "https://cdn-icons-png.flaticon.com/512/2922/2922566.png";
  }

  let bodyCard = document.createElement ("div");
  bodyCard.className = "card-body";
  let titulo = document.createElement ("h5");
  titulo.innerText = nombre;

  bodyCard.append(titulo);
  carta.append(imagen);
  carta.append(bodyCard);
  columna.append(carta);

  divResultados.append(columna);
}

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

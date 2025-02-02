let divResultados = document.querySelector("div.row.g-4");
let divCarrito = document.querySelector("#carrito");
let selectMarca = document.querySelector("#inputMarca");
let selectCategory = document.querySelector("#inputCategoria");
let inputPrecio = document.querySelector("#inputPrecio");
let btnBuscar = document.querySelector("#buscar");
let btnReset = document.querySelector("#reset");
let btnComprar = document.querySelector("#comprar");
let iconoCesta = document.querySelector(".bi-cart");
let totalCompra = 0;
let divTotalCompra = document.querySelector("#total");

/* Fetch que pinta las opciones del formulario en los campos Marca y Categoría */

fetch("https://dummyjson.com/products")
  .then((response) => response.json())
  .then((response1) => {
    let products = response1.products;
    console.log(products);
    return products;
  })
  .then((response2) => {
    let filtrada = response2.filter((element) => element.brand);

    filtrada.forEach((item) => {
      agregarNodo(item.images[0], item.brand, item.price, item.category);
    });
    console.log(filtrada);

    /* recorre el filtrado y pinta las opciones de las Marcas */
    filtrada.forEach((element) => {
      let opcion = document.createElement("option");
      opcion.value = element.brand;
      opcion.textContent = element.brand;
      selectMarca.append(opcion);
    });
    /* almacena valores únicos */
    let categoriasUnicas = new Set();

    /* recorre las Categorías únicas y las pinta en las opciones de Categorías*/
    filtrada.forEach((element) => {
      categoriasUnicas.add(element.category);
    });
    categoriasUnicas.forEach((element) => {
      let opcion = document.createElement("option");
      opcion.value = element;
      opcion.textContent = element;
      selectCategory.append(opcion);
    });
  })

  .catch(() => {
    console.log("contestación incorrecta");
  })
  .finally(() => {
    console.log("Finalizando dependencias de la promesa");
  });

/* Botón Buscar */
botonComprar();

btnBuscar.addEventListener("click", (e) => {
  let marca = selectMarca.value;
  let categoria = selectCategory.value;
  let precio = parseInt(inputPrecio.value);
  divResultados.innerHTML = "";

  fetch("https://dummyjson.com/products")
    .then((response) => response.json())
    .then((response1) => {
      let productos = response1.products;
      return productos;
    })
    .then((response2) => {
      let filtradoMarcas = response2.filter((marcas) => marcas.brand);

      filtradoMarcas.forEach((item) => {
        if (item.brand === marca) {
          agregarNodo(item.images[0], item.brand, item.price, item.category);
        }
        if (item.category === categoria) {
          agregarNodo(item.images[0], item.brand, item.price, item.category);
        }
        if (item.price > precio) {
          agregarNodo(item.images[0], item.brand, item.price, item.category);
        }
      });
    })
    .catch(() => {
      console.log("Error al obtener los productos");
    })
    .finally(() => {
      console.log("Finalizando dependencias de la promesa 2");
    });
});

/* Botón Limpiar búsqueda */

btnReset.addEventListener("click", (e) => {
  selectMarca.value = "Todas";
  selectCategory.value = "Todas";
  inputPrecio.value = "";
});

/* Función que construye cada carta */

function agregarNodo(imagen, marca, precio, categoria) {
  let columna = document.createElement("div");
  columna.className = "col";
  let carta = document.createElement("div");
  carta.className = "card animate__animated animate__pulse";
  let img = document.createElement("img");
  img.className = "card-img-top";
  img.src = imagen;
  let titulo2 = document.createElement("h4");
  titulo2.className = "card-text";
  titulo2.textContent = marca;
  let titulo = document.createElement("h5");
  titulo.className = "card-text";
  titulo.textContent = categoria;
  let price = document.createElement("p");
  price.className = "card-text";
  price.textContent = precio + "€";
  let boton = document.createElement("button");
  boton.className = "btn btn-primary";
  boton.textContent = "Añadir al carrito";
  let bodyCard = document.createElement("div");
  bodyCard.className = "card-body";

  bodyCard.append(titulo2);
  bodyCard.append(titulo);
  bodyCard.append(price);
  bodyCard.append(boton);

  carta.append(img);
  carta.append(bodyCard);

  columna.append(carta);

  divResultados.append(columna);

  boton.addEventListener("click", (e) => {
    nodoCarrito(imagen, marca, precio);
  });
}

/* Función que construye el producto para el carrito */

function nodoCarrito(imagen, marca, precio) {
  let estructura = document.createElement("div");
  estructura.className =
    "card animate__animated animate__backInRight mb-2 ms-2";
  estructura.style.maxWidth = "540px";
  let fila = document.createElement("div");
  fila.className = "row g-0";
  let columna = document.createElement("div");
  columna.className = "col-md-4";
  let img = document.createElement("img");
  img.src = imagen;
  img.className = "img-fluid rounded-start";
  let columna2 = document.createElement("div");
  columna2.className = "col-sm-8";
  let cuerpoCarta = document.createElement("div");
  cuerpoCarta.className = "card-body";
  let titulo = document.createElement("h5");
  titulo.className = "card-title";
  titulo.textContent = marca;
  let price = document.createElement("p");
  price.className = "card-text";
  price.textContent = precio + "€";
  let btnEliminar = document.createElement("i");
  btnEliminar.className = "bi bi-trash3";
  btnEliminar.title = "Eliminar";
  btnEliminar.style.cursor = "pointer";

  cuerpoCarta.append(titulo, price, btnEliminar);
  columna2.append(cuerpoCarta);
  columna.append(img);
  fila.append(columna, columna2);
  estructura.append(fila);

  totalCompra += precio;
  divTotalCompra.textContent = "Total: " + totalCompra.toFixed(2) + "€";

  btnEliminar.addEventListener("click", (e) => {
    divCarrito.removeChild(estructura);
    totalCompra -= precio;
    divTotalCompra.textContent = "Total: " + totalCompra.toFixed(2) + "€";
    if (totalCompra < 0) {
      totalCompra = 0;
    }
    if (totalCompra == 0) {
      divTotalCompra.textContent = "";
    }
  });
  divCarrito.append(estructura);
}

/* Botón Comprar */

function botonComprar() {
  let boton = document.createElement("button");
  boton.className = "btn btn-success mt-5 w-100";
  boton.textContent = "Comprar";
  btnComprar.append(boton);

  btnComprar.addEventListener("click", (e) => {
    if (totalCompra === 0) {
      Swal.fire({
        icon: "error",
        title: "Oopsi...",
        text: "Aún no tienes productos en la cesta",
      });
    } else {
      Swal.fire({
        title: "Total compra: " + totalCompra + "€",
        text: "¿Estás seguro de llevar a cabo la compra?",
        icon: "question",
        showCloseButton: true,
        showCancelButton: true,
        focusConfirm: false,
        confirmButtonText: `
           Confirmar Pedido
        `,
        confirmButtonAriaLabel: "Thumbs up, great!",
        cancelButtonText: `
          Cancelar
        `,
        cancelButtonAriaLabel: "Thumbs down",
      }).then((response) => {
        if (response.isConfirmed) {
          Swal.fire(
            "¡Compra realizada!",
            "Tu pedido ha sido procesado.",
            "success"
          );
          divCarrito.innerHTML = "";
          totalCompra = 0;
          divTotalCompra.textContent = "";
        }
      });
    }
  });
}

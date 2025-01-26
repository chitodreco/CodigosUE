let productos = [
  new producto("Camiseta", 100, "ropa"),
  new producto("Pantalón", 200, "ropa"),
  new producto("Móvil", 100, "tecnologia"),
  new producto("Tablet", 100, "tecnologia"),
  new producto("Bebida", 100, "alimentos"),
  new producto("Comida", 100, "alimentos"),
  new producto("Botella", 50, "cocina"),
];

let select = document.querySelector("#select-tipo");
let divProductos = document.querySelector("#div-productos");

representarProductos(productos);

select.addEventListener("change", (e) => {
  let listaFiltrada = [];
  let tipo = select.value;

  if (tipo != "todos") {
    listaFiltrada = productos.filter((item) => {
      return item.categoria == tipo;
    });
  } else {
    listaFiltrada = productos;
  }
  saltarDialogo(listaFiltrada.length);
  representarProductos(listaFiltrada);

  console.log("El resultado del filtro es: ");
  console.log(listaFiltrada);
});

function representarProductos(productos) {
  divProductos.innerHTML = "";

  productos.forEach((item) => {
    let imagen = "";
    switch (item.categoria) {
      case "ropa":
        imagen =
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRs-70OmFrKao5peSwZFLRKa1m3Y-ph7K4mDA&s";
        break;
      case "tecnologia":
        imagen =
          "https://www.muycomputerpro.com/universo-lenovo/wp-content/uploads/2018/08/lenovo-desktop-pc.jpg";
        break;
      case "alimentos":
        imagen =
          "https://formacion.intef.es/tutorizados_2013_2019/pluginfile.php/213205/mod_assign/intro/Alimentos.png";

        break;

      default:
        imagen = "https://thumbs.dreamstime.com/b/error-109026446.jpg";
        break;
    }
    divProductos.innerHTML += `<div class="col">
          <div class="card">
            <img src="${imagen}" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">${item.nombre}</h5>
              <p class="card-text">${item.precio}</p>
            </div>
          </div>`;
  });
}

function saltarDialogo(numero) {
  let icono = "success";
  if (numero == 0){
    icono = "warning";
  }
  Swal.fire({
    title: "Productos",
    text: `La cantidad de productos encontrada es de: ${numero}`,
    icon: `${icono}`
  });
}
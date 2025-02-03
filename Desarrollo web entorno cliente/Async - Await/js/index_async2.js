let boton = document.querySelector("#botonRecuperar");



boton.addEventListener("click", (e) => {
let dato = JSON.parse(localStorage.getItem("dato"));
console.log(dato);
});

// obtenerProductos('https://dummyjson.com/products');
// obtenerUsuarios('https://dummyjson.com/users');

let url = "https://dummyjson.com/products";

fetch(url);

// 1. lanzo la petición al server
// 2. con el then analizo la respuesta
// 3. dentro de ese then la paso a json()
// 4. en otro then analizo la respuesta de la traducción
// 5. trato la respuesta

// awai -> espera. indica que la función donde está aplicada es una promesa y no tengo que usar el then para obtener la respuesta
// async -> asíncrono. indica aquella función donde se aplica el modificador await que tiene que ser asíncrono

async function obtenerProductos(url) {
  let respuesta = await fetch(url);
  let json = await respuesta.json();
  console.log(json);
  console.log(json.products);
}
async function obtenerUsuarios(url) {
  let respuesta = await fetch(url);
  let json = await respuesta.json();
  console.log(json);
  console.log(json.users);
}

obtenerProductos();
obtenerUsuarios('https://dummyjson.com/users');


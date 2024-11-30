const ages = [19, 22, 19, 24, 20, 25, 26, 24, 25, 24];

//Ordenar el array
console.log(ages.sort());
//Primera posición
console.log(ages[0]);
//Última posición
console.log(ages[ages.length - 1]);

//Media del array
var contador = 0;
let suma = 0;
for (let i = 0; i < ages.length; i++) {
    suma += ages[i];
    contador++;
} 
const media = (suma/contador);
console.log(media);



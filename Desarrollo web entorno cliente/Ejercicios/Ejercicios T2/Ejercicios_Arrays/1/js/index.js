const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let condition = true;

while (condition) {
  console.log(array);
  condition = false;
}

for (let i = 0; i < array.length; i++) {
  console.log(array[i]);
}

array.forEach((value) => {
  console.log(value);
});

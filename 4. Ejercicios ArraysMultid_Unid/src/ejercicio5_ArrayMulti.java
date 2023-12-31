//5. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros
// entre 0 y 9,
//        ambos inclusive (de forma automática). Se mostrarán los datos separados
//        por una coma y un espacio.
//        Una vez hecho esto se modificará el array del de la manera indicada en cada apartado,
//        y se mostrará de nuevo.
//        - Incrementar en 1 los valores pares y en -1 los impares.
//        - Duplicar los valores positivos menores que 5
//        - Sumar a cada valor un valor entero aleatorio entre -5 y 5.
//        - Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
//        segundo al tercero, ..., y el último al primero).
//        - Intercambiar el primero con el segundo, el tercero con el cuarto, ...,
//        el penúltimo con el último.
//        - Invertir el array
//        - Mostrar la posición del primer par y del último impar.
//
//        **hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique
//        cada una de las opciones**

import java.util.Scanner;

public class ejercicio5_ArrayMulti {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }

        for (int item:array) {
            System.out.print(item + ", ");
        }

        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Incrementa en 1 los vales pares o decrementa en 1 los impares");
        System.out.println("2. Duplicar los valores positivos menores que 5");
        System.out.println("3. Sumar a cada valor un valor entero aleatorio entre -5 y 5.");
        System.out.println("4. Mover los datos una posición hacia la derecha. El último pasa al primero");
        System.out.println("5. Intercambiar el primero con el segundo, el tercero con el cuarto... y el penúltimo con el último.");
        System.out.println("6. Invertir el array.");
        System.out.println("7. Mostrar la posición del primer par y del último impar.");
        System.out.println();
        System.out.println("Introduce la opción que quieras llevar a cabo: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    if ((array[i] % 2) == 0) {
                        array[i] = array[i] + 1;
                    } else {
                        array[i] = array[i] - 1;
                    }
                }
                for (int item : array) {
                    System.out.print(item + ", ");
                }
                break;

            case 2:
                for (int i = 0; i < array.length; i++) {
                    if ((array[i] < 5 && array[i] > 0)) {
                        array[i] = array[i] * 2;
                    }
                }
                for (int item : array) {
                    System.out.print(item + ", ");
                }
                break;

            case 3:
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (array[i] + Math.random()*11 -5);
                }
                for (int item : array) {
                    System.out.print(item + ", ");
                }
                break;

            case 4:
                int ultPos = array[9];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = ultPos;

                for (int item : array) {
                    System.out.print(item + ", ");
                }
                break;

            case 5:

                for (int i = 0; i < array.length; i += 2) {
                    int temporal = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporal;
                }
                for (int item : array) {
                    System.out.print(item + ", ");
                }
                break;

            case 6:
                for (int i = 0; i < array.length - 5; i++) {
                    int temporal = array[i];
                    array[i] = array[array.length -1 - i];
                    array[array.length - 1 - i] = temporal;
                }
                for (int item : array) {
                    System.out.print(item + ", ");
                }

            case 7:
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        System.out.println("El primer par está en la posición: " + i);
                        break;
                    }
                }
                for (int i = array.length - 1; i >= 0; i--) {
                    if (array[i] % 2 != 0) {
                        System.out.println("El último impar está en la posición: " + i);
                        break;
                    }
                }

        }

    }

}

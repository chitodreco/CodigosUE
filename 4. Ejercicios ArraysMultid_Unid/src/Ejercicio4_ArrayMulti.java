//4. (PosicionesArray) Crea una aplicación que:
//        - pida por teclado la longitud de un array
//        - cree el array de enteros de la longitud introducida
//        - pida al usuario que introduzca todos los datos del array
//        - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1
//        y así sucesivamente. El elemento que está en la última posición pasa a la primera
//        - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición
//        pasa a la última y así sucesivamente

import java.util.Scanner;

public class Ejercicio4_ArrayMulti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca longitud del array: ");
        int longitud = scanner.nextInt();
        int [] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca número en el array: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }

        for (int item : array){
            System.out.print(item + " ");
        }

        System.out.println();

        int ultPos = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultPos;

        for (int item : array){
            System.out.print(item + " ");
        }
    }

}

//2. (MayorArray) Crea una aplicación que realice lo siguiente:
//        - pida por pantalla la longitud del array de enteros
//        - crea el array de enteros con la longitud introducida
//        - pida al usuario que introduzca todos los datos del array
//        - saque por pantalla el elemento mayor y el elemento menor

import java.util.Scanner;

public class Ejercicio2_ArrayMulti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce longitud del array: ");
        int longitud = scanner.nextInt();
        int [] array = new int[longitud];
        int maximo = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduzca número para el array: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }

        for (int item:array) {
            System.out.print(item + " ");
        }

        int minimo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo){
                maximo = array[i];
            }
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        System.out.println();

        System.out.println("El elemeno mayor es: "+maximo);
        System.out.println("El elemeno mínimo es: "+minimo);
    }

}

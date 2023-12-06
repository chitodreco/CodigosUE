//Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego
// los muestre:
//        - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//        - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido


import java.util.Scanner;

public class Ejercicio3_Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce un número: ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}

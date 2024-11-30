//Realiza un programa que pida 8 números enteros, los guarde en un array y que luego
//muestre esos números junto con la palabra “par” o “impar” según proceda.

import java.util.Scanner;

public class Ejercicio5_Arrays {

    public static void main(String[] args) {

        int [] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número: ");
            int numero = scanner.nextInt();
            numeros[i] = numero;

        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 == 0) {
                System.out.println(numeros[i] + " par");
            }else {
                System.out.println(numeros[i] + " impar");
            }
        }

    }
}

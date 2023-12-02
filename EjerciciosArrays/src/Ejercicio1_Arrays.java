//Realiza un programa que pida 10 números por teclado y que los almacene en un array.
//A continuación se mostrará el contenido de ese array junto al índice (0 – 9)

import java.util.Scanner;

public class Ejercicio1_Arrays {

    public static void main(String[] args) {

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            int pedido;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            pedido = scanner.nextInt();
            numeros[i] = pedido;
        }
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }
}

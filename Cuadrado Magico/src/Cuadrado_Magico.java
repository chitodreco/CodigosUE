import java.util.Scanner;

public class Cuadrado_Magico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca tamaño del cuadrado: ");
        int tamano = scanner.nextInt();

        int [][] cuadrado = new int[tamano][tamano];

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int numero = (int) (Math.random()*10);
                cuadrado[i][j] = numero;
            }
        }

        for (int[] fila:cuadrado) {
            for (int item: fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }
}

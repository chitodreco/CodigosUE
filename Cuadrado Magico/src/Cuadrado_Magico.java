import java.util.Scanner;

public class Cuadrado_Magico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca tamaño del cuadrado: ");
        int tamano = scanner.nextInt();

        int [][] cuadrado = new int[tamano][tamano];
        int sumaColumnas = 0;
        int numero;


        for (int i = 0; i < cuadrado.length; i++) {

            boolean correcto;
            for (int j = 0; j < cuadrado[i].length; j++) {
                correcto = true;
                do {
                    int sumaFilas = 0;
                    numero = (int) (Math.random() * 10);
                    cuadrado[i][j] = numero;
                    sumaFilas += cuadrado[i][j];

                    if (sumaFilas != 15) {
                            correcto = false;
                    }

                } while (!correcto);

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

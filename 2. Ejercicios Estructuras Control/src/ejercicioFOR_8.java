import java.util.Scanner;

public class ejercicioFOR_8 {

    public static void main(String[] args) {

        double sumPositivos = 0.0;
        double sumNegativos = 0.0;
        int numeroCeros = 0, numPositivos = 0, numNegativos = 0;

        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            int numero = scanner.nextInt();

            if (numero>=0){
                sumPositivos += numero; // sumador de positivos
                numPositivos++; // contador de números positivos (para luego hacer la media)
            } else {
                sumPositivos += numero; // sumador de negativos
                numNegativos++; // contador de números negativos (para luego hacer la media)
            }
            if (numero == 0){
                numeroCeros++;
            }
        }
        System.out.println("La media de positivos es: "+(sumPositivos/numPositivos));
        System.out.println("La media de negativos es: "+(sumNegativos/numNegativos));
        System.out.println("El número de ceros es: "+(numeroCeros));

    }

}


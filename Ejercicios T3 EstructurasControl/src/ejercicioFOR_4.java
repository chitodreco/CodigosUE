import java.util.Scanner;

public class ejercicioFOR_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el inicio del rango: ");
        int inicio = scanner.nextInt();
        System.out.println("Introduce el final del rango: ");
        int fin = scanner.nextInt();

        for (int i = inicio; i <= fin; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t%d * %d = %d\n",i,j,i*j);
            }

        }
    }

}

import java.util.Scanner;

public class ejercicioFOR_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del cuadrado: ");
        int lado = scanner.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*\t");
            } System.out.println(" ");
        }

    }

}

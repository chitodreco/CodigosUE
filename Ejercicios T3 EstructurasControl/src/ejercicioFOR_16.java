import java.util.Scanner;

public class ejercicioFOR_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}

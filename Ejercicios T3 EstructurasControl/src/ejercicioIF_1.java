
import java.util.Scanner;

public class ejercicioIF_1 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }
    }
}

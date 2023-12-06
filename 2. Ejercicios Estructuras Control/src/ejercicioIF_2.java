import java.util.Scanner;

public class ejercicioIF_2 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = scanner.nextInt();
        System.out.println("Introduce el tercer número: ");
        numero3 = scanner.nextInt();

        if (numero1 == numero2 + numero3) {
            System.out.printf("%d = %d + %d",numero1,numero2,numero3);
        } else if (numero2 == numero1 + numero3) {
            System.out.printf("%d = %d + %d",numero2,numero1,numero3);
        }    else if (numero3 == numero1 + numero2) {
            System.out.printf("%d = %d + %d",numero3,numero1,numero2);
        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }
    }
}

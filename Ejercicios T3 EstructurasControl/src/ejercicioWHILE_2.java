import java.util.Scanner;

public class ejercicioWHILE_2 {

    public static void main(String[] args) {

        int numero1, numero2, multiplo1 = 1, multiplo2 = 1, mcm = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduzca otro número: ");
        numero2 = scanner.nextInt();

        do {
            for (int i = 1; i < 100; i++) {
                multiplo1 = numero1 * i;
            }
            for (int i = 0; i < 100; i++) {
                multiplo2 = numero2 * i;
            }
        } while (multiplo1 != multiplo2);
            System.out.println("El m.c.m. es: "+multiplo1);


    }
}

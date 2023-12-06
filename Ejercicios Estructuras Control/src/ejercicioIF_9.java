import java.util.Scanner;

public class ejercicioIF_9 {

    public static void main(String[] args) {

        int numero1, numero2, numero3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduzca otro número: ");
        numero2 = scanner.nextInt();
        System.out.println("Introduzca un último número: ");
        numero3 = scanner.nextInt();

        if ((numero1 == numero2 - 1) && (numero2 == numero3 -1)){
            System.out.println("Son consecutivos");
        } else  {
            System.out.println("No son consecutivos");
        }
    }
}

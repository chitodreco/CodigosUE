import java.util.Scanner;

public class ejercicioFOR_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca otro número: ");
        int numero2 = scanner.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
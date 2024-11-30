import java.util.Scanner;

public class ejercicioIF_4 {
    public static void main(String[] args) {
        int ano;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        ano = scanner.nextInt();

        if (ano%4 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}

import java.util.Scanner;

public class ejercicioFOR_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = scanner.next();

        for (int i = palabra.length()-1; i >= 0 ; i--) {
            System.out.print(palabra.charAt(i));
        }
    }

}

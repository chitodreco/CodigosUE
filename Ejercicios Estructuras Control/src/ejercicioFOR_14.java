import java.text.Normalizer;
import java.util.Scanner;

public class ejercicioFOR_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = scanner.next();
        palabra = palabra.toLowerCase();

        boolean palindromo = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)){
                palindromo = true;
            } else {
                palindromo = false;
            }
        }
        if (palindromo){
            System.out.println("Capicua");
        } else {
            System.out.println("No capicua");
        }
    }
}

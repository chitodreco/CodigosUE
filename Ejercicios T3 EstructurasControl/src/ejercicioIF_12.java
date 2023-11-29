import java.util.Scanner;

public class ejercicioIF_12 {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();
        
        if (numero%2 == 0) {
            numero = numero + 2;
            System.out.println(+numero);
        } else if (numero%3 == 0) {
            numero = numero + 3;
            System.out.println(+numero);
        } else if ((numero%5 == 0)) {
            numero = numero +5;
            System.out.println(+numero);
        } else {
            numero = numero + 1;
            System.out.println(+numero);
        }
    }
}

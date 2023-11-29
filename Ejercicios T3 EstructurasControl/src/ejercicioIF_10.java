import java.util.Scanner;

public class ejercicioIF_10 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        if (numero%2 == 0){
            numero = numero + 1;
            System.out.println(+numero);
        } else {
            numero = numero - 1;
            System.out.println(+numero);
        }
    }
}

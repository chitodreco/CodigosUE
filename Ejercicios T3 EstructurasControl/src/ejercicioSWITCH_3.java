import java.util.Scanner;

public class ejercicioSWITCH_3 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        switch (numero%2){
            case 0:
                System.out.println("Número par");
                break;
            default:
                System.out.println("Número impar");
        }

    }
}

import java.util.Scanner;

public class ejercicioIF_7 {

    public static void main(String[] args) {

        int numero, centena, decena, resto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número de 3 cifras: ");
        numero = scanner.nextInt();

        centena = numero / 100; // 1
        resto = numero % 100; //
        decena = resto / 10; // 5
        resto = resto % 10; // 3

        if (numero>999 || numero<=99) {
            System.out.println("El número no tiene 3 dígitos");
        } else if ((Math.pow(centena,3) + Math.pow(decena,3) + Math.pow(resto,3)) == numero) {
            System.out.println("Es un número Armstrong");
        } else {
            System.out.println("No es un número Armstrong");
        }
    }
}

import java.util.Scanner;

public class ejercicioWHILE_1 {

    public static void main(String[] args) {

        int numero;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = scanner.nextInt();
        while (numero != 0){
            if (numero > 0){
                suma += numero;
            } else {
                numero = 0;
            }
            System.out.println("Introduzca otro número: ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma es: "+suma);

    }
}

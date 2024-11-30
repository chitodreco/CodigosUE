import java.util.Scanner;

public class ejercicioIF_5 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de 4 dígitos: ");
        numero = scanner.nextInt();

        int millares = numero/1000;
        int restante = numero%1000;
        int centenas = restante/100;
        restante = restante%100;
        int decenas = restante/10;
        int unidades = restante%10;

        if (numero<1000 || numero>9999){
            System.out.println("El número no tiene 4 dígitos");
        } else if (millares == unidades && decenas == centenas) {
                System.out.println("Número capicua");
            } else {
                System.out.println("Número no capicua");
            }
    }

}




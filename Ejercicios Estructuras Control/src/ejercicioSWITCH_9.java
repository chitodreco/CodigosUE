import java.util.Scanner;

public class ejercicioSWITCH_9 {

    public static void main(String[] args) {

        int mes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un mes del año: ");
        mes = scanner.nextInt();

        if ((mes < 1 || mes > 12)) {
            System.out.println("Mes incorrecto");
        } else {

            switch (mes) {
                case 12, 1, 2:
                    System.out.println("Invierno");
                    break;
                case 3, 4, 5:
                    System.out.println("Primavera");
                    break;
                case 6, 7, 8:
                    System.out.println("Verano");
                    break;
                case 9, 10, 11:
                    System.out.println("Otoño");
                    break;

            }

        }

    }
}
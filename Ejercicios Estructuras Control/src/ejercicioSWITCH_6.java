import java.util.Scanner;

public class ejercicioSWITCH_6 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 14: ");
        numero = scanner.nextInt();

        if ((numero<1 || numero>14)){
            System.out.println("Número incorrecto");
        } else {

            switch (numero){
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada");
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada");
                    break;
                case 6:
                    System.out.println("Opción 6 seleccionada");
                    break;
                case 7:
                    System.out.println("Opción 7 seleccionada");
                    break;
                case 8:
                    System.out.println("Opción 8 seleccionada");
                    break;
                case 9:
                    System.out.println("Opción 9 seleccionada");
                    break;
                case 10:
                    System.out.println("Opción 10 seleccionada");
                    break;
                case 11:
                    System.out.println("Opción 11 seleccionada");
                    break;
                case 12:
                    System.out.println("Opción 12 seleccionada");
                    break;
                case 13:
                    System.out.println("Opción 13 seleccionada");
                    break;
                case 14:
                    System.out.println("Opción 14 seleccionada");
                    break;
            }
        }

    }
}

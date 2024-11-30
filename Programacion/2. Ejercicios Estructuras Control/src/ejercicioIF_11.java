import java.util.Scanner;

public class ejercicioIF_11 {

    public static void main(String[] args) {

        int numero1, numero2, numero3;
        boolean ascendente;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        numero2 = scanner.nextInt();
        System.out.println("Introduce un tercer número: ");
        numero3 = scanner.nextInt();
        System.out.println("¿Desea ordenarlos ascendente o descendentemente?: ");
        ascendente = scanner.nextBoolean();

        if (ascendente) {
            if ((numero1 < numero2) && (numero2 < numero3)) {
                System.out.println(+numero1 + " " + numero2 + " " + numero3);
            } else if ((numero2 < numero1) && (numero1 < numero3)) {
                System.out.println(+numero2 + " " + numero1 + " " + numero3);
            } else if ((numero3 < numero1) && (numero1 < numero2)) {
                System.out.println(+numero3 + " " + numero1 + " " + numero2);
            } else if ((numero3 < numero2) && (numero2 < numero1)) {
                System.out.println(+numero3 + " " + numero2 + " " + numero1);
            } else if ((numero1 < numero3) && (numero3 < numero2)) {
                System.out.println(+numero1 + " " + numero3 + " " + numero2);
            } else if ((numero2 < numero3) && (numero3 < numero1)) {
                System.out.println(+numero2 + " " + numero3 + " " + numero1);
            }
        } else {
            if ((numero1 < numero2) && (numero2 < numero3)) {
                System.out.println(+numero3 + " " + numero2 + " " + numero1);
            } else if ((numero2 < numero1) && (numero1 < numero3)) {
                System.out.println(+numero3 + " " + numero1 + " " + numero2);
            } else if ((numero3 < numero1) && (numero1 < numero2)) {
                System.out.println(+numero2 + " " + numero1 + " " + numero3);
            } else if ((numero3 < numero2) && (numero2 < numero1)) {
                System.out.println(+numero1 + " " + numero2 + " " + numero3);
            } else if ((numero1 < numero3) && (numero3 < numero2)) {
                System.out.println(+numero2 + " " + numero3 + " " + numero1);
            } else if ((numero2 < numero3) && (numero3 < numero1)) {
                System.out.println(+numero1 + " " + numero3 + " " + numero2);
            }
        }
    }
}

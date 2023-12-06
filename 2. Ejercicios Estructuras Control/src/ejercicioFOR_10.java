import java.util.Scanner;

public class ejercicioFOR_10 {

    public static void main(String[] args) {

        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 0; i < 6; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca una nota: ");
            double nota = scanner.nextDouble();

            if (nota>4) {
                aprobados++;
            } else if (nota == 4){
                condicionados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("El número de aprobados es: "+aprobados);
        System.out.println("El número de condicionados es: "+condicionados);
        System.out.println("El número de aprobados es: "+suspensos);

    }

}

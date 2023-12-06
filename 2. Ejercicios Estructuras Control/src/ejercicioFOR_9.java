import java.util.Scanner;

public class ejercicioFOR_9 {

    public static void main(String[] args) {

        double numeroSueldos = 0.0, masMil = 0.0, sumSueldos = 0.0;

        for (int i = 0; i < 10 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un sueldo: ");
            int sueldo = scanner.nextInt();

            sumSueldos += sueldo;
            numeroSueldos++;

            if (sueldo>1000){
                masMil++;
            }
        }
        System.out.println("La suma de los sueldos es: "+sumSueldos);
        System.out.println("La media de los sueldos es: "+sumSueldos/numeroSueldos);
        System.out.println("Los sueldos que pasan de 1000€ son: "+masMil);


    }
}

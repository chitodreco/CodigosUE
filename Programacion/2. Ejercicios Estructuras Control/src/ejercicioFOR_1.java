import java.util.Scanner;

public class ejercicioFOR_1 {

    public static void main(String[] args) {

        int temperaturas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas temperaturas quieres añadir?: ");
        temperaturas = scanner.nextInt();

        double temperatura, media;
        double sumaTemperaturas = 0.0;

        for (int i = 0; i < temperaturas; i++) {

            Scanner temp = new Scanner(System.in);
            System.out.println("Introduzca temperatura: ");
            temperatura = temp.nextDouble();

            if (temperatura < 0 || temperatura ==0) {
                temperatura = 10.0;
            }
            sumaTemperaturas += temperatura;
        }

        media = sumaTemperaturas/temperaturas;

        System.out.printf("La media de las temperaturas es %.2f",media);

    }
}


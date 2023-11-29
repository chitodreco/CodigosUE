import java.util.Scanner;

public class ejercicioIF_3 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        if (numero%20 == 0 && numero>-100 && numero<100){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if (numero%20 == 0 && (numero<-100 || numero>100)) {
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        } else if (numero%20 != 0 && numero>=-100 && numero<=100){
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        } else if (numero%20 != 0 && numero>-100 || numero<100){
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }
    }
}


import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        int numeroCaja;
        numeroCaja = (int) (Math.random()*(5000-1000+1)+1000);
        System.out.println("Número caja fuerte: "+numeroCaja);


        int intentos = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            int numeroElegido = scanner.nextInt();
            if (numeroElegido == numeroCaja){
                System.out.println("Enhorabuena, has abierto la caja");
                break;
            } else {
                intentos++;
                if (intentos == 5){
                    System.out.println("Caja bloqueada, has perdido la oportunidad");
                    break;
                }
                System.out.println("Error, te quedan "+(5 - intentos)+" intentos");
            }
        }
    }
}

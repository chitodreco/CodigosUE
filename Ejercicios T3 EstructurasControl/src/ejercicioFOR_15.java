import java.util.Scanner;

public class ejercicioFOR_15 {

    public static void main(String[] args) {

        int numeroAleatorio = (int) (Math.random()*30+1);

        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca el número a adivinar: ");
            int numero = scanner.nextInt();
            if (numero == numeroAleatorio){
                System.out.println("Has adivinado el número en "+(i+1)+" intentos");
            }
        }
        System.out.println("Lo siento, has agotado todos los intentos");
    }

}

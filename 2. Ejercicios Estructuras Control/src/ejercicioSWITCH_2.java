import java.util.Scanner;

public class ejercicioSWITCH_2 {

    public static void main(String[] args) {

        String caracter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter: ");
        caracter = scanner.next();
        caracter = caracter.toLowerCase();

        switch (caracter){
            case "a":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }

    }
}

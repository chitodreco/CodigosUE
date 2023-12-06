import java.util.Scanner;

public class ejercicioSWITCH_8 {

    public static void main(String[] args) {

        String caracter;
        int numero1, numero2, resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        numero2 = scanner.nextInt();
        System.out.println("Introduce operación a realizar (+,-,*,/): ");
        caracter = scanner.next();

        switch (caracter){
            case "+":
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: "+resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: "+resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: "+resultado);
                break;
            case "/":
                resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: "+resultado);
                break;
        }

    }

}

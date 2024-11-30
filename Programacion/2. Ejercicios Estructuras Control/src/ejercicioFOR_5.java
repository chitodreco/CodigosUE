import java.util.Scanner;

public class ejercicioFOR_5 {

    public static void main(String[] args) {
        
        int base, exponente;
        int resultado = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        base = scanner.nextInt();
        System.out.println("Introduce el exponente: ");
        exponente = scanner.nextInt();

        if (base == 0 && exponente == 0) {

        }for (int i = 0; i < exponente; i++) {
            resultado = resultado * base; // resultado *= base;
        }
        System.out.println(resultado);
    }
    
}

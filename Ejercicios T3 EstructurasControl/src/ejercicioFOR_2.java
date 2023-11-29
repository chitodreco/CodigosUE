import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ejercicioFOR_2 {

    public static void main(String[] args) {

        int tabla, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la tabla de multiplicar que desees: ");
        tabla = scanner.nextInt();

        if (tabla <= 0 || tabla > 10){
            System.out.println("Número erróneo");
        } else{
            for (int i = 0; i < 11; i++) {
            resultado = tabla * i;
            System.out.println(+tabla+" * "+ i + " = " + resultado);
            }
        }
    }
}

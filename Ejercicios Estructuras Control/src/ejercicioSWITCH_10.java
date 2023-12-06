import java.util.Scanner;

public class ejercicioSWITCH_10 {

    public static void main(String[] args) {

        String codigo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce código de producto: ");
        codigo = scanner.next();

        switch (codigo){

            case "abcdefg":
                System.out.println("Calcetines");
                break;
            case "abcdefgh":
                System.out.println("Pantalones");
                break;
            case "abcdefgi":
                System.out.println("Camisetas");
                break;
            case "abcdefgj":
                System.out.println("Zapatos");
                break;
            default:
                System.out.println("Producto no encontrado");

        }

    }

}

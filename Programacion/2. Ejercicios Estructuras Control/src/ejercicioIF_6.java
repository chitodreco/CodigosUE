import java.util.Scanner;

public class ejercicioIF_6 {
    public static void main(String[] args) {

        int numero1, numero2, numero3;
        double resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entre -100 y 100: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce otro número entre -100 y 100: ");
        numero2 = scanner.nextInt();
        System.out.println("Introduce el tercer número entre -100 y 100: ");
        numero3 = scanner.nextInt();

        if (numero1==0 || numero2==0 || numero3==0) {
            System.out.println("El 0 no es posible");

        } else if ((numero1>=-100 && numero1<=100) && (numero2>=-100 && numero2<=100) && (numero3>=-100 && numero3<=100)){
                resultado = (((double)1 / numero1) + ((double)1 / numero2) + ((double)1 / numero3));
                System.out.println("1/"+numero1+" + 1/"+numero2+" + 1/"+numero3+" = "+resultado);
            } else {
                System.out.println("Alguno de los números no está entre -100 y 100");
            }
    }

}

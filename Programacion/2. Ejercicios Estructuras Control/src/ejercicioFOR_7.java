import java.util.Scanner;

public class ejercicioFOR_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de tiradas:");
        int tiradas = scanner.nextInt();

        if (tiradas<1){
            tiradas = 100;
        }

        for (int i = 0; i < tiradas; i++) {
            int lance = (int) (Math.random() * 6)+1;
            System.out.println(lance);
        }

    }
}

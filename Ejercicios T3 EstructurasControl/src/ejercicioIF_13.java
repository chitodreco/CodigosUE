import java.util.Scanner;

public class ejercicioIF_13 {

    public static void main(String[] args) {

        int dia, mes, ano;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un día: ");
        dia = scanner.nextInt();
        System.out.println("Introduce un mes: ");
        mes = scanner.nextInt();
        System.out.println("Introduce un ano: ");
        ano = scanner.nextInt();

        if (dia<1 || dia>31) {
            System.out.println("Día incorrecto");
        } else if (mes<1 || mes>12) {
            System.out.println("Mes incorrecto");
        } else if (ano<1000 || ano>3000) {
            System.out.println("Año incorrecto");
        } else {
            System.out.println(+dia+"/"+mes+"/"+ano);
        }
    }
}

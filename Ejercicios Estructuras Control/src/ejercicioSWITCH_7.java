import java.util.Scanner;

public class ejercicioSWITCH_7 {

    public static void main(String[] args) {

        int nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de la nota: ");
        nota = scanner.nextInt();

        if ((nota<1 || nota>5)){
            System.out.println("Nota incorrecta");
        } else {

            switch (nota) {
                case 1, 2:
                    System.out.println("Suspenso");
                    break;
                case 3:
                    System.out.println("Aprobado");
                    break;
                case 4:
                    System.out.println("Notable");
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    break;
            }
        }
    }

}


import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        int[] carton = new int[10]; // 2 0 0 0 0 0 0 0 0 0 0
        int[] numerosSacados = new int[99]; // 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0


        for (int i = 0; i < carton.length; i++) {
            boolean yasacado = false;
            int aleatorio = (int) (Math.random() * 99) + 1;
            do {
                for (int j = 0; j <= i; j++) {
                    if (carton[j] == aleatorio) {
                        yasacado = true;
                        break;
                    }
                }
            } while (yasacado) ;

            carton[i] = aleatorio;

        }

        for (int item : carton){
            System.out.print(item + " ");
        }
    }
}





import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        int[] carton = new int[10]; // 2 0 0 0 0 0 0 0 0 0 0
        int[] numerosSacados = new int[99]; // 2 10 0 0 0 0 0 0 0 0 0 0 0 0 0
        int aciertosLinea = 0;
        int aciertosBingo = 0;
        int cantarLinea = 0;
        int cantarBingo = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuánto quieres apostar?: ");
        int apuesta = scanner.nextInt();
        System.out.println("¿Con cuántas bolas saldrá bingo?: ");
        int bingo = scanner.nextInt();

        for (int i = 0; i < carton.length; i++) {
            boolean yasacado;
            int aleatorio;
            do {
                yasacado = false;
                aleatorio = (int) (Math.random() * 99) + 1;
                for (int j = 0; j < i; j++) {
                    if (carton[j] == aleatorio) {
                        yasacado = true;
                        break;
                    }
                }
            } while (yasacado);

            carton[i] = aleatorio;

        }
        System.out.println("El cartón jugado es: ");

        for (int item : carton) {
            System.out.print(item + " ");
        }
        System.out.println();

// este for genera los números del Bingo, y el do-while de dentro comprueba que no sean repetidos

        for (int i = 0; i < numerosSacados.length && cantarBingo < carton.length; i++) {
            int aleatorio;
            boolean yasacadoBingo;

            do {
                aleatorio = (int) (Math.random() * 99) + 1;
                yasacadoBingo = false;
                for (int j = 0; j < i; j++) {
                    if (numerosSacados[j] == aleatorio) {
                        yasacadoBingo = true;
                        break;
                    }
                }
            } while (yasacadoBingo);

            numerosSacados[i] = aleatorio;

// este for recorre cada número del cartón y lo compara con el aleatorio sacado del bingo. Contea cada bola acertada
// para línea (5 aciertos) y para bingo (10 aciertos). Cuando llega a 5 o 10, guarda el valor de i como
// el número de interación de bola sacada

            for (int j = 0; j < carton.length; j++) {
                if (carton[j] == aleatorio) {
                    aciertosLinea++;
                    if (aciertosLinea == 5) {
                        cantarLinea = i;
                    }
                    aciertosBingo++;
                    if (aciertosBingo == 10) {
                        cantarBingo = i;
                    }
                }

            }

        }
        System.out.println();
        System.out.println("Los números del bingo han sido: ");
        for (int item : numerosSacados) {
            System.out.print(item + " ");
        }

// muestra en qué iteración hemos cantado línea y en cuál bingo

        System.out.println();
        System.out.printf("Ha salido línea con %d bolas sacadas\n",cantarLinea);
        System.out.printf("Ha salido bingo con %d bolas sacadas\n",cantarBingo);
        System.out.println();

        if (bingo == cantarBingo){
            int ganancias = apuesta * 10;
            System.out.printf("¡Enhorabuena!¡Has ganado %d €!\n",ganancias);
        } else {
            System.out.println("Lo sentimos... esta vez gana la banca");
        }

    }

}





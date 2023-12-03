//2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
// Una vez hecho esto realizará las siguientes operaciones:
//        - modificar todos los 6 por 8
//        - modificar todos los 7 por 15
//        - modificar todos los 20 por 10
//
//        Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.

public class Ejercicio6_Arrays {

    public static void main(String[] args) {

        int[] numeros = new int[20];
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;

        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random()*30);
            numeros[i] = aleatorio;
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6) {
                numeros[i] = 8;
                contador++;
            }if (numeros[i] == 7) {
                numeros[i] = 15;
                contador2++;
            }if (numeros[i] == 20) {
                numeros[i] = 10;
                contador3++;
            }
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Los números 6 modificados han sido: "+contador);
        System.out.println("Los números 7 modificados han sido: "+contador2);
        System.out.println("Los números 20 modificados han sido: "+contador3);

    }

}

package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Entrada2 {

    public static void main(String[] args) {

        int[] numerosUsuario = new int[5];
        int[] numerosAleatorios = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numerosUsuario.length; i++) {
        int numero;
            do {
                System.out.println("Introduce un número: ");
                numero = sc.nextInt();
                if (numero < 1 || numero > 10){
                    System.out.println("Número incorrecto");
                }
            }while (numero<1 || numero>10);
            numerosUsuario[i] = numero;
        }

        System.out.println(Arrays.toString(numerosUsuario));

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero;
            do {
                numero = (int) ((Math.random()*10) + 1);
                if (estaNumero(numerosAleatorios, numero)){
                    System.out.println("Número repetido");
                }
            }while (estaNumero(numerosAleatorios, numero));
            numerosAleatorios[i] = numero;
        }

        System.out.println(Arrays.toString(numerosAleatorios));

        int aciertos = 0;

        for (int item: numerosUsuario) {
            for (int i = 0; i < numerosAleatorios.length; i++) {
                if (item == numerosAleatorios[i]){
                    aciertos++;
                }
            }
        }
        System.out.println("aciertos = " + aciertos);
    }

    public static boolean estaNumero(int[] listado, int numero){
        for (int item : listado) {
            if (item == numero){
                return  true;
            }
        }
        return  false;
    }

}

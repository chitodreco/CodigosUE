//1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
// Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//        - Ver todas las palabras: mostrarla todas las palabras del array
//        - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//        - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//        - Ver media de letras: mostrará el número medio de letras entre todas las palabas
//        - Ver palabra con más letras
//        - Ver palabra con menos letras

import java.util.Scanner;

public class Ejercicio7_Arrays {

    public static void main(String[] args) {

        String[] palabras = new String[10];
        int[] longPalabra = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contadorLetras = 0;
        int tamano;
        int maximo = 0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduzca una palabra: ");
            String palabra = scanner.next();
            palabras[i] = palabra;
        }
        System.out.println();
        for (String item: palabras) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();

        int aleatorio = (int) (Math.random()*10);
        for (String item:palabras) {
            System.out.println("La palabra al azar es: "+palabras[aleatorio]);
            break;
        }

        System.out.println();

        for (String item:palabras) {
            contadorLetras += item.length();
        }
        System.out.println("El número total de letras son: "+contadorLetras);

        double media = ((double) contadorLetras / palabras.length);
        System.out.printf("La media de letras entres todas las palabras es %.2f",media);

        System.out.println();
        System.out.println();

        int minimo = palabras[0].length();

        for (int i = 1; i < palabras.length; i++) {
                tamano = palabras[i].length();
                longPalabra[i] = tamano;
                if (longPalabra[i] > maximo ) {
                    maximo = longPalabra[i];
                }
                if (longPalabra[i] < minimo){
                    minimo = longPalabra[i];
                }
        }


        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == maximo){
                System.out.println("La palabra más larga es: "+palabras[i]);
            }
            if ( palabras[i].length() == minimo) {
                System.out.println("La palabra más pequeña es: "+palabras[i]);
            }

        }

    }
}

//1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
//        - Crear un de chars con todas las letras del abecedario.
//        - Crear un array de String con una longitud pedida por teclado
//        - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
//        Tras pedir la longitud se creará una palabra de forma aleatoria
//        con la longitud deseada (cada letra será una posición del array del apartado 1)
//        y se guardará en el array del apartado 2
//        - Imprimir por pantalla las palabras generadas

import java.util.Scanner;

public class Ejercicio6_ArrayMulti {

    public static void main(String[] args) {

        char[] letras = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántas palabras quieres guardar: ");
        int tamano = scanner.nextInt();

        String[] palabras = new String[tamano];

        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("Cuál es la longitud de la palabra %d: ",i + 1);
            int longitud = scanner.nextInt();
            palabras[i] ="";

            for (int j = 0; j < longitud; j++) {
                int posicionLetras = (int) (Math.random()*letras.length);
                palabras[i] += letras[posicionLetras];
            }
            System.out.println(palabras[i]);
        }

    }
}

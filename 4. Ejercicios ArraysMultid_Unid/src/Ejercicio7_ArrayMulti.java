//1. (AhorcadoArray) Crear un array de String donde se guarden 20 palabras.
// El sistema deberá de seleccionar una de las palabras pertenecientes al array.
// Una vez seleccionada se jugará al juego del ahorcado donde la palabra
// a acertar será la seleccionada. Para ello las normas son las siguientes:
//        - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
//        - Se pedirá por pantalla la letra con la que se quiere probar
//        - En el caso de acertar se mostrará la letra en la posición correspondiente
//        - En el caso de falla se restará una vida
//        - El programa continuará hasta que:
//        - Acierte la palabra
//        - Me quede sin vidas

import java.util.Scanner;

public class Ejercicio7_ArrayMulti {

    public static void main(String[] args) {

        String[] palabras = new String[]{"casa", "perro", "movil", "tele", "lapiz", "madrid", "lorena"};


        int aleatorio = (int) (Math.random()*palabras.length);
        String palabraSeleccionada = palabras[aleatorio];

        char [] desglosePalabra = new char[palabraSeleccionada.length()];
        int vidas = 10;

        for (int i = 0; i < desglosePalabra.length; i++) {
            desglosePalabra[i] = '_';
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (vidas > 0) {

            for (char item:desglosePalabra) {
                System.out.print(item + " ");
            }

            System.out.println();

            System.out.println("Introduzca una letra: ");
            char intento = scanner.next().charAt(0);
            boolean letraAcertada = false;

            for (int i = 0; i < palabraSeleccionada.length(); i++) {

                if (intento == palabraSeleccionada.charAt(i)) {
                    desglosePalabra[i] = intento;
                    letraAcertada = true;
                }
            }
            if (!letraAcertada) {
                vidas--;
            }

            boolean palabraAcertada = true;
            for (char item:desglosePalabra) {
                if (item == '_'){
                    palabraAcertada = false;
                }
            }

            if(palabraAcertada){
                System.out.println("Enhorabuena! Has acertado la palabra: "+palabraSeleccionada);
                break;
            }
        }

        if (vidas == 0){
            System.out.println("Oops! Te has quedado sin vidas. La palabra era: "+palabraSeleccionada);
        }

    }
}

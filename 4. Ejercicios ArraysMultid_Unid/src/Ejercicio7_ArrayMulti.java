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
        System.out.println(palabraSeleccionada);

        char [] desglosePalabra = new char[palabraSeleccionada.length()];

        char letra;

        for (int i = 0; i < palabraSeleccionada.length(); i++) {
            System.out.print("_ ");
            letra = desglosePalabra[i];
            System.out.print(letra);
        }
        System.out.println(desglosePalabra);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduzca una letra: ");
//        String letra = scanner.next();
//        boolean acierto = false;
//
//        for (int i = 0; i < palabraSeleccionada.length(); i++) {
//            if (letra == palabraSeleccionada[i]){
//
//            }
//        }

    }
}

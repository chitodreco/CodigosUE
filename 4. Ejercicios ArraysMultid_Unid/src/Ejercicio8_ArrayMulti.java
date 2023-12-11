//1. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible.
// Para ello el programadebe:
//        - pedir el número de participantes (de ser impar saltará un fallo)
//        - pedir el nombre de cada uno de los participantes
//        - sacar por pantalla el orden de las parejas resultantes

import java.util.Scanner;

public class Ejercicio8_ArrayMulti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroParticipantes;

        do {

            System.out.println("Introduzca el número de participantes: ");
            numeroParticipantes = scanner.nextByte();
        } while (numeroParticipantes % 2 != 0);

        String[] participantes = new String[numeroParticipantes];

        String nombre;

        for (int i = 0; i < participantes.length; i++) {
            System.out.println("Introduzca el nombre de los participantes: ");
            nombre = scanner.next();
            participantes[i] = nombre;
        }


        System.out.println();

        String[][] parejas = new String[participantes.length / 2][2];
        boolean [] participanteAsignado = new boolean[participantes.length];

        int aleatorio;

        for (int i = 0; i < parejas.length; i++) {
            for (int j = 0; j < parejas[i].length; j++) {

                do {
                    aleatorio = (int) (Math.random() * participantes.length);
                } while (participanteAsignado[aleatorio]);

                parejas[i][j] = participantes[aleatorio];
                participanteAsignado[aleatorio] = true;
            }
        }

        for (String[] fila : parejas) {
            for (String item : fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}




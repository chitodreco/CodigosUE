//3. (SumaArrays) Crear una aplicación que:
//        - pida la longitud de dos arrays de enteros
//        - crea los array de enteros con las longitudes introducidas
//        - crea un tercer array de la misma longitud que los dos anteriores
//        - rellena el tercer array con la suma de las posiciones
//        (Array1.posicion1 + array2.posicion = array3.posicion)


import java.util.Scanner;

public class Ejercicio3_ArrayMulti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca longitud para 2 arrays: ");
        int longitud1 = scanner.nextInt();
        int [] array1 = new int[longitud1];
        int[] array2 = new int[longitud1];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*99);
        }
        for (int item:array1) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*99);
        }
        for (int item:array2) {
            System.out.print(item + " ");
        }
        System.out.println();

        int [] array3 = new int[array2.length];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array2[i] + array1[i];
        }
        for (int item:array3) {
            System.out.print(item + " ");
        }

    }

}

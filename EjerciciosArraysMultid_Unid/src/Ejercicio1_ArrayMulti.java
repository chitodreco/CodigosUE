import java.util.Scanner;

//1. (MultiplicarArray) Crear un array de 5 posiciones:
//        - se le pedirá al usuario que introduzca cada unos de los elementos del array
//        - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
//        - Saca por consola la suma de todos los números
//        - Saca la media de todos los elementos
public class Ejercicio1_ArrayMulti {

    public static void main(String[] args) {

        int [] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }

        for (int item:array){
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        for (int item:array){
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println(suma);
        System.out.println();
    }

}

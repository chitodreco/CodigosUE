//Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
// Una vez metidos, se deberá mostrar:
//        - Numero de puntos obtenidos
//        - Media de puntos obtenidos
public class Ejercicio2_Arrays {

    public static void main(String[] args) {

        int [] numeros = new int[30];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = (int) (Math.random()*10);
            numeros[i] = numero;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println(suma);
        double media = (double) suma / numeros.length;
        System.out.println(media);
    }

}

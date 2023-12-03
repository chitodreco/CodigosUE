//4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
// Carga el array numero con valores aleatorios entre 0 y 100.
//        - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
//        - En el array cubo se deben almacenar los cubos de los valores que hay en numero.


public class Ejercicio4_Arrays {

    public static void main(String[] args) {

        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];

        for (int i = 0; i < numero.length; i++) {
            int aleatorio = (int) (Math.random()*100);
            numero[i] = aleatorio;
        }
        for (int item : numero) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        for (int item : cuadrado) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }
        for (int item : cubo) {
            System.out.print(item + " ");
        }
    }

}

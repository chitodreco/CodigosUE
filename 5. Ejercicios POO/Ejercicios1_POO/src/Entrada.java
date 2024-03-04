//2. Crear una clase llamada entrada que tenga un método main el cual:
//        - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
//        - Cree la persona asociada a los datos leídos por teclado (p1)
//        - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
//        - Crear una persona sin datos asociados
//        - Mostrar los datos de todas las personas
//        - Modificar la edad de todas las personas a 20

import model.Persona;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la persona: ");
        String nombre = scanner.next();
        System.out.println("Introduzca el apellido de la persona: ");
        String apellido = scanner.next();
        System.out.println("Introduzca el dni de la persona: ");
        String dni = scanner.next();
        System.out.println("Introduzca la edad de la persona: ");
        int edad = scanner.nextInt();
        System.out.println("Introduzca el peso de la persona: ");
        int peso = scanner.nextInt();
        System.out.println("Introduzca la altura de la persona: ");
        double altura = scanner.nextDouble();
        Persona p1 = new Persona(nombre, apellido, dni, edad, peso, altura);

        p1.mostrarDatos();
    }
}

//2. Crear una clase llamada entrada que tenga un método main el cual:
//        - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
//        - Cree la persona asociada a los datos leídos por teclado (p1)
//        - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
//        - Crear una persona sin datos asociados
//        - Mostrar los datos de todas las personas
//        - Modificar la edad de todas las personas a 20

//4. En la clase entrada creada en el ejercicio 2 crear los siguiente
//        La persona que tiene todos los datos (p1) muestra por pantalla su IMC
//        Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico
//        de la persona. Para ello hay que tener en cuenta lo siguiente
//        - Peso inferior al normal		Menos de 18.5
//        - Normal		18.5 – 24.9
//        - Peso superior al normal		25.0 – 29.9
//        - Obesidad		Más de 30.0

//5. Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona. En este caso,
//        para poder calcular el IMC según genero se utilizan las siguientes tablas
//





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
        System.out.println("Introduzca la altura de la persona: ");
        double altura = scanner.nextDouble();
        System.out.println("Introduzca el peso de la persona: ");
        int peso = scanner.nextInt();
        System.out.println("Introduzca el genero (H/M): ");
        String genero = scanner.next();
        Persona p1 = new Persona(nombre, apellido, dni, edad, altura, peso, genero);

        p1.mostrarDatos();

        Persona p2 = new Persona("Roberto", "Panizo"){};

        Persona p3 = new Persona(){};

//        p1.mostrarDatos();
//        p2.mostrarDatos();
//        p3.mostrarDatos();
//
//        p1.setEdad(20);
//        p2.setEdad(20);
//        p3.setEdad(20);
//
//        p1.mostrarDatos();
//        p2.mostrarDatos();
//        p3.mostrarDatos();
//
//        p1.incrementarEdad(10);
//        p1.mostrarDatos();

        p1.calcularIMC();

    }
}

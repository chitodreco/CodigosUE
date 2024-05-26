//Desarrollar una clase entrada donde:
//
//        - Se cree una figura de cada tipo, pasando los datos necesarios para el cálculo de la base y perímetro
//        - Calcula cada uno de los datos mostrando el mensaje "La base del rectángulo es: XXX"

//**Modificación**
//        se mostrará un menú por el cual se podrán seleccionar opciones a ejecutar (operaciones con triangulo,
//        con circulo y con cuadrado) una vez seleccionada la figura a trabajar se pedirá los datos necesarios
//        (base, altura o radio) y la operación a realizar (calcular area, diámetro y/o perímetro)-
//        El menú será el siguiente:
//
//        - 1 Trabajar con triángulos
//        - Introduce base
//        - Introduce altura
//        - Que operación quieres hacer
//        - Calcular área
//        - Mostrar datos
//        - Pulsa enter para continuar (teclado.next())
//        - 2 Trabajar con círculos
//        - Introduce radio
//        - Que operación quieres hacer
//        - Calcular área
//        - Calcular diámetro
//        - Mostrar datos
//        - Pulsa enter para continuar (teclado.next())

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(3,6);
        Cuadrado cuadrado = new Cuadrado(4,4);

        System.out.println("El área del cuadrado es: "+cuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es: "+cuadrado.calcularPerimtero());
        System.out.printf("El área del círculo es: %.2f\n",+circulo.calcularArea());
        System.out.println("El diámetro del círculo es: "+circulo.calcularDiametro());
        System.out.println("El área del triángulo es: "+triangulo.calcularArea()+"\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Trabajar con triángulos");
        System.out.println("2. Trabajar con círculos");
        System.out.println("3. Trabajar con cuadrados");
        System.out.println("Indica una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduce base: ");
                int base = scanner.nextInt();
                System.out.println("Introduce altura: ");
                int altura = scanner.nextInt();
                System.out.println("¿Qué operación quieres realizar?");
                System.out.println("1. Calcular área\n2. Mostrar datos\nPulsa Enter para continuar");
                int respuesta = scanner.nextInt();
                switch (respuesta){
                    case 1:
                        System.out.println(triangulo.calcularArea(base, altura));
                    case 2:
                        System.out.println("La base es de "+base+", y la altura es de: "+altura);
                    default:
                        continue ;
                }

        }

    }
}

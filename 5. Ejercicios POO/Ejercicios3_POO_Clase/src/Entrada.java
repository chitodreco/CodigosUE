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
//          - 3 Trabajar con cuadrados
//        - Introduce base
//        - Introduce altura
//        - Que operación quieres hacer
//        - Calcular área
//        - Calcular perímetro
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
                        break;
                    case 2:
                        System.out.println("La base es de "+base+", y la altura es de: "+altura);
                        break;
                    default:
                        break;
                }

            case 2:
                System.out.println("Introduce radio: ");
                double radio = scanner.nextInt();
                System.out.println("¿Qué operación quieres realizar?");
                System.out.println("1. Calcular área\n2. Calcular diámetro\n3. Mostrar datos\n" +
                        "Pulsa Enter para continuar");
                int respuesta1 = scanner.nextInt();
                switch (respuesta1){
                    case 1:
                        System.out.printf("El área del círculo es: %.2f\n",circulo.calcularArea(radio));
                        break;
                    case 2:
                        System.out.printf("El diámetro del círculo es: %.2f\n",circulo.calcularDiametro(radio));
                        break;
                    case 3:
                        System.out.println("El radio del círculo es: "+radio);
                    default:
                        break;
                }
                case 3:
                System.out.println("Introduce la base: ");
                int base1 = scanner.nextInt();
                System.out.println("Introduce la altura: ");
                int altura1 = scanner.nextInt();
                System.out.println("¿Qué operación quieres realizar?");
                System.out.println("1. Calcular área\n2. Calcular perímetro\n3. Mostrar datos\n" +
                        "Pulsa Enter para continuar");
                int respuesta2 = scanner.nextInt();
                switch (respuesta2){
                    case 1:
                        System.out.printf("El área del cuadrado es: %.2f\n",cuadrado.calcularArea(base1,altura1));
                        break;
                    case 2:
                        System.out.printf("El perímetro del cuadrado es: %.2f\n",cuadrado.calcularPerimtero(base1,altura1));
                        break;
                    case 3:
                        System.out.println("La base del perímetro es: "+base1+", y la altura es: "+altura1);
                    default:
                        break;
                }
        }

    }
}

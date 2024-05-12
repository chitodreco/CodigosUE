import utils.Sexo;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Entrada {
    public static double calculoIMC(double peso, double altura){
        return peso / (altura * altura);
    }

    public static void main(String[] args) {

        String nombre, apellido;
        int edad;
        double altura, peso, IMC;
        Sexo sexo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = scanner.next();
        System.out.println("Introduce tu apellido: ");
        apellido = scanner.next();
        System.out.println("Introduce tu edad: ");
        edad = scanner.nextInt();
        System.out.println("Introduce tu altura en metros: ");
        altura = scanner.nextDouble();
        System.out.println("Introduce tu peso en kilos: ");
        peso = scanner.nextDouble();
        System.out.println("Introduce tu sexo: ");
        try {
            sexo = Sexo.valueOf(scanner.next());
        }catch (Exception e){
            System.out.println("Sexo incorrecto");
        }
        IMC = calculoIMC(peso, altura);

        System.out.printf("Hola "+nombre+", tu IMC teniendo en cuenta tu altura de "+(int)(altura*100)+
                "cm, y tu peso de "+(int)peso+"kg, tiene un valor de: %.2f", IMC,+IMC);
    }
}

package ejercicio3;

import ejercicio3.model.Ingrediente;
import ejercicio3.model.Pizza;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la pizza: ");
        String nombre = sc.next();
        Pizza pizza = new Pizza(nombre);

        String respuesta;
        do{
            System.out.println("Introduzca un ingrediente: ");
            String nombreIngrediente = sc.next();
            System.out.println("Introduzca el precio del ingrediente: ");
            int precioIngrediente = sc.nextInt();
            Ingrediente ingrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
            pizza.agregarIngrediente(ingrediente);
            System.out.println("Quiere añadir otro ingrediente (y/n): ");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("y"));

        System.out.println("Tu pizza con nombre "+pizza.getNombre()+" tiene un precio de "+ pizza.getPrecio()+
                "€ y sus ingredientes son: ");
        pizza.mostrarPizza();

    }

}

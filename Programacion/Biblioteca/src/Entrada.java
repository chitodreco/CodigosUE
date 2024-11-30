import controller.Biblioteca;
import model.*;

import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Centro", "Manuel Hernández");
        biblioteca.mostrarDatosBiblio();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos libros quieres añadir: ");
        int numeroLibros = scanner.nextInt();
        System.out.println();
        biblioteca.crearCatalogo(numeroLibros);
        biblioteca.consultarEspacio();
        biblioteca.consultarNumLibros();

        biblioteca.agregarLibrosCat(new Comedia("Carlos Areces", "A123432", 200, "negro"));
        biblioteca.agregarLibrosCat(new Terror("Manuel Lázaro ", "B123432", 500, "+18"));
        biblioteca.agregarLibrosCat(new Ensayo("Manuel Lázaro ", "C123432", 100, "aventura"));
        biblioteca.agregarLibrosCat(new Policiaca("Manuel Lázaro ", "D123432", 200, "ficticios"));

        biblioteca.listarLibrosCat();

    }
}

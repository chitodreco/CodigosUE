import controller.Biblioteca;
import model.Catalogo;
import model.Libro;

import java.util.Formatter;

public class Entrada {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.crearCatalogo(new Catalogo());

    }
}

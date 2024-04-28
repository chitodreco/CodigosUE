import controller.Biblioteca;


public class Entrada {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.crearCatalogo(5);
        biblioteca.agregarLibro();

    }
}

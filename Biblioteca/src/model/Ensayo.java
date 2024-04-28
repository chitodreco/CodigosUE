package model;

public final class Ensayo extends Libro{

    private String genero;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("genero = " + genero);
    }

    public Ensayo() {
    }

    public Ensayo(String autor, String ISBN, int numPaginas, String genero) {
        super(autor, ISBN, numPaginas);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

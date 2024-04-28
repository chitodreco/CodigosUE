package model;

public class Comedia extends Libro{

    private String tipoHumor;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tipoHumor = " + tipoHumor);
    }

    public Comedia() {
    }

    public Comedia(String autor, String titulo, String ISBN, int numPaginas, String tipoHumor) {
        super(autor, titulo, ISBN, numPaginas);
        this.tipoHumor = tipoHumor;
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}

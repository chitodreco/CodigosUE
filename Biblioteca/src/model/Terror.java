package model;

public final class Terror extends Libro{

    private String calificacion;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calificacion = " + calificacion);
    }

    public Terror() {
    }

    public Terror(String autor, String titulo, String ISBN, int numPaginas, String calificacion) {
        super(autor, titulo, ISBN, numPaginas);
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}

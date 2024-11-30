package ejercicio2.model;

public abstract class Figura2D implements FiguraGeometrica {

    private String nombre;

    @Override
    public abstract double calcularPerimetro();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

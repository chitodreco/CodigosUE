package ejercicio2.model;

import java.util.Objects;

public class Rectangulo extends Figura2D {

    private String nombre;
    private int longitudBase;
    private int longitudAltura;

    @Override
    public String toString() {
        return "Rectangulo{" +
                "nombre='" + nombre + '\'' +
                ", longitudBase=" + longitudBase +
                ", longitudAltura=" + longitudAltura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return longitudBase == that.longitudBase && longitudAltura == that.longitudAltura && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, longitudBase, longitudAltura);
    }

    public Rectangulo() {
    }

    public Rectangulo(String nombre, int longitudBase, int longitudAltura) {
        this.nombre = nombre;
        this.longitudBase = longitudBase;
        this.longitudAltura = longitudAltura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (longitudAltura*2) + (longitudBase*2);
        System.out.println("perimetro = " + perimetro);
        return perimetro;
    }
}

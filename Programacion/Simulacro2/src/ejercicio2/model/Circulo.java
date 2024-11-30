package ejercicio2.model;

import java.util.Objects;

public class Circulo extends Figura2D {

    private String nombre;
    private int radio;

    @Override
    public String toString() {
        return "Circulo{" +
                "nombre='" + nombre + '\'' +
                ", radio=" + radio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return radio == circulo.radio && Objects.equals(nombre, circulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, radio);
    }

    public Circulo() {
    }

    public Circulo(String nombre, int radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }


    @Override
    public double calcularPerimetro() {
        double perimetro = 2*Math.PI*radio;
        System.out.println("perimetro = " + perimetro);
        return perimetro;
    }
}

package ejercicio2.model;

import java.util.Objects;

public class Triangulo extends Figura2D {

    private String nombre;
    private int longitud1, longitud2, longitud3;

    @Override
    public String toString() {
        return "Triangulo{" +
                "nombre='" + nombre + '\'' +
                ", longitud1=" + longitud1 +
                ", longitud2=" + longitud2 +
                ", longitud3=" + longitud3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return longitud1 == triangulo.longitud1 && longitud2 == triangulo.longitud2 && longitud3 == triangulo.longitud3 && Objects.equals(nombre, triangulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, longitud1, longitud2, longitud3);
    }

    public Triangulo() {
    }

    public Triangulo(String nombre, int longitud1, int longitud2, int longitud3) {
        this.nombre = nombre;
        this.longitud1 = longitud1;
        this.longitud2 = longitud2;
        this.longitud3 = longitud3;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = longitud1 + longitud2 + longitud3;
        System.out.println("perimetro = " + perimetro);
        return perimetro;
    }
}

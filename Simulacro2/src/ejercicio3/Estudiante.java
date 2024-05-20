package ejercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;


    public double notaMedia(double nota1, double nota2, double nota3){
        double notaMedia = (nota1+nota2+nota3) / 3;
        return notaMedia;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("La nota media es de: ");
        System.out.println(notaMedia(this.nota1, this.nota2,this.nota3));
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad && nota1 == that.nota1 && nota2 == that.nota2 && nota3 == that.nota3 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3);
    }

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan",27, 3.2, 5.6, 8.3);
        Estudiante estudiante2 = new Estudiante("Ana",35, 7.4, 6.5, 9.0);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante);
        listaEstudiantes.add(estudiante2);
        estudiante.mostrarDatos();
        estudiante2.mostrarDatos();




    }
}

package model;

public class Alumno{
    private String nombre;
    private String apellido;
    private double calificacion = 0;
    private String dni;
    private int matricula;

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("calificacion = " + calificacion);
        System.out.println("dni = " + dni);
        System.out.println("matricula = " + matricula);
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, double calificacion, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.dni = dni;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

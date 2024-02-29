package model;

import java.util.Scanner;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc, velocidad, km;

    public Coche (){};
    public Coche(String marca, String modelo, String matricula, int cv, int cc, int velocidad, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.km = km;
    }

    public void mostrarDatos (){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
        System.out.println("Matricula: " +matricula);
        System.out.println("Velocidad: " +velocidad);
        System.out.println("Kilometros: "+km);
        System.out.println();
    }

    public void acelerarCoche (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique la velocidad a incrementar en el "+modelo+":");
        int nuevaVelocidad = scanner.nextInt();

        if (cc < 100) {
            velocidad += (int) (Math.random() * nuevaVelocidad);
        } else {
            velocidad += (int) ((Math.random()* nuevaVelocidad)+10);
        }

        if (velocidad<10){
            velocidad = 10;
        }

// Aumenta los km en un 50% respecto a la velocidad anterior

        int nuevoKm = (velocidad * 50) / 100;

        km += nuevoKm;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}

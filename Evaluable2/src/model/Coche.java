package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cc, cv, velocidad, km;

    public Coche (){};

    public Coche(String marca, String modelo, String matricula, int cc, int cv, int velocidad, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        this.velocidad = velocidad;
        this.km = km;
    }

    public void mostrarDatos(){
        System.out.println("Los datos del coche son:");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matricula: "+matricula);
        System.out.println("CC: "+cc);
        System.out.println("CV: "+cv);
        System.out.println("Velocidad: "+velocidad);
        System.out.println("Kilómetros: "+km);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
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

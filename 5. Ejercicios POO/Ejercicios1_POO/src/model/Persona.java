////1. Crea una clase llamada persona con los siguientes elementos
//        - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
//        - Métodos:
//        - mostrarDatos: sacará por pantalla los datos de la persona formateados
//        - Métodos getters y setters asociados
//        - Constructores:
//        - un constructor que permita crear una persona con todos los datos
//        - un constructor que permita crear una persona sin peso ni altura
//        - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0,
//        excepto el dni que lo pondrá a 111111111X
//        - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a
//        "datos por defecto", 1111111111X y 0 respectivamente

//3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
//        - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro
//        pasado por argumentos
//        - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente
//        formula IMC = peso / (altura * altura)



package model;

import java.util.Scanner;

public class Persona {

    private String nombre, apellido, dni;
    private int edad, peso;
    private double altura;

    public Persona(){
        this.nombre = "por defecto";
        this.apellido = "por defecto";
        this.dni = "111111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad, double altura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
    }

    public void incrementarEdad(int numero){
        edad += numero;
    }

    public void calcularIMC(){
        //double alturaMetros = (double) altura / 100;
        double IMC = peso / Math.pow(altura,2);
        System.out.printf("IMC: %.2f",+IMC);
        System.out.println();
        if (IMC < 18.5) {
            System.out.println("Peso inferior al normal");
        } else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Peso normal");
        } else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Peso superior al normal");
        } else if (IMC >= 30.0){
            System.out.println("Obesidad");
        }
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

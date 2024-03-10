
//Desarrollar una clase llamada Coche que:
//
//        - Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo)
//        y otro de tipo double con el precio acumulado con las averías.
//        - Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
//        - Tenga un getter para cada uno de los atributos.
//        - Un método acumularAveria que incrementará el importe gastado en averías.

package model;

public class Coche {

    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAcumulado;

    public Coche(){}

    public Coche( String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(Motor motor, String marca, String modelo) {
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void acumularAveria(double precioAcumulado){
        this.precioAcumulado += precioAcumulado;
    }

    public void setPrecioAcumulado(double precioAcumulado) {
        this.precioAcumulado = precioAcumulado;
    }

    public void mostrarDatos(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Precio reparación: "+precioAcumulado);
        System.out.println("CV: "+motor.getCv());
        System.out.println("Litros aceite: "+motor.getLitrosAceite());
    };
}

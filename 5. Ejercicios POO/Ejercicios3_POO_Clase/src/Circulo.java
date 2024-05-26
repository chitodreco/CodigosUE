//Desarrollar una clase Círculo
//
//        - Tenga un constructor vacío y un constructor con radio
//        - Tenga tres atributo de tipo double radio, diámetro y área
//        - Tenga un método donde se calcule el área (A=Pi*r2)
//        - Tenga un método donde se calcule el diámetro (D = 2*r)

public class Circulo {

    private double radio, diametro, area;

    public double calcularArea(){
        double area = Math.PI * Math.pow(radio,2);
        return  area;
    }

    public double calcularDiametro(){
        double diametro = 2*radio;
        return diametro;
    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}

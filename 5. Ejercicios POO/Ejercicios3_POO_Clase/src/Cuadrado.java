//Desarrollar una clase Cuadrado
//
//        - Tenga un constructor vacío y un constructor con base y altura
//        - Tenga dos atributos int base y altura
//        - Tenga dos atributos de tipo double área y perímetro
//        - Tenga un método que calcule su área (A=b*a)
//        - Tenga un método que calcule su perímetro (2*a+2*b)

public class Cuadrado {

    private int base, altura;
    private double area, perimetro;

    public double calcularArea(){
        double area = base * altura;
        return area;
    }

    public double calcularArea(int base, int altura){
        double area = base * altura;
        return area;
    }

    public double calcularPerimtero(){
        double perimetro = (2*altura) + (2*base);
        return perimetro;
    }
    public double calcularPerimtero(int base, int altura){
        double perimetro = (2*altura) + (2*base);
        return perimetro;
    }

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}

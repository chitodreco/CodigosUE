//1. **Trigonometría**
//
//        Desarrollar una clase Triangulo que:
//
//        - Tenga un constructor vacío y un constructor con base y altura
//        - Tenga dos atributos tipo int, base y altura
//        - Tenga un método que calcule su área (A=(b*al)/2)
public class Triangulo {

    private int base;
    private int altura;
    public double calcularArea(){
        int area = (base * altura)/2;
        return area;
    }

    public double calcularArea(int base, int altura){
        int area = (base * altura)/2;
        return area;
    }

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


}

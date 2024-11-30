package ejercicio2;

import ejercicio2.model.Circulo;
import ejercicio2.model.Figura2D;
import ejercicio2.model.Rectangulo;
import ejercicio2.model.Triangulo;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        ArrayList<Figura2D> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo("Circulo1",2));
        listaFiguras.add(new Triangulo("Triangulo1", 2,3,4));
        listaFiguras.add(new Rectangulo("Rectangulo1", 2,4));

        for (Figura2D item:listaFiguras) {
            System.out.println(item);
            item.calcularPerimetro();
        }

    }
}

//
//Desarrollar una clase llamada Motor que:
//
//        - Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
//        - Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
//        - Tenga un getter para cada uno de los atributos.
//        - Tenga un setter para los litros.

package model;

public class Motor {

    private int litrosAceite;
    private int cv;

    public Motor(){}

    public Motor(int cv) {
        this.cv = cv;
    }

    public Motor(int litrosAceite, int cv) {
        this.litrosAceite = 0;
        this.cv = cv;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

}

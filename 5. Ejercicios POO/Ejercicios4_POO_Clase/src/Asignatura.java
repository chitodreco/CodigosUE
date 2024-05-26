//Desarrollar una clase llamada Asignatura que:
//
//        - Tenga dos atributos private de tipo int (identificador) y de tipo double (calificación).
//        - Tenga un constructor con un parámetro de tipo int.
//        - Tenga un getter para cada uno de los atributos.
//        - Tenga un setter para la calificación.
public class Asignatura {
    private int identificador;
    private double calificacion;

    public Asignatura() {
    }

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

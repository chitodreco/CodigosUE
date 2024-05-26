//Desarrollar una clase llamada Alumno que:
//
//        - Tenga tres atributos private de tipo Asignatura.
//        - Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
//        - Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
//        - Tenga un getter para cada uno de los atributos.
public class Alumno {

    private Asignatura asignatura, asigntura2, asignatura3;

    public Alumno(Asignatura asignatura, Asignatura asigntura2, Asignatura asignatura3) {
        this.asignatura = asignatura;
        this.asigntura2 = asigntura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int valor, int valor2, int valor3) {
        asignatura = new Asignatura(valor);
        asigntura2 = new Asignatura(valor2);
        asignatura3 = new Asignatura(valor3);
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Asignatura getAsigntura2() {
        return asigntura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
}

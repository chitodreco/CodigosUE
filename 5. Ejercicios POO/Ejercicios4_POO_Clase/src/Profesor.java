//Desarrollar una clase llamada Profesor que:
//
//        - Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada.
//        Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
//
//        - Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve
//        un double.
public class Profesor {

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura().setCalificacion(Math.random()*11);
        alumno.getAsigntura2().setCalificacion(Math.random()*11);
        alumno.getAsignatura3().setCalificacion(Math.random()*11);
    }

    public double calcularMedia(Alumno alumno){
        double media = ((alumno.getAsignatura3().getCalificacion() + alumno.getAsignatura().getCalificacion()
                + alumno.getAsigntura2().getCalificacion()) / 3);
        return media;
    }

}

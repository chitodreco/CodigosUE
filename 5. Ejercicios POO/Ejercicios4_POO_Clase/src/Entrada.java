import model.Alumno;
import model.Asignatura;
import model.Profesor;

//Desarrollar una clase llamada Entrada que en su método main:
//
//        - Registrar asignatura. Cree e inicialice tres Asignaturas (a mano).
//        - Cree un model.Alumno con las tres Asignaturas (a mano).
//        - Cree un model.Profesor que le ponga calificaciones al model.Alumno y muestre por pantalla la media del model.Alumno (a mano).
//        - Comprueba mediante impresiones por pantalla las notas de cada alumno
public class Entrada {

    public static void main(String[] args) {

        Asignatura matematicas = new Asignatura();
        Asignatura lenguaje = new Asignatura();
        Asignatura historia = new Asignatura();

        Alumno paco = new Alumno(matematicas,lenguaje,historia);

        Profesor alfredo = new Profesor();

        alfredo.ponerNotas(paco);
        alfredo.calcularMedia(paco);

        System.out.printf("Las notas de %s son: ",paco);
    }
}

import model.Alumno;
import model.Colegio;

public class Entrada {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("Roberto","Panizo", 4.5, "12345678A");
        Alumno alumno2 = new Alumno("Marcos","Flórez", 5.5, "9876543A");
        Alumno alumno3 = new Alumno("Roberto","Flórez", 7, "22345678A");
        Alumno alumno4 = new Alumno("Manuel","Sánchez", 4.5, "32345678A");

        Colegio colegio = new Colegio();
        colegio.darAlta(alumno);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);
        colegio.darAlta(alumno4);


        colegio.calificarAlumno(2, 7);
        colegio.calificarAlumno(3, 8);
        colegio.calificarAlumno(5, 10);
        colegio.calificarAlumno(1, 2);

        colegio.listarAlumnos();
    }
}

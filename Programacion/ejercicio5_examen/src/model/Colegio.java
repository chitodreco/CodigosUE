package model;

import model.Alumno;

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Alumno> alumnos;

    public void listarAlumnos(){
        for (Alumno item:alumnos) {
            item.mostrarDatos();
        }
    }

    public void darAlta(Alumno alumno){
        if (alumno != null){
            alumno.setMatricula((int) (Math.random()*11+1));
            alumnos.add(alumno);
        }
    }

    public void calificarAlumno(int matricula, double nota){
        for (Alumno alumno:alumnos) {
            if (alumno.getMatricula()==matricula){
                alumno.setCalificacion(nota);
            }
        }
    }

    public Colegio() {
        alumnos = new ArrayList<>();
    }

    public Colegio(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}

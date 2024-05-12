import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Double> notasAlumnos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca la nota del alumno "+ (i+1) + ": ");
            double nota = scanner.nextDouble();
            notasAlumnos.add(nota);
        }

        System.out.println("Las notas ingrasadas son: ");
        for (int i = 0; i < notasAlumnos.size(); i++) {
            System.out.println("La nota alumno "+ (i+1) + " es: " +notasAlumnos.get(i) );
        }
        System.out.println();

//        double notaAlta = notasAlumnos.get(0);
//        for (double nota : notasAlumnos) {
//            if (nota > notaAlta){
//                notaAlta = nota;
//            }
//        }

        Collections.sort(notasAlumnos);
        double notaAlta = notasAlumnos.get(notasAlumnos.size() - 1);
        double notaBaja = notasAlumnos.get(0);

        System.out.println("La nota más alta es: "+notaAlta);
        System.out.println("La nota más baja es: "+notaBaja);
        int contadorAprobados = 0;
        int contadorSuspensos = 0;
        for (double nota:notasAlumnos) {
            if (nota >= 5){
                contadorAprobados++;
            } else {
                contadorSuspensos++;
            }
        }
        System.out.println("El número de aprobados es: "+contadorAprobados);
        System.out.println("El número de suspensos es: "+contadorSuspensos);


    }
}

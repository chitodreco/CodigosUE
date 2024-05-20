import java.io.*;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        ArrayList<String[]> estudiantes = new ArrayList<>();
        File file = new File("src/resources/alumno.txt");
        FileReader fr = null;
        BufferedReader bf = null;
        int notaAlta = 0;
        String mejorExpediente = "null";

        try {
            fr = new FileReader(file);
            bf = new BufferedReader(fr);
            String linea = null;

            while ((linea = bf.readLine()) != null) {

                String[] datos = linea.split(", ");
                estudiantes.add(datos);
                for (int i = 3; i < datos.length; i += 4) {
                    if (Integer.valueOf(datos[i]) > notaAlta){
                        notaAlta = Integer.valueOf(datos[i]);
                        mejorExpediente = datos[i-3];
                    }
                }

            }
        }catch (FileNotFoundException e){
            System.out.println("Fichero no existe");
        }catch (IOException e){
            System.out.println("No se puede leer");
        } finally {
            try {
                bf.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e){
                System.out.println("Cerrado en nulo");
            }
        }

        System.out.println(mejorExpediente);
        System.out.println(notaAlta);

    }

}

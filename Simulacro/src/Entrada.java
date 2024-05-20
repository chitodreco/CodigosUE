import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

        File file = new File("src/resources/ejercicio.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int codigo = -1;
            while ((codigo = fileReader.read()) != -1) {
                System.out.println(((char) codigo) + " "+ codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no existente");
        } catch (IOException e) {
            System.out.println("El fichero no se puede leer");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error de cerrado");
            } catch (NullPointerException e){
                System.out.println("Cerrado en nulo");
            }
        }
    }
}

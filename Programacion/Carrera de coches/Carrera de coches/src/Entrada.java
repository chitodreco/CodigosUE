import model.Carrera;
import model.Coche;

public class Entrada {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Subaru", "Impreza", "3456XXB", 95,
                1400, 0, 0);

        Coche coche2 = new Coche("BMW", "Mini", "2215ADE", 110,
                1600, 0, 0);

        Carrera carrera1 = new Carrera("",300, 5);

        carrera1.iniciarCarrera(coche1,coche2);

    }

}

//Desarrollar una clase llamada Aplicacion que en su método main:
//
//        - Cree un garaje.
//        - Cree 2 coches.
//        - El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de
//        la avería tratada.
//        - Si la avería del coche es “aceite” incrementar en 10 los litros de aceite.
//        - Los coches entrarán al menos 2 veces en el garaje.
//        - Mostrar la información de los coches al final del main.

import model.Coche;
import model.Garaje;
import model.Motor;

public class Aplicacion {

    public static void main(String[] args) {

        Coche coche1 = new Coche(new Motor(150), "Hyundai", "i50");
        Coche coche2 = new Coche(new Motor(150), "Audi","A3");
        Garaje garaje = new Garaje();

        garaje.aceptarCoche(coche1, "aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2, "motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche1, "aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2, "motor");
        garaje.devolverCoche();
        coche1.mostrarDatos();
        coche2.mostrarDatos();

    }



}

//Desarrollar una clase llamada Garaje que:
//
//        - Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches que ha ido atendiendo.
//        - El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
//        - Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada. El garaje solo podrá
//        atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
//        - Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.

package model;

public class Garaje {

    private Coche cocheTratado;
    private String averiaAsociada;
    private int numeroCoches;
    private double factura;


    public Garaje() {
    }

    public boolean aceptarCoche(Coche coche, String averiaAsociada) {

        if (cocheTratado == null) {
            System.out.println("Coche aceptado");
            cocheTratado = coche;

            if (averiaAsociada.equals("aceite")){
                cocheTratado.getMotor().setLitrosAceite(cocheTratado.getMotor().getLitrosAceite()+10);
            }
            factura = (Math.random()*500);
            cocheTratado.acumularAveria(factura);
            return true;
        }
        return false;

    }

    public void devolverCoche() {
        cocheTratado = null;
    }


}






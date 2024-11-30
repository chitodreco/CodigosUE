package ejemplo;

public class Estacion {

    private int numeroPistas, numeroEsquiadores;

    private String nombreEstacion;
    public Estacion(int numeroPistas, int numeroEsquiadores){
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;

    }
    public int recaudacion (){
        return this.numeroEsquiadores * 50;
    }




    public Estacion (int numeroEsquiadores){}
        this.numeroEsquiadores = numeroEsquiadores;
}

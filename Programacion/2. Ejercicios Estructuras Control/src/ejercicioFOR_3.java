public class ejercicioFOR_3 {

    public static void main(String[] args) {

        int numero = 0;

        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t%d * %d = %d\n",i,j,i*j);
            }

        }
    }
}




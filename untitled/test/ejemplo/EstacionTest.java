package ejemplo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
class EstacionTest {

    private  int numeroEsquiadores, racaudacion;

    public estacionTest (int numeroEsquiadores, int recaudacion){
        this.numeroEsquiadores = numeroEsquiadores;
        this.racaudacion = recaudacion;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>datos(){
        return Arrays.asList(new Object[][]{{10,500},{20,1000}, {30,1500}});
    }

    @Test
    void testrecaudacion() {
        Estacion estacion = new Estacion(numeroEsquiadores);
        int recaudacionEsperada = estacion.recaudacion();
        assertEquals("La prueba de la recaudación es errónea", recaudacionEsperada, recaudacion);
    }
}
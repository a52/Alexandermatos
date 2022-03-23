package Utilitarios;


import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneradorNumericoTest {

    @Test
    public void cantidadDeAleatoriosDos() {
        var resultado= GeneradorNumerico.cantidadAleatorios(2);
        assertEquals(2, resultado.size());
    }

    @Test
    public void verificaQueElAleatorioEstaEntr1y100() {
        var resultado= GeneradorNumerico.cantidadAleatorios(2);
        var max = Collections.max(resultado);
        var min = Collections.min(resultado);
        assertEquals(true, min >= 1 && max <= 100);
    }

    @Test
    public void verificaQueNoHayMasDe20Elementos() {
        var resultado= GeneradorNumerico.cantidadAleatorios(2);
        assertEquals(true, resultado.size() <= 20);
    }
}
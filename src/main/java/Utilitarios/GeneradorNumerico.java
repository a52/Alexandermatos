package Utilitarios;

import com.google.common.math.IntMath;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneradorNumerico {
    public static final int generaAleatorio() {
        int min = 1;
        int max = 100;
        return (int)Math.floor(Math.random()*(max-min)+1);
    }

    public static final Set<Integer> cantidadAleatorios(int n) {
        if (n > 20 ) {
            throw new InvalidParameterException("La cantidad de aleatorios no puede ser mayor de 20");
        } else if (n == 0) {
            n = 5;
        }

        Set<Integer> unicosAletorios = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            unicosAletorios.add(generaAleatorio());
        }

        return unicosAletorios;
    }

    public static final List<String> generarPrimos(int cantidad) {
        List<String> resultado = new ArrayList<String>();
        for(int i = 1; i <= cantidad; i++) {
            if (IntMath.isPrime(i)) {
                resultado.add(String.valueOf(i));
            }
        }
        return resultado;
    }
}

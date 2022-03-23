package Utilitarios;

import java.util.*;
import java.util.stream.Collectors;

public class CajeroAutomatico {
    private static List<Float> denominaciones = new ArrayList<Float>();

    public static final Map<String, String> cantidadDeBilletes(float monto) {
        denominaciones.add(2000f); // Dos mil
        denominaciones.add(1000f); // Mil
        denominaciones.add(500f);  // Quinientos
        denominaciones.add(200f);  // Docientos
        denominaciones.add(100f);  // Cien
        denominaciones.add(50f);   // Cincuenta
        denominaciones.add(25f);   // Veinticinco
        denominaciones.add(20f);   // Veinte
        denominaciones.add(1f);    // Un peso

        Map<String, String> desgloce = new HashMap<String, String>();
        var cantidad = 0f;

        // Viendo el orden del arreglo
        //System.out.println(denominaciones.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        ListIterator<Float> billetesEnDecendente = denominaciones.listIterator(denominaciones.size() - 1);
        int i = 0;

        // Desglozando la cantidad recibida
        while (billetesEnDecendente.hasPrevious()) {
            var billete = denominaciones.get(i);
            cantidad = (monto * 100) / (billete * 100);

            if (cantidad <= 1.5 && cantidad <= 3) {
                desgloce.put(String.valueOf(billete), String.valueOf((int)(cantidad)));
                monto = monto - billete;
            }
            i++;
        }

        return desgloce;
    }
}

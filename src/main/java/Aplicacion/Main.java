package Aplicacion;

import Utilitarios.CajeroAutomatico;
import Utilitarios.GeneradorNumerico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // Aletorios

            Scanner in = new Scanner(System.in);


            System.out.println("Que cantidad de aletorios quiere?");
            String aleatorios = in.nextLine();
            if (aleatorios.isEmpty()) { aleatorios = "5"; }
            var res1 = GeneradorNumerico.cantidadAleatorios(Integer.valueOf(aleatorios));
            System.out.println(res1);

            // Primos
            System.out.println("Indique la cantidad de numeros primos que quiere?");
            String primos = in.nextLine();
            if (primos.isEmpty()) { primos = "9"; }
            var res2 = GeneradorNumerico.generarPrimos(Integer.parseInt(primos));
            System.out.println(res2);

            // Cajero Automatico
        /*
            System.out.println("Monto a desglozar en denominaciones?");
            String monto = in.nextLine();
            var res3 = CajeroAutomatico.cantidadDeBilletes(Float.valueOf(monto));
            System.out.println(res3.toString()); */
        }
    }

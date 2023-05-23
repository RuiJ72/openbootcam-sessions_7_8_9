package com.openbootcam.exams;

import java.util.Vector;

public class VectorName {

    public static void main(String[] args) {

        /* 3. Crea un "Nombres" del tipo de dato que prefieras, y añádele 5 elementos.
         * Elimina el 2o y 3er elemento y muestra el resultado final.
         */

        System.out.println("Creación de un vector con cinco nombres\n");
        Vector<String> nombres = new Vector<>();
        nombres.add("Rui");
        nombres.add("Bethy");
        nombres.add("Sophie");
        nombres.add("Victória");
        nombres.add("Amir");

        System.out.println(nombres);

        System.out.println("\nEliminación del segundo y tercer elementos: \n");
        nombres.remove(1);
        nombres.remove(1);

        System.out.println(nombres);
    }
}

package com.openbootcam.exams;

import java.util.Vector;

public class ProblemVector {

    /* 4. El problema és que cuando se tienen 1000 elementos para añadir,
     * puede ser ineficiente en términos de tiempo y memoria. Cada vez que se agrega un elemento
     * y se alcanza la capacidad máxima del Vector, este aumenta su tamaño en una cantidad fija (por defecto, el doble de su tamaño actual). Esto implica la creación de un nuevo arreglo y la copia de todos los elementos del arreglo anterior al nuevo. Si se repite este proceso muchas veces,
     * puede llevar a un uso innecesario de memoria y tiempo de procesamiento.
     */




    public static class VectorCapacity {

        // 4. Indica cuál es el problema de utilizar un Vecto con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.



        // Un ejemplo en código sería:

        public static class Main {
            public static void main(String[] args) {
                int initialCapacity = 1000;
                Vector<Integer> vector = new Vector<>(initialCapacity);

                // Agregar elementos al vector
                for (int i = 0; i < 1000; i++) {
                    vector.add(i);
                }
            }
        }

    }
}

package com.openbootcam.exams;

import java.util.ArrayList;

public class ManipulatingArray {

    /* 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
     * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
     * Por último, vuelve a recorrerlo y muestra el ArrayList final
     */

    public static class Main {
        public static void main(String[] args) {
            java.util.ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i += 2) {
                numbers.add(i);
            }
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }
}


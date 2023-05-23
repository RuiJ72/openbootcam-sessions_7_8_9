package com.openbootcam.exams;

public class ArrayMultidimensional {

    /* 2. Crea un array bidimensional de enteros y recórrelo, mostrando
     * la posición y el valor de cada elemento en ambas dimensiones
     */
    public static void main(String[] args) {

        int[][] arrayBi = {
                {1, 2, 3 },
                {4, 5, 6},
                {7, 8, 9}

        };

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("La posición [" + i + "][" + j + "] = tiene el valor " + arrayBi[i][j]);
            }
        }
    }
}

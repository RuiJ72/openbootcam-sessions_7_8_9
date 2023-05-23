package com.openbootcam.exams;

public class InvertChain {

    /* Dada la funcion  public static String reverse(String texto) { }
    * Escribe el código que devuelva una cadena al revés.
    * Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */



    public static void main(String[] args) {

        String texto = "Hoola Openbootcamp";
        String textoInvertido = reverse(texto);
        System.out.println(textoInvertido);
    }

    public static String reverse(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }
}


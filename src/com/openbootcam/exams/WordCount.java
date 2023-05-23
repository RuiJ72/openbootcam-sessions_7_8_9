package com.openbootcam.exams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java WordCount <filename>");
            System.exit(1);
        }
        String filename = args[0];
        Map<String, Integer> wordCounts = new HashMap<>();
        try (InputStream in = new FileInputStream(filename)) {
            StringBuilder word = new StringBuilder();
            int data;
            while ((data = in.read()) != -1) {
                char ch = (char) data;
                if (Character.isWhitespace(ch)) {
                    if (word.length() > 0) {
                        String wordStr = word.toString();
                        wordCounts.put(wordStr, wordCounts.getOrDefault(wordStr, 0) + 1);
                        word.setLength(0);
                    }
                } else {
                    word.append(ch);
                }
            }
            if (word.length() > 0) {
                String wordStr = word.toString();
                wordCounts.put(wordStr, wordCounts.getOrDefault(wordStr, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        try (PrintStream out = System.out) {
            for (Map.Entry<String, Integer> entry : entries) {
                out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
/*
 * Para ejecutar el código del programa "WordCount"

1. Abrir un editor de texto y copia el código en un archivo nuevo. Guárdalo con el nombre "WordCount.java".
2. Abrir una terminal o línea de comandos y navegar hasta el directorio donde  el archivo "WordCount.java".
3. Compilar el código utilizando el comando "javac WordCount.java". Esto creará un archivo "WordCount.class" en el mismo directorio.
4. Ejecutar el programa utilizando el comando "java WordCount <filename>", reemplazando `<filename>` con el nombre del archivo que desean analizar.

-> Por ejemplo, si desean contar las palabras en un archivo llamado "texto.txt", ejecutarían el comando "java WordCount texto.txt".
*  Esto imprimirá en la terminal la frecuencia de cada palabra en el archivo en orden descendente.
*/

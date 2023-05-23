package com.openbootcam.exams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CopyTolinked {

    public static void main(String[] args) {

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lisboa");
        cities.add("Madrid");
        cities.add("Londres");
        cities.add("Nueva York");

        List<String> cities2 = new LinkedList<>(cities);

        System.out.println("Las ciudades son: ");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("\nCiudades en la LinkedList: ");
        for (String city : cities2) {
            System.out.println(city);
        }
    }
}


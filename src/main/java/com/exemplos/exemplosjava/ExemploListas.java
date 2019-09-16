package com.exemplos.exemplosjava;

import com.exemplos.exemplosjava.heranca1.Pessoa;
import java.util.*;

public class ExemploListas {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("a"); // 0 
        lista.add("b"); // 1
        lista.add("b"); // 1
        lista.add("c"); // 2
        lista.add("d");

        for (Object string : lista) {
            System.out.println(":: " + string);
        }
        System.out.println("item 2: " + lista.get(1));
        Set<String> set = new HashSet<>();

        set.add("a"); // 0 
        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1
        set.add("c"); // 2
        set.add("d");

        for (Object string : set) {
            System.out.println(":: " + string);
        }

        lista = new ArrayList<>(set);

        System.out.println("item b: " + set.contains("b"));
        System.out.println("item B: " + set.contains("B"));

        for (Object string : lista) {
            System.out.println(":: " + string);
        }

    }

}

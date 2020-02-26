package com.exemplos.exemplosjava;

import com.exemplos.exemplosjava.heranca1.Pessoa;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.function.Predicate;

public class ExemploListas {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("a"); // 0 
        lista.add("b"); // 1
        lista.add("b"); // 1
        lista.add("b"); // 1
        lista.add("b"); // 1
        lista.add("c"); // 2
        lista.add("d");
        lista.add("d");
        lista.add("e");

        for (Object string : lista) {
            System.out.println("lista :: " + string);
        }
        // System.out.println("item 2: " + lista.get(1));

        Set<String> set = new HashSet<>();

        set.addAll(lista);

        /* set.add("c"); // 2
        set.add("a"); // 0 

        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1

        set.add("d");

        set.add("b"); // 1
        set.add("b"); // 1
        set.add("b"); // 1
         */
        System.out.println("\n");
        for (String variavel : set) {
            System.out.println("set :: " + variavel);
        }

      
        
        for (String variavel : set) {
            long contador = lista.stream()
                    .filter(s -> s.equals(variavel))
                    .count();
            if (contador > 1) {
                lista.removeIf((String itemLista) -> 
                        itemLista.equals(variavel) && contador > 1);
            }
        }

        Collections.sort(lista);
        lista.forEach(itemLista -> {
            System.out.println("mostrando item: " + itemLista);
        });

        for (String variavel : lista) {
            System.out.println("lista fim:: " + variavel);
        }

        /*
        lista = new ArrayList<>(set);

        System.out.println("item b: " + set.contains("b"));
        System.out.println("item B: " + set.contains("B"));

        for (Object string : lista) {
            System.out.println(":: " + string);
        }
         */
    }

}

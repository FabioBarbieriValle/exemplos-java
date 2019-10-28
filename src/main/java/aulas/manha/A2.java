package aulas.manha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A2 {

    public static void main(String[] args) throws InterruptedException {

        List<Ordenar> valores = new ArrayList<>();

        for (char c = 'Z'; c >= 'A'; c--) {
            valores.add(new Ordenar(c + ""));
        }
        valores.add(new Ordenar("A"));

        Collections.sort(valores, new Comparator<Ordenar>() {
            @Override
            public int compare(Ordenar o1, Ordenar o2) {
                //CompareTo retorna um INT, sendo que -1 <= X <= 1 
                return o1.getNome().compareToIgnoreCase(o2.getNome());
            }
        });

        System.out.println("Valores: " + valores.stream().map(o -> o.toString()).collect(Collectors.joining()));

    }

}

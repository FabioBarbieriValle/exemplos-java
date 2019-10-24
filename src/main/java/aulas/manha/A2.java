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
            Thread.sleep(1);
        }
        valores.add(new Ordenar("A"));

        Collections.sort(valores, new Comparator<Ordenar>() {
            @Override
            public int compare(Ordenar o1, Ordenar o2) {
                int i = o1.getNome().compareToIgnoreCase(o2.getNome());
                if (i == 0) {
                    return 1;
                } else {
                    return i;
                }
            }
        });

        System.out.println("Valores: " + valores.stream().map(o -> o.toString()).collect(Collectors.joining()));

    }

}

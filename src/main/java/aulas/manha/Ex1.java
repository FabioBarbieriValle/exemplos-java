package aulas.manha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex1 {

    public static HashSet<String> VOGAIS = new HashSet<>(Arrays.asList("A", "E", "I", "O", "U"));

    public static void main(String[] args) {

        // Lista de nomes que deverá ser usada
        final List<String> nomes = new ArrayList<>(Arrays.asList("Joel", "Gimenes", "Kaique", "Felipe", "Murilo", "Fernanda", "Alessandra", "Laila", "Bruna", "Robso", "Igor", "Bruno", "Otavio"));
        /**
         * 1. Criar um consumer que recebe uma List<String> e mostra no console
         * todos os itens em uma única linha, separados por ' ,' (espaço e
         * virgula).
         *
         * Ex.: "Nomes: Joel, Gimenes, Felipe, Murilo, Fernanda, Alessandra,
         * Laila, Bruna, Robso, Igor"
         */
        Consumer<List<String>> mostraTodos = new Consumer<List<String>>() {
            @Override
            public void accept(List<String> lista) {
                String resultado = "";

                for (String item : lista) {
                    resultado += item + ", ";
                }

                System.out.println("Lista: " + resultado.substring(0, resultado.length() - 2));
            }
        };

        /**
         * 2. Criar um consumer que recebe uma List<String> e mostra no console
         * todos os itens que começam com uma vogal em uma única linha,
         * separados por ' ,' (espaço e virgula). (Não pode remover nenhum item
         * da lista)
         *
         * Ex.: "Nomes: Alessandra, Igor"
         */
        Consumer<List<String>> mostraVogal = new Consumer<List<String>>() {
            @Override
            public void accept(List<String> lista) {
                List<String> vogais = new ArrayList<>();

                for (String item : lista) {
                    if (VOGAIS.contains(item.trim().substring(0, 1).toUpperCase())) {
                        vogais.add(item);
                    }
                }

                mostraTodos.accept(vogais);
            }
        };

        /**
         * 3. Criar um consumer que recebe uma List<String> e mostra no console
         * todos os itens que começam com uma consoante em uma única linha,
         * separados por ' ,' (espaço e virgula). (Não pode remover nenhum item
         * da lista)
         *
         * Ex.: "Nomes: Joel, Gimenes, Felipe, Murilo, Fernanda, Laila, Bruna,
         * Robso"
         */
        Consumer<List<String>> mostraConsoante = new Consumer<List<String>>() {
            @Override
            public void accept(List<String> lista) {
                List<String> consoantes = new ArrayList<>();

                for (String item : lista) {
                    if (!VOGAIS.contains(item.trim().substring(0, 1).toUpperCase())) {
                        consoantes.add(item);
                    }
                }

                mostraTodos.accept(consoantes);
            }
        };

        /**
         * 4. Criar um comparator de String que ordena strings pelo .length() de
         * forma descendente. Quando os strings tiverem o mesmo .length(),
         * ordenar pela ordem alfabética, ignorando o case.
         *
         */
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String item1, String item2) {
                int tamanho = Integer.compare(item1.length(), item2.length());
                if (tamanho == 0) {
                    return item2.compareToIgnoreCase(item1);
                } else {
                    return tamanho;
                }
            }
        };

        /**
         * 5. Criar um preditate que quando usado em
         * 'nomes.removeIf(predicado)', remova todos os itens cujo .length()
         * seja par
         *
         */
        Predicate<String> predicado = new Predicate<String>() {
            @Override
            public boolean test(String item) {
                if (item.length() % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        /**
         * Executando os exercícios
         */
        mostraTodos.accept(nomes);
        mostraVogal.accept(nomes);
        mostraConsoante.accept(nomes);

        Collections.sort(nomes, comparador);
        mostraTodos.accept(nomes);

        nomes.removeIf(predicado);
        mostraTodos.accept(nomes);

    }

}

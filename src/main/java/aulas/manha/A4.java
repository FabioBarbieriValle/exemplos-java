package aulas.manha;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class A4 {

    public static void main(String[] args) {

        StringBuilder abc = new StringBuilder();
        //Consumer - Classe que implementa uma função que recebe 1 parametro 
        // T e NÃO retorna nada
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String linha) {
                abc.append(" ").append(linha);
                System.out.println("• " + linha);
            }
        };

        //Consumer - utilizando o lambda
        Consumer<String> consumer2 = (String linha) -> System.out.println("• " + linha);
        Consumer<String> consumer3 = (String linha) -> {
            abc.append(" ").append(linha);
            System.out.println("• " + linha);
        };

        consumer.accept("texto a ser mostrado");
        consumer.accept("texto a ser mostrado");
        consumer.accept("texto a ser mostrado");
        consumer.accept("teste");
        consumer2.accept("outro texto");
        consumer3.accept("consumer 3 de exemplo ");

        System.out.println("abc: " + abc.toString());

        Predicate<Integer> isPar = i -> i % 2 == 0;

        System.out.println("2 é par? " + isPar.test(2));

    }

}

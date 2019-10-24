package aulas.manha;

import java.util.function.Consumer;

public class A4 {

    public static void main(String[] args) {

        //Consumer - Classe que implementa uma função que recebe 1 parametro T e NÃO retorna nada
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String linha) {
                System.out.println("• " + linha);
            }
        };

        //Consumer - utilizando o lambda
        Consumer<String> consumer2 = (String linha) -> System.out.println("• " + linha);

        consumer.accept("texto a ser mostrado");
        consumer2.accept("outro texto");

    }

}

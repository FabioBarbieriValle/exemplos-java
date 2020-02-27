package aulas.manha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class A5 {

    public static void main(String[] args) {

        AtomicInteger intAtomico = new AtomicInteger();

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String linha) {
                System.out.println("• " + linha);
            }
        };

        // Supplier - Classe que implementa uma função que NÃO recebe parametros e retorna T
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Instância número " + intAtomico.getAndIncrement();
            }
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        //Function - Classe que implementa uma função que recebe T e retorna R
        Function<String, String[]> function = t -> t.split(" ");

        Function<String, String[]> function2 = new Function<String, String[]>() {
            @Override
            public String[] apply(String t) {
                return t.split(" ");
            }
        };
      
                

        String[] resultado = function.apply("Este texto vai ser quebrado");
        consumer.accept(Arrays.stream(resultado).toString());

    }

    public static void X(Object numero) {

    }

}

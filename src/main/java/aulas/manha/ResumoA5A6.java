package aulas.manha;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ResumoA5A6 {

    public static void main(String[] args) throws InterruptedException {

        Consumer<String> consumerA = variavelA -> System.out.println("ConsumerA: " + variavelA);
        Predicate<String> predicateB = variavelB -> variavelB != null && !variavelB.isEmpty();
        Supplier<String> supplierC = () -> "supplierC executado em " + new Date(System.currentTimeMillis());
        Function<String, String> functionD = variavelD -> variavelD != null ? variavelD.trim().toLowerCase() : "";

        String teste = "Exemplo";

        funcaoA(teste);
        consumerA.accept(teste);

        System.out.println("");

        System.out.println("Retorno funcaoB: " + funcaoB(teste));
        System.out.println("Retorno predicateB: " + predicateB.test(teste));

        System.out.println("");

        System.out.println("Retorno funcaoC: " + funcaoC());
        System.out.println("Retorno supplierC: " + supplierC.get());

        System.out.println("");

        System.out.println("Retorno funcaoD: " + funcaoD(teste));
        System.out.println("Retorno functionD: " + functionD.apply(teste));

        System.out.println("");
        System.out.println("Aguardando 5 segundos...");
        Thread.sleep(5000);
        System.out.println("Retorno funcaoC: " + funcaoC());
        System.out.println("Retorno supplierC: " + supplierC.get());

    }

    public static void funcaoA(String linha) {
        System.out.println("Funcao funcaoA: " + linha);
    }

    public static boolean funcaoB(String linha) {
        return linha != null && !linha.isEmpty();
    }

    public static String funcaoC() {
        return "funcaoC executada em " + new Date(System.currentTimeMillis());
    }

    public static String funcaoD(String linha) {
        return linha != null ? linha.trim().toLowerCase() : "";
    }
}

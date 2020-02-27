package aulas.manha;

import aulas.manha.wildcards.ClasseA;
import aulas.manha.wildcards.MinhaFuncao;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class A8 {

    public static void main(String[] args) {
        ClasseA<MinhaFuncao, String> classeA = new ClasseA<>();

        MinhaFuncao funcao = new MinhaFuncao();

        classeA.setValor(funcao);

        int z = funcao.apply("1");

        int x = classeA.getValor().apply("0");

        System.out.println("X: " + x);
        System.out.println("Z: " + z);
        
    }

}

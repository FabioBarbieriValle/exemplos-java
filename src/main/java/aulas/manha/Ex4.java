package aulas.manha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        /**
         * 1. Descrever resumidamente o que a função1 faz
         */

        /**
         * 2. Criar uma função que conte quantos 'espaços' existem em um string
         */
        /**
         * 3. v
         */
        System.out.println("5 Espacos: " + count("Criar uma função que conte quantas vogais existem em um string", "a", "e", "i", "o", "u"));
        System.out.println("5 Espacos: " + count2("Criar uma função que conte quantas vogais existem em um string", new char[]{'a', 'e', 'i', 'o', 'u'}));
    }

    public static List<Integer> funcao1(HashMap<Integer, String> entrada) {
        if (entrada == null) {
            return null;
        }

        List<Integer> retorno = new ArrayList<>();

        entrada.forEach((c, v) -> {
            if (c % 2 == 0 || v.length() % 2 != 0) {
                retorno.add(c);
            }
        });
        return retorno;
    }

    public static int count(String texto, String... caracteres) {
        return 0;
    }

    public static int count2(String texto, char[] caracteres) {
        return 0;
    }

}

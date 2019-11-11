package aulas.manha;

import java.util.ArrayList;
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
         * 3. Criar uma função que conte quantas vogais existem em um string
         */
        
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

}

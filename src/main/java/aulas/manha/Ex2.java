package aulas.manha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Ex2 {

    public static void main(String[] args) {

        String palavra = "amor"; // Palavra a ser testada
        System.out.println(palavra + (palimdromo(palavra) ? " é " : " não é ") + " palindromo.");

        int[] lista = {1, 2, 3, 3, 4, 5, 6, 6, 8, 9};

        removeDuplicados(new ArrayList<>(Arrays.asList()));

        int entrada = 123456789;

        inverteNumero(entrada);

        String frase = "O Kaique está na sala";

        invertePalavras(frase);

        /**
         * Palindromo.
         *
         * Um palíndromo é uma palavra, frase que tenha a propriedade de poder
         * ser lida tanto da direita para a esquerda como da esquerda para a
         * direita. Num palíndromo, normalmente são desconsiderados os sinais
         * ortográficos (diacríticos ou de pontuação), assim como o espaços
         * entre palavras.
         */
        /**
         * 1. Criar uma função que determine se um String é palindromo.
         */
        /**
         * 2. Crie uma função que remova números duplicados de um Array ou List
         */
        /**
         * 3. Crie uma função que inverta as palavras em uma frase.
         *
         * Ex: Entrada - "O Kaique está na sala" Saida - "sala na está Kaique O"
         */
        /**
         * 4. Crie uma função que inverta os algarismos em um número
         *
         * Ex: Entrada - 123456 Saida - 654321
         */
    }

    private static boolean palimdromo(String texto) {

        String inverso = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            inverso = inverso + texto.charAt(i);
        }
        return texto.toLowerCase().equals(inverso.toLowerCase());
    }

    private static void removeDuplicados(List<Integer> lista) {

        Set<Integer> set = new HashSet<>();
        lista.forEach((Integer a) -> {
            set.add(a);
        });
        lista.remove(set);

        System.out.println(lista);
    }

    private static String invertePalavras(String frase) {

        String fraseInvertida = "";

        String palavras[] = frase.split(" ");

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(palavras[i] + " ");
        }

        return fraseInvertida;
    }

    private static int inverteNumero(int entrada) {

        String reverso = new StringBuffer(Integer.toString(entrada)).reverse().toString();
        System.out.println(entrada + "\n" + reverso);
        return 0;
    }

}

package com.exemplos.exemplosjava;

import com.exemplos.exemplosjava.heranca1.Pessoa;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

public class Exemplo2 {

    public static void main(String[] args) throws Exception {

        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] arrayString = new String[]{};
        int[] arrayNulo = null;

//        System.out.println("Itens do array 'arrayInt': " + Arrays.toString(arrayInt));
//        System.out.println("Itens do array 'arrayString': " + Arrays.toString(arrayString));
//        System.out.println("Itens do array 'arrayString': " + Arrays.toString(arrayNulo));
//        System.out.println("\n");
//
//        for (int i = 0; i < arrayInt.length / 2; i++) {
//
//            int valor = arrayInt[i];
//            System.out.println("Array - " + i + " " + valor);
//
//        }
//        System.out.println("\n");
//
//        int j = 0;
//        while (j < 5) {
//            System.out.println("Array2 - " + j + " " + arrayInt[j]);
//            j++;
//        }
//        for (int valor : arrayInt) {
//            System.out.println("Array - " + valor);
//        }
        int tamanho = 5;

        String[] nome = new String[tamanho];
        String[] sobrenome = new String[tamanho];
        int[] idade = new int[tamanho];

//        int controle = 0;
//        while (controle < 5) {
//
//            //scan nome
//            nome[controle] = "Robso" + controle;
//
//            //scan sobrenome
//            sobrenome[controle] = "silva" + +controle;
//
//            //scan idade
//            idade[controle] = controle;
//
//            controle++;
//        }
//
        Alguem[] pessoas = new Alguem[tamanho];

        int controle = 0;
        while (controle < 5) {
            // scan nome
            // scan sobrenome
            // scan idade         

            pessoas[controle] = new Alguem("Robson", "Silva", 10);

            controle++;
        }

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Array - " + pessoas[i].getInformacoes());
        }

    }

}

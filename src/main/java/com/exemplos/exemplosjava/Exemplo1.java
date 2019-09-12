package com.exemplos.exemplosjava;

import java.util.HashMap;

public class Exemplo1 {

    public static void main(String[] args) {

        //Cria o HashMap
        HashMap<String, Object> chaveValor = new HashMap<>();

        //poe o texto 'José' na chave 'nome'
        chaveValor.put("nome", "José");

        funcao1(chaveValor);

        /**
         * Alterações feitas no HashMap são mantidas mesmo apenas passando o
         * objeto por parametro
         */
        System.out.println("Nome antes de funcao2: " + chaveValor.getOrDefault("nome", "<VAZIO>"));
        funcao2(chaveValor);
        System.out.println("Nome depois de funcao2: " + chaveValor.getOrDefault("nome", "<VAZIO>"));

        /**
         * Note que dentro de funcao1 e funcao2 o HashMap 'chaveValor' posui
         * outro nome, porém as duas variáveis apontam para a mesma referencia
         * na memória
         */
//        
//        
//        
        /**
         * Funcao3 define o objeto 'mapa3' como nulo, porém ao sair da função
         * 'chaveValor' ainda existe e com todos os seus itens dentro. Por que
         * isso acontece?
         *
         * Isso acontece pois, 'chaveValor' e 'mapa3' apontam pra a mesma
         * referencia do HashMap na memória
         */
        System.out.println("Quantidade de itens antes de funcao3: " + chaveValor.size());
        funcao3(chaveValor);
        System.out.println("Quantidade de itens antes de funcao3: " + chaveValor.size());

        /**
         * Mesmo definindo 'mapa3 = new HashMap<>();' a variável 'chaveValor'
         * ainda aponta para a mesma referencia na memória .
         *
         * Resumindo, ao passar uma variável por função podemos dizer que:
         *
         * • O nome não importa, pois as variáveis apontarão para a mesma
         * referencia na memória;
         *
         * • Ao mudar o conteúdo de um objeto, a mudança permanesce, pois foi
         * feita dentro da referência na memória;
         *
         * • Ao refedinir ou tornar a variável nula, nada acontece com a
         * variável de fora da função, pois nada foi alterado diretamente na
         * referência da memória
         */
//        
//        
//        
        /**
         * Os '...' (Três pontos) é usado quando esperamos de 1 a N parametros
         * do mesmo tipo, sendo tratado como um array dentro da funcao.
         *
         * Ao chamar a função, pódemos passar somente 1 parametro, N parametros
         * ou até um array contendo os parametros
         */
        funcao4("Laila");
        funcao4("Laila", "Kaique", "Fabio", "Bruna");
        funcao4(new String[]{"Laila", "Kaique", "Fabio", "Bruna"});

    }

    public static void funcao1(HashMap<String, Object> mapa) {
        /**
         * mapa.getOrDefault("nome", "<VAZIO>") - obtem o conteúdo da chave
         * 'nome', porém se não houver a chave 'nome' ele retorna '<VAZIO>'
         */

        //Mostra no console o conteúdo das chaves 'nome' e 'sobrenome'
        System.out.println("Nome: " + mapa.getOrDefault("nome", "<VAZIO>"));
        System.out.println("Sobrenome: " + mapa.getOrDefault("sobrenome", "<VAZIO>"));

    }

    public static void funcao2(HashMap<String, Object> mapa2) {

        //Remove a chave 'nome' - (Quando a chave é removida, seu conteúdo também é)
        mapa2.remove("nome");

        //poe a chave 'sobrenome' em mapa2
        mapa2.put("sobrenome", "Silva");

    }

    public static void funcao3(HashMap<String, Object> mapa3) {

        // Redefine a variável mapa3 para uma nova instancia de um HashMap
        mapa3 = new HashMap<>();
        mapa3.put("passou_pela_funcao3", "Sim");
    }

    public static void funcao4(String... nomes) {

        System.out.println("Lista de nomes: ");
        // Mostra no console todos os parametros que recebeu
        for (String nome : nomes) {
            System.out.println(" • Nome: " + nome);
        }
    }

}

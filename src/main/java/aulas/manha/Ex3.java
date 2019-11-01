package aulas.manha;

import aulas.manha.exercicio3.Professor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

    public static void main(String[] args) {
        /**
         * 1. Criar uma função iterativa que calcule o fatorial de um número
         */
        
        /**
         * 2. Criar uma função recursiva que calcule o fatorial de um número
         */
        
        /**
         * 3. Utilizando a lista 'professores', ordene-a pelo nome de forma
         * ascendente, e em caso de nomes iguais ordene pela data de nascimento
         * de forma ascendente, e em caso de datas iguais, ordenar pela
         * disciplina de forma ascendente
         *
         *
         */
        List<Professor> professores = carregaListaProfessores();

        /**
         * 4. Criar uma função que receba um número real e retorne ele em string
         * formatado com 2 casas decimais
         */
        
        /**
         * 5. Crie uma função que receba um String e retorne um String formatado em ProperCase
         * 
         *  Ex.: Entrada - 'hoje o dia está muito quente'
         *         Saida - 'Hoje O Dia Está Muito Quente'
         */
    }

    private static List<Professor> carregaListaProfessores() {
        return new ArrayList<>(Arrays.asList(
                new Professor("Augusto", "Nobre", new Date(90, 07, 12), "Matemática", 4500f),
                new Professor("Carlos", "Silva", new Date(89, 12, 24), "Português", 4350f),
                new Professor("Maria", "Santos", new Date(92, 01, 04), "História", 5000f),
                new Professor("Natália", "Carvalho", new Date(82, 05, 30), "Geografia", 5250f),
                new Professor("José", "Santos", new Date(87, 04, 30), "Biologia", 4700f),
                new Professor("Carlos", "Nobre", new Date(82, 05, 29), "Filosofia", 4850f))
        );

    }
}

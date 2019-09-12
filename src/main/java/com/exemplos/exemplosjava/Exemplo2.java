package com.exemplos.exemplosjava;

import com.exemplos.exemplosjava.heranca1.*;
import java.util.Date;

public class Exemplo2 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Maria", "Silva", new Date(1993, 9, 12));
        mostraInformacoes(pessoa);

        Professor prof = new Professor("José", "Santos", new Date(2005, 05, 05), "Cálculo", 2500.50f);
        mostraInformacoes(prof);

        Aluno aluno = new Aluno("Carlos", "Nascimento", new Date(1980, 07, 18), 123456, 7.5f);
        mostraInformacoes(aluno);

        /**
         * Mesmo ao dar cast de Professor para Pessoa, quando chamamos a função
         * 'getInformacoes()', será executada a que foi definida em Professor
         */
        Pessoa convertido = (Pessoa) prof;
        mostraInformacoes(convertido);

        System.out.println("\nUso do 'instanceof'");

        System.out.println("\nProfessor::");
        if ((convertido instanceof Pessoa)) {
            System.out.println("É instância de Pessoa");
        }
        if ((convertido instanceof Aluno)) {
            System.out.println("É instância de Aluno");
        }
        if ((convertido instanceof Professor)) {
            System.out.println("É instância de Professor");
        }

        /**
         * Como 'aluno' herda 'Pessoa', não é preciso dar cast
         */
        convertido = aluno;

        /**
         * Agora o inverso não é verdade, de 'Pessoa' para 'Aluno' é preciso dar
         * cast
         */
        aluno = (Aluno) convertido;

        System.out.println("\nAluno::");
        if ((convertido instanceof Pessoa)) {
            System.out.println("É instância de Pessoa");
        }
        if ((convertido instanceof Aluno)) {
            System.out.println("É instância de Aluno");
        }
        if ((convertido instanceof Professor)) {
            System.out.println("É instância de Professor");
        }

        convertido = pessoa;

        System.out.println("\nPessoa::");
        if ((convertido instanceof Pessoa)) {
            System.out.println("É instância de Pessoa");
        }
        if ((convertido instanceof Aluno)) {
            System.out.println("É instância de Aluno");
        }
        if ((convertido instanceof Professor)) {
            System.out.println("É instância de Professor");
        }

    }

    /**
     * Recebe a classe Pessoa ou qualquer classe que herde Pessoa e mostra suas
     * informações
     */
    public static void mostraInformacoes(Pessoa p) {

        System.out.println("\n\nInformações de:");
        System.out.println(p.getInformacoes());

    }
}

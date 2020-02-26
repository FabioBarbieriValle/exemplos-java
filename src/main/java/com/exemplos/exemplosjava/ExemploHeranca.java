package com.exemplos.exemplosjava;

import com.exemplos.exemplosjava.heranca1.*;
import java.util.Date;

public class ExemploHeranca {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Maria", "Silva", new Date(1993, 9, 12));
        mostraInformacoes(pessoa);

        Professor prof = new Professor("José", "Santos", new Date(2005, 05, 05), "Cálculo", 2500.50f);
        pessoa = prof;
        mostraInformacoes(pessoa);

        Aluno aluno = new Aluno("Carlos", "Nascimento", new Date(1980, 07, 18), 123456, 7.5f);
        mostraInformacoes(aluno);

        Estagiario estagiario = new Estagiario("Carla", "Nascimento", new Date(1980, 07, 18), 123456, 7.5f, "Rappi", "entregador", 1500.49f);
        mostraInformacoes(estagiario);

//        mostraInformacoes("Texto");
//        mostraInformacoes(new String("Texto"));
        /**
         * Mesmo ao dar cast de Professor para Pessoa, quando chamamos a função
         * 'getInformacoes()', será executada a que foi definida em Professor
         */
        Pessoa convertido = prof;
        //mostraInformacoes(convertido);

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
        convertido = estagiario;

        
        /**
         * Agora o inverso não é verdade, de 'Pessoa' para 'Aluno' é preciso dar
         * cast
         */
        estagiario = (Estagiario) convertido;

        System.out.println("\nEstagiário::");
        if ((convertido instanceof Pessoa)) {
            System.out.println("É instância de Pessoa");
        }
        if ((convertido instanceof Estagiario)) {
            System.out.println("É instância de Estagiario");
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

        if (p instanceof Professor) {
            System.out.println("é professor! " + (p instanceof Pessoa ? "mas também é pessoa!" : ""));
        } else if (p instanceof Estagiario) {
            System.out.println("é estagiario!");
        } else if (p instanceof Aluno) {
            System.out.println("é aluno!");
        } else if (p instanceof Pessoa) {
            System.out.println("é pessoa!");
//        } else if (p instanceof String) {
//            System.out.println("é string!");
//        } else if (p instanceof Integer) {
//            System.out.println("é int!");
        } else {
            System.out.println(" é outra coisa");
        }
    }
}

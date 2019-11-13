package aulas.manha;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mockito.Mockito;

public class A6 {

    public static void main(String[] args) throws SQLException, IOException {
        /**
         * ResultSet.
         *
         * Classe que representa o retorno de uma consulta em bando de dados
         * relacional. O ResultSet funciona iterando sobre cada uma das linhas
         * de resultado da consulta.
         *
         * resultSet != null -> A consulta não contém erros sintaticos;
         *
         * Caso a consulta não tenha dado erro, o resultSet começa 1 linha antes
         * dos resultado, ou seja, deve-se usar a funcao resultSet.next() para
         * saber se há ou não a próxima linha. Ao executar essa função, o
         * ponteiro da linha anda.
         *
         * Exemplo abaixo
         *
         */

//        ResultSet resultado = exemploResultado1Linha();
//        ResultSet resultado = exemploResultadoMiltiplasLinhas();
        ResultSet resultado = exemploResultadoVazio();

        if (resultado != null) {
            // Como resultSet.next() já faz mover o ponteiro do resultado, normalmente ele é utilizado em um while.
            while (resultado.next()) {

                //Obtém em String da coluna X da linha atual
                String nome = resultado.getString("nome");
                String profissao = resultado.getString("profissao");
                String nomeConjuge = resultado.getString("nome_conjuge");
                String dataNascimento = resultado.getString("data_nascimento");

                //Obtem em int da coluna X da linha atual
                int idade = resultado.getInt("idade");
                int filhos = resultado.getInt("filhos");

                //Obtem em double da coluna X da linha atual
                double salario = resultado.getDouble("salario");

                System.out.println(
                        String.format("Nome: %s\nIdade: %d\nData Nascimento: %s\nProfissão: %s\nSalário: R$%.2f\nConjuge: %s\nFilhos: %d\n",
                                nome, idade, dataNascimento, profissao, salario, nomeConjuge, filhos)
                );
            }

            System.out.println("Acabou");
        }

    }

    // Função que monta um ResultSet de exemplo
    private static ResultSet exemploResultado1Linha() throws SQLException {
        ResultSet resultSetMock = Mockito.mock(ResultSet.class);
        Mockito.when(resultSetMock.getString("nome")).thenReturn("Carlos");
        Mockito.when(resultSetMock.getInt("idade")).thenReturn(34);
        Mockito.when(resultSetMock.getString("data_nascimento")).thenReturn("03/19/1985");
        Mockito.when(resultSetMock.getString("profissao")).thenReturn("Vendedor");
        Mockito.when(resultSetMock.getDouble("salario")).thenReturn(3500D);
        Mockito.when(resultSetMock.getString("nome_conjuge")).thenReturn("Mariana");
        Mockito.when(resultSetMock.getInt("Filhos")).thenReturn(1);
        Mockito.when(resultSetMock.next()).thenReturn(true, false);
        return resultSetMock;

    }

    // Função que monta um ResultSet de exemplo
    private static ResultSet exemploResultadoMiltiplasLinhas() throws SQLException {
        ResultSet resultSetMock = Mockito.mock(ResultSet.class);
        Mockito.when(resultSetMock.getString("nome")).thenReturn("Carlos", "Mariana");
        Mockito.when(resultSetMock.getInt("idade")).thenReturn(34, 30);
        Mockito.when(resultSetMock.getString("data_nascimento")).thenReturn("03/19/1985", "24/06/1989");
        Mockito.when(resultSetMock.getString("profissao")).thenReturn("Vendedor", "Professora");
        Mockito.when(resultSetMock.getDouble("salario")).thenReturn(3500D, 3700D);
        Mockito.when(resultSetMock.getString("nome_conjuge")).thenReturn("Mariana", "Carlos");
        Mockito.when(resultSetMock.getInt("Filhos")).thenReturn(1, 1);
        Mockito.when(resultSetMock.next()).thenReturn(true, true, false);
        return resultSetMock;

    }

    // Função que monta um ResultSet de exemplo
    private static ResultSet exemploResultadoVazio() throws SQLException {
        ResultSet resultSetMock = Mockito.mock(ResultSet.class);
        Mockito.when(resultSetMock.next()).thenReturn(false);
        return resultSetMock;

    }
}

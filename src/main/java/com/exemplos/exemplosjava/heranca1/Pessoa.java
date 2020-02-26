package com.exemplos.exemplosjava.heranca1;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Ao descomentar 'final', a classe pessoa torna-se constante e portanto nenhuma
 * classe poderá herdar Pessoa
 */
public /*final*/ class Pessoa {

    private String nome;
    private String sobrenome;
    private Date dataNascimento;

    public Pessoa(String nome, String sobrenome, Date dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getInformacoes() {
        /**
         * this.getClass().getSimpleName()
         *
         * 'this' traz o contexto atual, seja Pessoa ou Aluno 'getClass()' traz
         * a classe do objeto 'getSimpleName()' traz o nome da classe
         *
         * Ao final temos como resultado dessa função o texto "Pessoa" ou
         * "Aluno", dependendo de qual objeto chama ela
         */

        return this.getClass().getSimpleName() + ": " + getNomeCompleto() + "\nData: " + dataNascimento;
    }

    public final String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

//    @Override
//    public String toString() {
//        return getInformacoes();
//    }
}

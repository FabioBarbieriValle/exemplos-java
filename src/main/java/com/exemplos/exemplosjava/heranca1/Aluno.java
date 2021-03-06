package com.exemplos.exemplosjava.heranca1;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa {

    private int matricula;
    private float media;

    /**
     * Ao redefinirmos um método de uma classe 'Pai', podemos acessar a
     * definição do metodo na classe pai, pela chamada do 'super'
     *
     * * do mesmo modo que o 'this' se refere ao contexto da classe atual, o
     * 'super' se refere a classe pai (classe que esta está herdando)
     */
    public Aluno(String nome, String sobrenome, Date dataNascimento, int matricula, float media) {
        super(nome, sobrenome, dataNascimento); //Pessoa(nome, sobrenome, dataNascimento)
        this.matricula = matricula;
        this.media = media;

//        getNomeCompleto();
    }

    /**
     * A notação @Override indica quando um método está sendo substituído, porém
     * é opcional
     */
    @Override
    /**
     * A função 'getInformações' foi reescrita em Aluno, utilizando o resultado
     * da função em Pessoa e adicionando informações novas.
     *
     * Lembrando que no caso do override, utilizar super.getInformacoes() é
     * opcional
     *
     */
    public String getInformacoes() {
        return String.format(super.getInformacoes() + "\nMatrícula: %s\nMédia: %.2f", matricula, media);
    }

  

    
}

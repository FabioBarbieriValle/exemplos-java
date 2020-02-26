package com.exemplos.exemplosjava.heranca1;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor extends Pessoa {

    private String disciplina;
    private float salario;

    public Professor(String nome, String sobrenome, Date dataNascimento, String disciplina, float salario) {
        super(nome, sobrenome, dataNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public String getInformacoes() {
        return String.format("Professor: %s\nDisciplina: %s\nSalário: R$ %.2f", getNomeCompleto(), disciplina, salario);
    }

    public boolean isProfessor() {
        return true;
    }

    /**
     * Não é possivel dar Override em um método final.
     *
     * O final torna qualquer coisa imutável, pode ser uma função, uma classe,
     * uma variável, etc
     */
//    public String getNomeCompleto() {
//        return nome + " " sobrenome + " " + disciplina;
//    }
}

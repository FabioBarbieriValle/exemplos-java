package com.exemplos.exemplosjava;

public class Alguem {

    private String nome;
    private String sobrenome;
    private int idade;

    public Alguem(String nome, String sobrenome, int idade) throws Exception {
        setNome(nome);
        this.sobrenome = sobrenome;
        this.idade = idade;

        if (nome == null || sobrenome == null || idade == 0) {
            throw new Exception("TA SEM VALOR ALGUMA COISA!!!");
        }
    }

    public String getInformacoes() {
        return nome + " " + sobrenome + " " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("FULANO ESTÁ SEM NOME");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

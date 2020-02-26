package com.exemplos.exemplosjava.heranca1;

import java.util.Date;

public class Estagiario extends Aluno {

    private String empresa;
    private float salario;
    private String cargo;

    public Estagiario(String nome, String sobrenome, Date dataNascimento, int matricula, float media, String empresa, String cargo, float salario) {
        super(nome, sobrenome, dataNascimento, matricula, media);
        this.empresa = empresa;
        this.cargo = cargo;
        this.salario = salario;
    }

    public boolean isEstagiario() {
        return true;
    }

    public String getInformacoes(String diferente, String teste) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInformacoes(String teste, int teste1) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInformacoes(int teste1, String teste) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInformacoes(String teste) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getInformacoes(Pessoa p) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInformacoes(int teste) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInformacoes(String teste, String teste2, boolean diferente) {
        return super.getInformacoes(); //To change body of generated methods, choose Tools | Templates.
    }

}

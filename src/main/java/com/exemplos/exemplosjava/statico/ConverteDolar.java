package com.exemplos.exemplosjava.statico;

public class ConverteDolar {

    private static double COTACAO = 4.34d;

    public double paraDolar(double real) {
        return real / COTACAO;
    }

    public double paraReal(double dolar) {
        return dolar * COTACAO;
    }

    public void ajustaCotacao(double novaCotacao) {
        COTACAO = novaCotacao;
    }
}

package com.exemplos.exemplosjava.statico;

public class ExemploStatic {

    public static void main(String[] args) {

        ConverteDolar converte = new ConverteDolar();
        ConverteDolar converteReduzido = new ConverteDolar();

        double meuDinheiro = 40d;

        System.out.println("Meu Saldo em reais é: " + meuDinheiro);
        System.out.println("Meu Saldo em dolar é: " + converte.paraDolar(meuDinheiro));

        double dolar = converte.paraDolar(meuDinheiro);
        //ConverteDolar.COTACAO = 4d;
        converte.ajustaCotacao(4d);

        System.out.println("Meu Saldo em reais convertido de dolar é: "
                + converteReduzido.paraReal(dolar));

    }
}

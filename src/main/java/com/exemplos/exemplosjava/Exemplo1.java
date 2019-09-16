package com.exemplos.exemplosjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo1 {

    public static void main(String[] args) throws Exception {

//        Date data = new Date(System.currentTimeMillis());
        Date data = new Date(1993, 8, 4, 10, 40, 35);

        SimpleDateFormat formatador = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss"); // 
        /**
         * 42634176821 426.341.768-21 012.345.678-X
         *
         */

        /**
         * yyyy - 2019 yy - 19
         *
         * MM - 09
         *
         *
         * dd - 08
         *
         */
        mostra(formatador.format(data));
        mostra(data);

        System.out.println(data);

        String formatada = formatador.format(data);
        mostra(formatada);

        Date novaData = formatador.parse(formatada);
        mostra("NovaData: " + novaData);
        mostra("NovaData instanceof date? Resposta: "
                + (novaData instanceof Date ? "é verdade" : "é mentira")
        );

    }

    public static void mostra(Object objeto) {
        System.out.println("Console: " + objeto);
    }
}

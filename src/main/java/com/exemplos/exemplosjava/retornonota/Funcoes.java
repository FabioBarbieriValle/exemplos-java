package com.exemplos.exemplosjava.retornonota;

import java.text.SimpleDateFormat;

public class Funcoes {

    public java.util.Date stringToDateTime(String data, String mascara) {
        try {
            java.util.Date date = new SimpleDateFormat(mascara).parse(data);
            return date;
        } catch (Exception e) {
            return null;
        }
    }

    public int strToInt(Object valor) {
        String strValor = trim(valor);
        int retornoFuncao = 0;
        try {
            retornoFuncao = Integer.parseInt(strValor);
        } catch (Exception e) {
            retornoFuncao = 0;
        }
        return retornoFuncao;
    }

    public String trim(Object texto) {
        if (texto == null) {
            return "";
        } else {
            return String.valueOf(texto).trim();
        }
    }
}

package com.exemplos.exemplosjava.interface1;

public class Exemplo {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        J j = new J();

//        System.out.print(String.format("Objeto: %s | funcao: ", a.getClass().getSimpleName()));
//        a.funcaoA();
//
//        System.out.print(String.format("Objeto: %s | funcao: ", b.getClass().getSimpleName()));
//        b.funcaoA();
//        b.funcao/C();
//
//        System.out.print(String.format("Objeto: %s | funcao: ", j.getClass().getSimpleName()));
//        j.funcaoJ();
////        j.funcaoC();
//        C c = (C) j;
        menu(j);
        menu(b);
//        System.out.print("interface C em J : ");
//        c.funcaoC();

//        c = (C) b;
//        System.out.print("interface C em B : ");
//        c.funcaoC();
    }

    public static void menu(C classeC) {
        System.out.println("Recebi a classe C cuja 'funcaoC' retorna: " + classeC.funcaoRetorno(10));
        classeC.funcaoC();

    }

}

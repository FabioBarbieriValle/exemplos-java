package com.exemplos.exemplosjava.interface1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class A {

    private String nome;
    private int idade;

    public void funcaoA() {
        System.out.println("Classe A");
    }
}

package com.exemplos.exemplosjava.interface1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class J implements C {

    public void funcaoJ() {
        System.out.println("Classe J");
    }

    @Override
    public void funcaoC() {
        funcaoJ();
    }

    @Override
    public String funcaoRetorno(int valor) {
        return "J" + valor;
    }

}

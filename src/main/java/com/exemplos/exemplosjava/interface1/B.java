package com.exemplos.exemplosjava.interface1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class B extends A implements C{

    @Override
    public void funcaoA() {
        System.out.println("Classe B");
    }

    @Override
    public void funcaoC() {
        funcaoA();
    }

    @Override
    public String funcaoRetorno(int valor2) {
        return "";
    }

}

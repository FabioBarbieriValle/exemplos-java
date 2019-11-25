/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.manha.wildcards;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ClasseA< T extends Function, U> {

    private T valor;
    private U chave;

 
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public U getChave() {
        return chave;
    }

    public void setChave(U chave) {
        this.chave = chave;
    }

}

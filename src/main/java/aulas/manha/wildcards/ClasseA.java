package aulas.manha.wildcards;

import java.util.function.Function;

public class ClasseA<T extends Function, U> {

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

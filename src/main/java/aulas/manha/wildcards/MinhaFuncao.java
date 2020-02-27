package aulas.manha.wildcards;

import java.util.function.Function;

public class MinhaFuncao implements Function<String, Integer> {

    @Override
    public Integer apply(String numero) {
        return Integer.valueOf(numero);
    }

}

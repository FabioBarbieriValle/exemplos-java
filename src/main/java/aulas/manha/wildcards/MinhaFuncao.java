/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.manha.wildcards;

import java.util.function.Function;

/**
 *
 * @author Fabio
 */
public class MinhaFuncao implements Function<String, Integer> {

    @Override
    public Integer apply(String t) {
        return Integer.valueOf(t);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.manha;

import aulas.manha.wildcards.ClasseA;
import aulas.manha.wildcards.MinhaFuncao;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Fabio
 */
public class A8 {

    public static void main(String[] args) {
        ClasseA<MinhaFuncao, String> classeA = new ClasseA<>();

        classeA.setValor(new MinhaFuncao());

        int x = classeA.getValor().apply("0");

    }

}

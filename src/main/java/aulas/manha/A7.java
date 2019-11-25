/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.manha;

import java.util.Stack;
import java.util.stream.Collectors;

public class A7 {

    public static void main(String[] args) {

        Stack<Integer> pilha1 = new Stack();
        Stack<Integer> pilha2 = new Stack();
        Stack<Integer> pilha3 = new Stack();

        pilha1.push(1);
        pilha1.push(2);
        pilha1.push(3);

        System.out.println("Pilha 1: " + pilha1.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        int a = pilha1.pop();

        System.out.println("\nRetirei do topo: " + a);
        System.out.println("Pilha 1: " + pilha1.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        a = pilha1.peek();

        System.out.println("\nBisbilhotei o topo: " + a);
        System.out.println("Pilha 1: " + pilha1.stream().map(String::valueOf).collect(Collectors.joining(", ")));

    }
}

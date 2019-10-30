package aulas.manha;

import java.util.Comparator;
import java.util.function.Consumer;

public class Professor implements Comparable<Professor> {

    public final String nome;
    public final int idade;
    public final float salario;

    private final Consumer<String> seiLaProfessor;
    private final Comparator<String> comparator;

    public Professor(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        seiLaProfessor = x -> System.out.println("Professor: " + x + nome);

        comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {          //  0 <= X < 1
                int i = o1.substring(0, 1).compareToIgnoreCase(o2.substring(0, 1));
                return i == 0 ? Integer.compare(o1.length(), o2.length()) : i;
            }
        };
    }

    public Consumer<String> getSeiLaProfessor() {
        return seiLaProfessor;
    }

    @Override
    public int compareTo(Professor o) {
        return getComparator().compare(nome, o.nome);
    }

    public Comparator<String> getComparator() {
        return comparator;
    }

    public boolean existe() {
        return true;
    }

}

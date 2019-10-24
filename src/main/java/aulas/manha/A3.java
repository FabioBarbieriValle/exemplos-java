package aulas.manha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class A3 {

    public static void main(String[] args) {

        //String format
//        Professor carlos = new Professor("Carlos", 35, 1500.123456789F);
//        String texto = "- Nome: %s\n- Idade: %d ano(s)\n- Salário: R$%.2f";
//
//        System.out.println("Professor:");
//        System.out.println(String.format(texto, carlos.nome, carlos.idade, carlos.salario));
//        System.out.println("Salário: " + carlos.salario);
        System.out.println("");

        List<String> nomes = new ArrayList<>(Arrays.asList("Joel", "Gimenes", "Kaique", "Felipe", "Murilo", "Fernanda", "Alessandra"));
        Collections.sort(nomes);
        System.out.println("Nomes: " + nomes.stream().collect(Collectors.joining(",")));

        /*
        nomes.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 
            }
        });
         */
        Ordenar A = new Ordenar("Carlos");
        Ordenar B = new Ordenar("José");
        System.out.println("A: " + A.getNome() + " | " + A.getMillis());
        System.out.println("B: " + B.getNome() + " | " + B.getMillis());

        System.out.println("Equals: " + A.equals(B));
        System.out.println("Contém (Joel): " + nomes.contains("Joel"));
        System.out.println("Contém (JOEL): " + nomes.contains("JOEL"));
        System.out.println("");

        boolean removeu = nomes.remove("Joel");
        System.out.println("removido joel");
        System.out.println("Nomes: " + nomes.stream().collect(Collectors.joining(",")));

        System.out.println("removido index 1");
        String removido = nomes.remove(1);
        System.out.println("Nomes: " + nomes.stream().collect(Collectors.joining(",")));

        System.out.println("Adiciondo 3 'fernanda'");
        nomes.add("Fernanda");
        nomes.add("Fernanda");
        nomes.add("fernanda");
        Collections.sort(nomes);

        //troca todos os "fernanda" por "removido"
        nomes.replaceAll((t) -> t.equals("Fernanda") ? "REMOVIDO" : t);

        System.out.println("Replace todos 'fernanda'");
        System.out.println("Nomes: " + nomes.stream().collect(Collectors.joining(",")));

        nomes.forEach(nome -> {
            String aux = nome.trim().toLowerCase();
            System.out.println("nome: " + aux);
        });

    }

}

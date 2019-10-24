package aulas.manha;

public class InverterString {

    public static void main(String[] args) {

        String entrada = "oditrevni iof gnirts etsE";

        System.out.println("Inversão 1: " + inversao1(entrada));
        System.out.println("Inversão 2: " + inversao2(entrada));
        System.out.println("Inversão 3: " + inversao2(entrada));

        System.out.println("Inversão Classe: " + new VStringBuilder(entrada).inversao().toString());

    }

    public static String inversao1(String entrada) {
        return new StringBuilder(entrada).reverse().toString();
    }

    public static void inversao4(StringBuilder builder) {
        builder.reverse();
    }

    public static String inversao2(String entrada) {
        String saida = "";
        for (char letra : entrada.toCharArray()) {
            saida = letra + saida;
        }

        return saida;
    }

    public static String inversao3(String entrada) {
        String saida = "";
        for (int i = entrada.length() - 1; i >= 0; i--) {
            saida += entrada.charAt(i);
        }
        return saida;
    }
}

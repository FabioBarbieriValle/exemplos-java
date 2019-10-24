package aulas.manha;

import java.util.Arrays;

public class A1 {

    public static void main(String[] args) {

        String linha = "";
        String saida = new String();
        String[] arrayString = linha.split(" ");
        char[] arrayChar = linha.toCharArray();

        linha.charAt(3); // retorna o char na posicao '3'
        linha.concat(" texto final"); // retorna 'Fabio texto final'
        // item1 + item2 == item1.concat(item2)
        linha.endsWith("termina com isto");
        
        linha.startsWith("comeca com isto");
        linha.equalsIgnoreCase("iGuAL");
        linha.equals("igual");
        linha.toCharArray(); // retorna um char[]
        linha.indexOf("F"); // retorna a primeira posicao em que existe 'F'
        linha.indexOf("F", 2); // retorna a primeira posicao em que existe 'F',
        // começando no index 2
        linha.split(""); // quebra o string em um String[], dado um 'separador'
        linha.toLowerCase(); // retorna o string todo minusculo
        linha.toUpperCase(); // retorna o string todo em maiusculo
        linha.isEmpty(); // retorna se o string contem algum caractere (espaço conta)
        linha.trim(); // remove espaços finais e iniciais
        linha.lastIndexOf("F"); // retorna o ultimo index em que existe 'F'
        
        for (String item : arrayString) {
            System.out.println("Item do String[]: " + item);
        }
        for (char item2 : arrayChar) {
            System.out.println("Item do char[]: " + item2);
        }

        System.out.println("oibaF");

//        System.out.println("char na posicao 4: " + linha.charAt(linha.length() - 1));
//        char[] charArray = linha.toCharArray();
//        System.out.println("array[4]: " + charArray[4]);
//        System.out.println("tamanho do vetor: " + charArray.length);
//        System.out.println("tamanho do string: " + linha.length());
//
//        linha += "J";
//        charArray[2] = '\0';
//
//        System.out.println("tamanho do vetor: " + charArray.length);
//        System.out.println("tamanho do string: " + linha.length());
//
//        System.out.println("string: " + linha);
//        System.out.println("array: " + new String(charArray));
//
//        System.out.println("posicao 2 do array: '" + (int) charArray[2] + "'");
//        System.out.println("posicao 0 do array: '" + (int) charArray[0] + "'");
//
//        System.out.println("70 em char: " + (char) 70);
//
//        charArray[0] = 'f';
//
//        if (charArray[0] >= 'A' && charArray[0] <= 'Z') {
//            System.out.println("Sim");
//        } else {
//            System.out.println("não");
//        }
//        System.out.println("termina com 'IO'? " + linha.endsWith("IO"));
//        System.out.println("termina com 'io'? " + linha.endsWith("io"));
//        System.out.println("comeca com 'Fa'? " + linha.startsWith("Fa"));
//        System.out.println("comeca com 'fa'? " + linha.startsWith("fa"));
//        System.out.println(" contem 'io' " + linha.contains("io"));
//        System.out.println(" contem 'Fa'  " + linha.contains("Fa"));
//        System.out.println(" contem 'FAB' " + linha.contains("FAB"));
    }
}

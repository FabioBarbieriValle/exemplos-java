package aulas.manha;

import java.util.Date;

public class A7_1 {

    public static void main(String[] args) {
        int base = 2;
        int expoente = 10;
        int resultado;

        resultado = potenciaI(base, expoente);
        System.out.println("Iterativo: " + resultado);

        resultado = potenciaR(base, expoente);
        System.out.println("Recursivo: " + resultado);

        Date data1 = new Date(100, 10, 20);
        System.err.println("data1: " + data1);
        Date data2 = new Date(100, 10, 19);
        System.err.println("data2: " + data2);

        System.out.println("data1 compare data2 " + (data1.compareTo(data2)));
        System.out.println("data2 compare data1 " + (data2.compareTo(data1)));
        
        System.out.println(data1.getTime());
        System.out.println(data2.getTime());
        System.out.println(Long.compare(data2.getTime(), data1.getTime()));
        
    }

    public static int potenciaI(int base, int expoente) {
        int x = base;
        for (int i = 1; i < expoente; i++) {
            x *= base;
        }
        return x;
    }

    public static int potenciaR(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        if (expoente == 1) {
            return base;
        }

        return potenciaR(base, expoente - 1) * base;
    }
}

package aulas.manha;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A9 {

    public static void main(String[] args) {

        float valor = 10.95786445645645f;
        DecimalFormat conversorNumerico = new DecimalFormat("#,##0.00");
        System.out.println("Mascara: #,##0.00");
        System.out.println(conversorNumerico.format(valor));

        conversorNumerico = new DecimalFormat("0,000.00");
        System.out.println("Mascara: 0,000.00");
        System.out.println(conversorNumerico.format(valor));

        conversorNumerico = new DecimalFormat("0,000.##");
        System.out.println("Mascara: 0,000.##");
        System.out.println(conversorNumerico.format(valor));

        conversorNumerico = new DecimalFormat("0,000.##");
        System.out.println("Mascara: 0,000.##");
        System.out.println(conversorNumerico.format(10f));

        conversorNumerico = new DecimalFormat("#,###.##");
        System.out.println("Mascara: 0,000.##");
        System.out.println(conversorNumerico.format(10f));

        conversorNumerico = new DecimalFormat("#,##0.00");
        System.out.println("Mascara: #,##0.00");
        System.out.println(conversorNumerico.format(10000000f));

        System.out.println("\n\nSem nada: " + new Date(120, 2, 9, 9, 15, 23));

        SimpleDateFormat conversorData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mascara: dd/MM/yyyy");
        System.out.println(conversorData.format(new Date(120, 2, 9, 9, 15, 36)));

        conversorData = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Mascara: dd/MM/yy");
        System.out.println(conversorData.format(new Date(119, 2, 9, 9, 15, 52)));

        conversorData = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Mascara: HH:mm:ss");
        System.out.println(conversorData.format(new Date(119, 2, 9, 9, 15, 52)));

        conversorData = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");
        System.out.println("Mascara: HH:mm:ss");
        System.out.println(conversorData.format(new Date(System.currentTimeMillis())));

        conversorData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Mascara: HH:mm:ss");
        System.out.println(conversorData.format(new Date(System.currentTimeMillis())));

    }
}

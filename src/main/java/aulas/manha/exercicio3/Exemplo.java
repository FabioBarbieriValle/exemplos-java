package aulas.manha.exercicio3;

import java.util.Date;

public class Exemplo {

    public static void main(String[] args) {

        Professor prof = new Professor("Carlos", "Alberto", new Date(89, 11, 20), "Matematica", 1200);

        System.out.println(prof.getLinha());
        
        prof.setSobrenome("Alberto de Nóbrega");
        
        System.out.println(prof.getLinha());
        
        System.out.println("O salário de Carlos é: " + prof.getSalario());
        
        /*
        String variavelNula = null;
        System.out.println("".isEmpty());
        System.out.println(variavelNula.isEmpty());
        */
  
        
    }
}

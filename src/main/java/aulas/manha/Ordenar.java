package aulas.manha;

import java.util.Objects;

public class Ordenar implements Comparable<Ordenar> {

    private String nome;
    private long millis = System.currentTimeMillis();

    public Ordenar(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + "(" + getMillis() + ")";
    }

    @Override
    public int compareTo(Ordenar o) {
        return nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Ordenar)) {
            return (((Ordenar) obj).nome == null ? (nome) == null : ((Ordenar) obj).nome.equals(nome));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

}

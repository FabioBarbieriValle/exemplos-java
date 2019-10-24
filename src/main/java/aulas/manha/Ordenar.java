package aulas.manha;

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
            return ((Ordenar) obj).nome == (nome);
        }
        return false;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

}

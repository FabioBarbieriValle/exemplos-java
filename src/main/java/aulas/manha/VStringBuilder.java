package aulas.manha;

public class VStringBuilder {

    private String texto;

    public VStringBuilder(String texto) {
        this.texto = texto;
    }

    public VStringBuilder inversao() {
        String saida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            saida += texto.charAt(i);
        }
        texto = saida;
        return this;
    }

    @Override
    public String toString() {
        return texto;
    }

}

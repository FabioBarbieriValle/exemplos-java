package aulas.manha.exercicio3;

import com.exemplos.exemplosjava.statico.ConverteDolar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor {

    private static final SimpleDateFormat FORMATA_DATA = new SimpleDateFormat("dd/MM/yyyy");

    private final String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String disciplina;
    private float salario;

    public Professor(String nome, String sobrenome, Date dataNascimento, String disciplina, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getLinha() {
        return String.format("Nome: %s %s\nData Nascimento: %s\nDisciplina: %s\nSalário: R$%.2f", nome, sobrenome, FORMATA_DATA.format(dataNascimento), disciplina, salario);
    }

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}

package nivelamento.pessoas;

import java.util.Objects;

public class Pessoa {
    // Atributos
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    // Métodos Especiais

    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }

    public String getNomeCompletro(){
        return this.nome + " " + this.sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome completo='" + this.getNomeCompletro()+ '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return pessoa.CPF.equals(CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }
}

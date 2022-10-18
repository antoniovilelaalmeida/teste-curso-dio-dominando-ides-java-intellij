package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String Gato;
    private String nome;
    private Integer idade;

    public Gato() {}

    public Gato(String gato, String nome, Integer idade) {
        Gato = gato;
        this.nome = nome;
        this.idade = idade;
    }

    public String getGato() {
        return Gato;
    }

    public void setGato(String gato) {
        Gato = gato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(Gato, gato.Gato) && Objects.equals(nome, gato.nome) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Gato, nome, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Gato='" + Gato + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

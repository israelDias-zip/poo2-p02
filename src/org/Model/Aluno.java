package org.Model;

public class Aluno {
    protected String nome;
    private int idade;
    public String matricula;
    String curso;

    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}

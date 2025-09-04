package org.Model;

public class Cliente {
    protected String nome;
    String cpf;

    public Cliente() {
        this.nome = "";
        this.cpf = "";
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDadosCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}

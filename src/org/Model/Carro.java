package org.Model;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private double preco;

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.preco = 0;
    }

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.preco);
    }

}


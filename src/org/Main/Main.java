package org.Main;

import org.Model.*;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("volkswagem", "Nivus", 2021, 145567.00);
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        Livro livro1 = new Livro("Crônicas de Nárnia", "C.S. Lewis", 200.00, 180);
        livro1.detalhesDoLivro();

        Aluno aluno1 = new Aluno("Marcio", 19, "898790","Engrenharia");
        aluno1.exibirInformacoes();

        ContaBancaria conta1 = new ContaBancaria("1257", 1298.0);
        conta1.exibirSaldo();

        Cliente cliente1 = new Cliente("Marcio",  "898790256867");
        cliente1.exibirDadosCliente();
    }
}
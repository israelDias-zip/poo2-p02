package org.Main;

import org.Model.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("volkswagem", "Nivus", 2021, 145567.00);
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
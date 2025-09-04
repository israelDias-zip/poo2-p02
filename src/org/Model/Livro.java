package org.Model;

public class Livro {
    public String titulo;
    private String autor;
    protected double preco;
    int paginas;

    public Livro(String titulo, String autor, double preco, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
    }

    public void detalhesDoLivro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Paginas: " + this.paginas);
    }
}

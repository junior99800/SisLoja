package LoVi;

public class Produto {
    private String nome;
    private double preco;
    private int quantEstoque;

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco + ", Estoque: " + quantEstoque;
    }
}

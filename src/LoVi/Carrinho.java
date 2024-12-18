package LoVi;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    private ArrayList<Produto> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<>();
    }

    public void addproduto(Scanner scanner) {
        System.out.println("Digite a quantidade de produtos que deseja adicionar: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            scanner.nextLine();
            System.out.println("digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println("digite o preço do produto: ");
            Double preco = scanner.nextDouble();
            System.out.println("digite a quantidade em estoque: ");
            int quantEstoque = scanner.nextInt();
            scanner.nextLine();
            Produto produto = new Produto(nome, preco, quantEstoque);
            listaProdutos.add(produto);
            System.out.println("Produto \"" + nome + "\" adicionado ao carrinho.\n");
        }
    }

    public void infoProt() {
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }

    public void renovProduto(Scanner scanner) {

        System.out.println("digite o nome do produto que voce que remover");
        String elemento = scanner.nextLine();
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getNome().equalsIgnoreCase(elemento)) {
                listaProdutos.remove(i);
                System.out.println("Elemento \"" + elemento + "\" removido.");
            } else {
                System.out.println("Elemento \"" + elemento + "\" não encontrado.");
            }
        }
    }

    public void valorTotal() {

    }
}

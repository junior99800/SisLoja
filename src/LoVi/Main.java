package LoVi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carrinho protudo1 = new Carrinho();
        protudo1.addproduto(scanner);

        protudo1.infoProt();

        protudo1.renovProduto(scanner);

        protudo1.infoProt();
    }
}

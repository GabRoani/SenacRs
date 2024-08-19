package org.example;

import org.example.service.Carrinho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Criar Pedido");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Listar Pedidos");
            System.out.println("5. Total carrinho");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    carrinho.adicionarProduto();
                    break;
                case 2:
                    carrinho.fazerPedido();
                    break;
                case 3:
                    carrinho.listarProdutos();
                    break;
                case 4:
                    carrinho.listarPedidos();
                    break;
                case 5:
                    carrinho.totalCarrinho();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

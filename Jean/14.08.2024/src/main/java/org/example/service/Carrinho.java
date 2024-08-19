package org.example.service;

import org.example.model.Pedido;
import org.example.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {

    public static List<Produto> produtos = new ArrayList<>();
    public static List<Pedido> pedidos = new ArrayList<>();
    private static int idProdutoCounter = 1;
    private static int idPedidoContador = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.next();
        System.out.println("Digite o preco do produto:");
        double precoProduto = scanner.nextDouble();

        Produto produto = new Produto(idProdutoCounter++, nomeProduto, precoProduto);
        produtos.add(produto);
    }

    public static void fazerPedido() {
        System.out.println("Digite o nome do produto para realizar o pedido:");
        String nomeProduto = scanner.next();

        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            Pedido pedido = new Pedido(produtoEncontrado, idPedidoContador);
            pedidos.add(pedido);
            idPedidoContador++;
            System.out.println("Pedido realizado com sucesso!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public static void listarProdutos() {
        System.out.println("Produtos disponiveis:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void listarPedidos() {
        System.out.println("Pedidos realizados:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
    public static double totalCarrinho() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.getProduto().getPrecoProduto();
        }
        return total;
    }

}

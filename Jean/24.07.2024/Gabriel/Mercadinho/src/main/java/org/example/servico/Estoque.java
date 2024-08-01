package org.example.servico;

import org.example.modelo.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

    public static List<Produto> produtos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adicionarProduto() {
        System.out.println("Nome do produto");
        String nomeProduto = scanner.next();

        System.out.println("Preço do produto");
        Double precoProduto = scanner.nextDouble();

        System.out.println("Quantidade do produto");
        int quantidadeProduto = scanner.nextInt();

        Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
        produtos.add(produto);
    }

    public void removerProduto() {
        System.out.println("Diga o nome do produto para realizar a operação.");
        String nomeProduto = scanner.next();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)){
                produto.setQuantidade(0);
            }
        }


    }
    public void quantidadeProduto() {
        System.out.println("Diga o nome do produto para realizar a operação.");
        String nomeProduto = scanner.next();

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)){
                System.out.println("Diga a nova quantidade de produto.");
                int quantidadeProduto = scanner.nextInt();
                produto.setQuantidade(quantidadeProduto);
            }
        }

    }

    public void listarProduto() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de usuários:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }


        }
    }
}






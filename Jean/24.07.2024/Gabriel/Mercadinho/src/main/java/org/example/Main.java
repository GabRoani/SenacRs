package org.example;

import org.example.modelo.Produto;
import org.example.servico.Estoque;

import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("Escolha uma das opções a seguir: ");
            System.out.println("1. Adcionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                estoque.adicionarProduto();
            } else if (escolha == 2) {
                estoque.removerProduto();
            } else if (escolha == 3) {
                estoque.quantidadeProduto();
            } else if (escolha == 4) {
                estoque.listarProduto();
            } else if (escolha == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}




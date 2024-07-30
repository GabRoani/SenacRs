package org.example.servico;

import org.example.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    List<Produto> produtos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void  adicionarproduto(){
        System.out.println("Adione o nome do produto.\n");
        String nome = sc.next();

        System.out.println("Digite a quantidade do produto.\n");
        Integer quantidade = sc.nextInt();

        System.out.println("Digite o preço do produto\n");
        Double preco = sc.nextDouble();

        produtos.add(new Produto(nome, quantidade, preco));
    }

    public void removerproduto(){
        System.out.println("Digite o nome do produto que deseja remover\n");
        String remover = sc.next();

        produtos.remove(remover);



    }


}

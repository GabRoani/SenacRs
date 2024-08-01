package org.example;


import java.util.Scanner;
import org.example.service.Cadastro;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        while (true) {
            System.out.println("Escolha uma das opções a seguir: ");
            System.out.println("1. Adicionar nova conta");
            System.out.println("2. Listar contas");
            System.out.println("3. Realizar deposito");
            System.out.println("4. Realizar saque");
            System.out.println("5. ver extrato de uma conta");
            System.out.println("6. Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                cadastro.adicionarConta();
                break;

                case 2:
                cadastro.listarContas();
                break;

                case 3:
                cadastro.depositarValor();
                break;

                case 4:
                cadastro.sacarValor();
                break;

                case 5:
                cadastro.mostrarExtrato();
                break;

                case 6:
                    System.out.println("Saindo do programa!");
                    System.exit(0);

                default:
                System.out.println("Opção invalida!");
            }
        }

    }
}
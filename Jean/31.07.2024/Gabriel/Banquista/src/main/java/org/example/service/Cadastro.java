package org.example.service;

import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    public static List<Usuario> usuarios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adicionarConta() {

        double valorUsuario;
        valorUsuario = 0;

        System.out.println("Escolha o tipo da conta");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");

        int escolhaConta = scanner.nextInt();
        String tipoUsuario;

        if (escolhaConta == 1) {
            tipoUsuario = "Conta Corrente";
        }
        else {
            tipoUsuario = "Conta Poupança";
        }



        System.out.println("Diga o numero da conta");
        String numeroUsuario = scanner.next();

        System.out.println("Diga o valor inicial da conta");
        Double quantidadeUsuario = scanner.nextDouble();

        Usuario usuario = new Usuario(tipoUsuario, numeroUsuario, quantidadeUsuario);
        usuarios.add(usuario);
    }

    public void listarContas() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de usuários:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    public void depositarValor() {
        System.out.println("Diga o número de conta para realizar a operação");
        String contaSacar = scanner.next();

        System.out.println("Diga o valor para realizar a operação.");
        Double valorDepositar = scanner.nextDouble();

        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroConta().equalsIgnoreCase(contaSacar)){

                Double novoValor = usuario.getSaldoConta() + valorDepositar;
                usuario.setSaldoConta(novoValor);
            }
        }


    }

    public void sacarValor() {
        System.out.println("Diga o número de conta para realizar a operação");
        String contaSacar = scanner.next();

        System.out.println("Diga o valor para realizar a operação.");
        Double valorSacar = scanner.nextDouble();

        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroConta().equalsIgnoreCase(contaSacar)){

               Double novoValor = usuario.getSaldoConta() - valorSacar;
                usuario.setSaldoConta(novoValor);
                usuario.setExtratoConta("Debitado o valor de:" + novoValor);
            }
        }
    }

    public void mostrarExtrato() {
        System.out.println("Escolha o numero da conta");
        String numeroConta = scanner.next();

        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroConta().equalsIgnoreCase(numeroConta)){
             System.out.println(mostrarExtrato(usuario.getExtratoConta()));

            }
        }
    }
    public String mostrarExtrato(String extratoConta) {
        return "Extrato{" +
                "extratoConta='" + extratoConta + '\'' +
                '}';
    }
}
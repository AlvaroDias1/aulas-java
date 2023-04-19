package com.mycompany.javateste1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Javateste1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        while (!validarNome(nome)) {
            System.out.print("Nome inválido. Digite novamente: ");
            nome = scanner.nextLine();
        }

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        while (!validarCPF(cpf)) {
            System.out.print("CPF inválido. Digite novamente: ");
            cpf = scanner.nextLine();
        }

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        while (!validarTelefone(telefone)) {
            System.out.print("Telefone inválido. Digite novamente: ");
            telefone = scanner.nextLine();
        }

        System.out.print("Saldo do Banco: ");
        double saldo = scanner.nextDouble();

        while (saldo < 0) {
            System.out.print("Saldo inválido. Digite novamente: ");
            saldo = scanner.nextDouble();
        }

        
        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }

    private static boolean validarNome(String nome) {
        
        return nome.matches("[a-zA-Z ]+");
    }

    private static boolean validarCPF(String cpf) {
        
        return cpf.matches("\\d{11}");
    }

    private static boolean validarTelefone(String telefone) {
        
        return telefone.matches("\\d{10,11}");
    }
   
}

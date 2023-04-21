/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projetobanco;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projetobanco {

     public static void main(String[] args) {
    
    Scanner t = new Scanner(System.in);
    Scanner t2 = new Scanner(System.in);
     
     
    public static Usuario cad(Usuario[] usuario) {
        int i = 0;

        System.out.print("Informe o Nome do usuário: ");
        String nome = t2.nextLine();

        System.out.print("Informe o CPF do usuário: ");
        String cpf = t.nextLine();

        if (!cpf.matches("\\d{11}") || !cpf.matches("[0-9]*")) {

            System.out.println("CPF inválido. Digite um CPF válido!");
            return null;
        }

        System.out.println("Informe o Telefone do usuário: ");
        String telefone = t2.nextLine();

        System.out.println("Informe o Saldo da conta");
        Double saldo = t.nextLine();

        usuario[i] = new Usuario(nome, cpf, telefone, saldo);

        System.out.println("O usuario foi cadastrado!");
        System.out.println(usuario[i].getNome() + "\n CPF: " + usuario[i].getCpf() + "\n Celular: " + usuario[i].getCelular() + "\n Saldo: R$" + usuario[i].getSaldo());
        i++;
        return null;
    }
        public static Usuario credito(Usuario[] usuario) {
            String consultacpf;
            Double adcsaldo = 0;
            int i = 0;
            System.out.println("Qual o seu cpf de acesso? ");
            consultacpf = t2.nextLine();
            for (i = 0; i < usuario.lenght; i++ ){
                if
            }
        }
}

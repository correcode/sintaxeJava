package testes;

import java.util.Locale;
import java.util.Scanner;

    public class ClienteContaVerification {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            String agencia = "0001";
            int conta = 246810;
            double saldo = 2437.34;
            String dadosCliente = "Alisson Alves";
            int senha = 5002;

            System.out.println("Seja bem vindo ao Codex Bank!\n");
            System.out.println("\nInforme sua conta: ");
            int contaEntrada = scanner.nextInt();
            System.out.println("\nInforme sua senha: ");
            int senhaEntrada = scanner.nextInt();
            
            if(conta == contaEntrada && senha == senhaEntrada) {
                System.out.println("\nLogin efetuado com sucesso!");
                System.out.println("Seu saldo atual: R$" + saldo);

                System.out.println("Deseja realizar um saque ? ");
                System.out.println("ola de novo");
                System.out.println("Qual valor ? ");
                int saque = scanner.nextInt();

                saldo = saldo - saque;

                System.out.println("Saldo atual: " + saldo);
            } else {
                System.out.println("Login ou senha incorretos!");
            }
        }
    }
package testes;

import java.util.Locale;
import java.util.Scanner;
public class DesafioSaldo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Entrada do saldo inicial
            System.out.println("Qual saldo inicial: ");
            double saldoInicial = scanner.nextDouble();

            // TODO: Na linha abaixo, implemente a entrada das três transações:
            System.out.println("Primeira transaction: ");
            double oneTransaction = scanner.nextDouble();

            System.out.println("Segunda transaction: ");
            double twoTransaction = scanner.nextDouble();

            System.out.println("Terceira transaction: ");
            double threeTransaction = scanner.nextDouble();

            // TODO: Na linha abaixo, realize o cálculo do saldo final:
            double transaction = oneTransaction + twoTransaction + threeTransaction;

            double saldoFinal = saldoInicial - transaction;
            // Saldo final
            System.out.printf("%.2f\n", saldoFinal);

            scanner.close();
        }
    }


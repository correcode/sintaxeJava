package testes;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primerio numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numeroDois = scanner.nextInt();

        int resultado = numeroUm + numeroDois;

        System.out.println("\nO resultado e : " + resultado);
    }
}

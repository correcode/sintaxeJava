import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite qual será seu primeiro depósito: ");
        Double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + 
            ", conta " + numeroConta + 
            " e seu saldo de R$" + saldo + 
            " já está disponível para saque.");
    }
}

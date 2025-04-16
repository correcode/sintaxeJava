import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        int password = 1234;
        double saldo = 255.19;

        System.out.println("\nDigite sua senha");
        int userPassword = scanner.nextInt();

        if(password == userPassword) {
            System.out.println("\nVoce esta logado, seu saldo e de: " + saldo + "$ Dolares");

            System.out.println("\nQual valor deseja sacar : ");
            double saque = scanner.nextDouble();

            saldo = saldo - saque;

            System.out.println("Saque efetuado com sucesso!, seu saldo atual e de : " + saldo);

        } else {
            System.out.println("\nSenha incorreta!");
        }
    }
}

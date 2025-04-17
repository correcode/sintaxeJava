import java.util.Locale;
import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("\nQual sua nota? ");
        Double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("\nVoce foi aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("\nVoce esta de recuperacao!");
        } else {
            System.out.println("\nVoce foi reprovado!");
        }



    }
}

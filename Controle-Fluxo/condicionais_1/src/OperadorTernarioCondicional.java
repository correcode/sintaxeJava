import java.util.Locale;
import java.util.Scanner;

public class OperadorTernarioCondicional {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("\nQual sua nota ? ");
        Double nota = scanner.nextDouble();

        String resultado = nota >= 7 ? "\nAprovado" : nota >= 5 && nota <= 7 ? "Recuperacao" : "\nReprovado";

        System.out.println(resultado);
    }
}

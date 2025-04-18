import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


    public class TratandoExecoes {
        public static void main(String[] args) {
            try{
                //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("\nDigite seu nome: ");
            String nome = scanner.next();

            System.out.println("\nDigite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("\nDigite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("\nDigite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario

            System.out.println("Ola me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
            System.out.println("Tenho " + idade + " ano de idade");
            System.out.println("Minha altura e " + altura + " cm");
            scanner.close();
            } 
            catch (InputMismatchException e) {
                System.out.println("\nOs campos idade e altura precisam ser numericos");
            }
        }
    }
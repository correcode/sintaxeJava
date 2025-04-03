package tiposVariaveis;

public class Tipos {
    public static void main(String[] args) {
        int idade = 27;
        int anoAtual = 2025;
        double altura = 1.84;

        // Corrigindo a chamada do método e imprimindo o resultado
        String resultado = dadosCompletos(idade, anoAtual, altura);
        System.out.println(resultado);
    }

    // Método movido para fora do main e corrigidos os parâmetros
    public static String dadosCompletos(int idade, int anoAtual, double altura) {
        return "Idade: " + idade + ", Ano Atual: " + anoAtual + ", Altura: " + altura;
    }
}

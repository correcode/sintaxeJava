package tiposVariaveis;

public class Tipos {
    public static void main(String[] args) {
        int idade = 27;
        int anoAtual = 2025;
        double altura = 1.84;

      
        String resultado = dadosCompletos(idade, anoAtual, altura);
        System.out.println(resultado);
    }

  
    public static String dadosCompletos(int idade, int anoAtual, double altura) {
        return "Idade: " + idade + ", Ano Atual: " + anoAtual + ", Altura: " + altura;
    }
}

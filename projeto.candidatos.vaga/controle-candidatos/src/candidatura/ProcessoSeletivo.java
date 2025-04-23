package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Juliana", "Paulo", "Agusto"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        } else {
            System.out.println("Nao conseguimos contato com o candidato " + candidato + " , numero maximo de tentativas : " + tentativasRealizadas + " realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Juliana", "Paulo", "Agusto"};

        //elemnto para mostrar o indice de cadas item do array
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O cadidato de n : " + (indice+1) + " e " + candidatos[indice]);

        //elemento para mostrar apenas o dado do array
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi : " + candidato);
        }
        }
    }

    static void selecaoCadidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Juliana", "Paulo", "Agusto", "Pedro", "Caio", "Teo", "Vitoria", "Joao"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("\nO cadidato " + candidato + "selecionou este valor de salario " + salarioPretendido + " $");
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2220);
    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("\nLiga para o cadidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("\nLigar para o candidato com contra proposta");
        } else {
            System.out.println("\nAguadar resultado dos demais candidatos");
        }
    }

}

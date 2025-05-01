
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()) {
            for(Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista de tarefas esta vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista de tarefas esta vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 2");
        lista.adicionarTarefa("tarefa 3");

        System.out.println("Voce tem " + lista.obterNumeroTotalTarefas() + " tarefas na lista");

        lista.obterDescricaoTarefas();

        lista.removerTarefa("tarefa 1");

        System.out.println("Voce tem " + lista.obterNumeroTotalTarefas() + " tarefas na lista");

        lista.obterDescricaoTarefas();

    }
}

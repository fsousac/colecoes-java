package java.exercises.lists.operations;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList = new ArrayList<>();

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> remList = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                remList.add(t);
            }
        }
        tarefaList.removeAll(remList);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> tasksDescricoes = new ArrayList<>();
        for (Tarefa t : tarefaList){
            tasksDescricoes.add(t.getDescricao());
        }
        return tasksDescricoes;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        System.out.println(listaTarefa.obterDescricoesTarefas().toString());

    }
}

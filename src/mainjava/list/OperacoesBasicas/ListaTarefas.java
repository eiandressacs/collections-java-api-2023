package mainjava.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // aributo
    private List<Tarefa> tarefaList;

    // Criando o constructor
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //Metodo de add tarefa na minha lista
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //Removendo a tarefa com essa descrição, se é uma ou varias com o mesmo nome
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList ) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        // Remover tudo que ta dentro da TarefaParaRemover, o laço é para identifica os elementos para remover
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Obtendo o numero da ListTarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Imprimindo a ListTarefas
    public void obterDescricoesTarefas() {
      System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}

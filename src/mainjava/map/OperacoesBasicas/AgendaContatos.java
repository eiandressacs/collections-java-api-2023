package mainjava.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos
    private Map <String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Metodo adicionar contato
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    // Metodo remover contato
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    // Imprimir contatos
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Andressa", 1193737289);
        agendaContatos.adicionarContato("Aline", 1123456289);
        agendaContatos.adicionarContato("Alicia", 1193271423);
        agendaContatos.adicionarContato("Amanda", 1105729489);
        agendaContatos.adicionarContato("Aline", 1193271423);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Andressa");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Amanda"));

    }
}

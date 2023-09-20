package mainjava.set.Pesquisa;

import mainjava.set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Metodo adicionar contato
    public void adicionarContato(String nome, int numeroContato) {
        contatoSet.add(new Contato(nome, numeroContato));
    }

    // Metodo imprimir contato
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // Metodo pesquisar por nome
   public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        } return contatoPorNome;
   }

   // Metodo de atualizar numero de contato
   public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroContato(novoNumero);
                contatoAtualizado = c;
                break;
            }
        } return contatoAtualizado;
   }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Andressa", 1193737289);
        agendaContatos.adicionarContato("Aline", 1123456289);
        agendaContatos.adicionarContato("Alicia", 1163941289);
        agendaContatos.adicionarContato("Amanda", 1105729489);
        agendaContatos.adicionarContato("Aline", 1193271423); // Não add a Aline

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Aline"));

        // Atualizando número de contato, se o nome existir, ele vai atualizar.
        System.out.println("Némero de contato atualizado: " + agendaContatos.atualizarNumeroContato("Andressa", 1114389531));

        // Mostrar se foi alterado a Agenda e ela atualizada
        agendaContatos.exibirContatos();
    }

}

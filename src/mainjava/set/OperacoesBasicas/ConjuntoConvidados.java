package mainjava.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Adicionar convidado dentro do convite
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Remover Convidado por código do Convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Não existe convidado com este código de convite");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    // Retorna a quantidade convidados
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // Imprimir a quantidade de convidados
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

          conjuntoConvidados.adicionarConvidado("Convidado 1", 1111);
          conjuntoConvidados.adicionarConvidado("Convidado 2", 1112);
          conjuntoConvidados.adicionarConvidado("Convidado 3", 1112);
          conjuntoConvidados.adicionarConvidado("Convidado 4", 1114);
          conjuntoConvidados.exibirConvidados();

          System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

          conjuntoConvidados.removerConvidadoPorCodigoConvite(1111);
          System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

          conjuntoConvidados.exibirConvidados();
    }

}

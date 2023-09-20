package mainjava.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atriutos
    private String nome;
    private int numeroContato;

    public Contato(String nome, int numeroContato) {
        this.nome = nome;
        this.numeroContato = numeroContato;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    // set foi chamado, pois é necessario alterar o numero
    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

    // Metodo para não ter elementos com mesmo nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    // Formatado a impressão no terminal
    @Override
    public String toString() {
        return "{ " + nome + ", " + numeroContato + " }";
    }
}

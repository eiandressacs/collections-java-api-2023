package mainjava.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Criar Constructor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Criar os Getter para obter acesso aos atributos privados.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Para poder vizualisar o nome, idade e altura no Terminal.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    // Metodo de implementação do ComparableTo<T>
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    // Metodo de ordenar por Altura usando Comparator
    static class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }

}

package mainjava.list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoas {
    //Atributos
    private List<Pessoa> pessoaList;

    // Criar um constructor para essa classe,
    // não quero receber uma lista de pessoas e com um ArrayList vazio.
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    // Metodo de adicionar pessoas
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Metodo ordenar por idade usando Comparable
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Implementar a comparação por altura
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Andressa", 22, 1.56);
        ordenacaoPessoas.adicionarPessoa("Aline", 32, 1.60);
        ordenacaoPessoas.adicionarPessoa("Alicia", 12, 1.50);
        ordenacaoPessoas.adicionarPessoa("Amanda", 18, 1.63);

        //System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

package mainjava.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                // valorTotal = valorTotal + valorItem;
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras { " +
                "itens = " + itemList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do objeto CarrinhoDeompras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinhoDeCompras
        carrinhoDeCompras.adicionarItem("Caneta", 2, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 2, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35, 1);
        carrinhoDeCompras.adicionarItem("Mochila", 110, 1);
        carrinhoDeCompras.adicionarItem("Garrafa", 30, 1);
        carrinhoDeCompras.adicionarItem("Estojo", 43, 1);

        // Exibindo os itens do carrinhoDeCompras
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinhoDeCompras
        carrinhoDeCompras.removerItem("Caneta");

        // Exibindo os itens atualizados do carrinhoDeCompras
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra do carrinhoDeCompras:
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
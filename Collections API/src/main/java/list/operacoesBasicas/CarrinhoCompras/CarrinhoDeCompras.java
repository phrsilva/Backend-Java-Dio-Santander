package main.java.list.operacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {

    private final List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoList.isEmpty()) {
            for (Item i : carrinhoList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                    System.out.println(i.getNome() + " foi removido do carrinho.");
                }
            }
            carrinhoList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    

    }

    // calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : carrinhoList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println("O valor total do carrinho é: R$" + valorTotal);
    }

    // exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

    public void exibirItens() {
        if (!carrinhoList.isEmpty()) {
            System.out.println("Sua lista de compras: ");

            for (Item i : carrinhoList) {
                System.out.println(i.toString());
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Leite", 5.0, 2);
        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 1);
        carrinhoDeCompras.adicionarItem("Feijão", 15.0, 3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Feijão");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

    }
    
}

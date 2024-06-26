package main.java.list.operacoesBasicas.CarrinhoCompras;

public class Item {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Qtd:" + quantidade + " -- " + nome + " -- R$ " + String.format("%.2f", preco) + "\n";
     }



}

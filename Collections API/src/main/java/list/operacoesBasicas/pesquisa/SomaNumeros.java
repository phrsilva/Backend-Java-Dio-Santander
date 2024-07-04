package main.java.list.operacoesBasicas.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // uma lista de números inteiros como atributo

    private final List<Integer> listaNumeros;

    // metodo construtor

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // método para adicionar número à lista

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    // método para calcular soma dos números da lista

    public int somarNumeros() {
        int soma = 0;
        for (int i = 0; i < this.listaNumeros.size(); i++) {
            soma += this.listaNumeros.get(i);
        }
        return soma;
    }

    // método para encontrar maior número da lista e retornar seu valor

    public int encontrarMaiorNumero() {
        int maior = 0;
        for (int i = 0; i < this.listaNumeros.size(); i++) {
            if (this.listaNumeros.get(i) > maior) {
                maior = this.listaNumeros.get(i);
            }
        }
        return maior;
    }

    // método para encontrar menor número da lista e retornar seu valor

    public int encontrarMenorNumero() {
        int menor = this.listaNumeros.get(0);
        for (int i = 0; i < this.listaNumeros.size(); i++) {
            if (this.listaNumeros.get(i) < menor) {
                menor = this.listaNumeros.get(i);
            }
        }
        return menor;
    }

    // exibir números da lista

    public void exibirNumeros() {
        for (int i = 0; i < this.listaNumeros.size(); i++) {
            System.out.println(this.listaNumeros.get(i));
        }
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);

        System.out.println("A soma dos números é: " + somaNumeros.somarNumeros());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Os números da lista são: " + somaNumeros.listaNumeros);

        
    }


}

package main.java.list.operacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {


    private final List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }


    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosDescendente);
            Collections.reverse(numerosDescendente);
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    // imprimir números 

    public void exibirNumeros() {
        if(!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(40);

        // exibir os números em ordem ascendente
        System.out.println("Numeros em ordem ascendente: " + ordenacaoNumeros.ordernarAscendente());
        // exibir os números em ordem descendente  

        System.out.println("Numeros em ordem descendente: " + ordenacaoNumeros.ordernarDescendente());

        // exibir os números na lista
        ordenacaoNumeros.exibirNumeros();


    }

}

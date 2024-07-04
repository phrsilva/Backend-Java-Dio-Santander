package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidados convidadoParaRemover = null;

        for (Convidados c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }


    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set convidados");

        conjuntoConvidados.adicionarConvidado("Joaquim", 1);
        conjuntoConvidados.adicionarConvidado("Joaquim", 2);
        conjuntoConvidados.adicionarConvidado("Mévio", 2);


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set convidados");

        conjuntoConvidados.exibirConvidados();

    }
    
    
}

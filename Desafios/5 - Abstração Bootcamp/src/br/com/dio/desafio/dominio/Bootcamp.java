package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate datafinal = LocalDate.now().plusDays(45);
    private Set<Alunos> alunosInscritos = new HashSet<>();
    private Set<Curso> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Alunos> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Alunos> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Curso> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Curso> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
        result = prime * result + ((alunosInscritos == null) ? 0 : alunosInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (datafinal == null) {
            if (other.datafinal != null)
                return false;
        } else if (!datafinal.equals(other.datafinal))
            return false;
        if (alunosInscritos == null) {
            if (other.alunosInscritos != null)
                return false;
        } else if (!alunosInscritos.equals(other.alunosInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

// toString
    @Override
    public String toString() {
        return nome + "\n" + descricao + "\nData de Início: " + dataInicial + "\nData de Término: "
                + datafinal + "\nAlunos Inscritos: " + alunosInscritos + "\nConteúdos: " + conteudos + "]";
    }













    
}

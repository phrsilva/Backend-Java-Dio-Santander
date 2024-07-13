package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;
    public Set<Conteudo> conteudos = new LinkedHashSet<>();
    
       
    
    // Getters and Setters
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }  
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // toString
    @Override
    public String toString() {
        return "Título: " + titulo + " || Descrição: " + descricao +  " || Carga Horária: " +cargaHoraria;
    }



    
    
}

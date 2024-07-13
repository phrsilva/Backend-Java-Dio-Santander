package br.com.dio.desafio.dominio;

public class Conteudo {

    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private String tipoConteudo;

    // Getters and Setters
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

    public String getTipoConteudo() {
        return tipoConteudo;
    }

    public void setTipoConteudo(String tipoConteudo) {
       this.tipoConteudo = tipoConteudo;
    }



 

    // toString
    @Override
    public String toString() {
        return """
               ==== Conteúdo: ==== 
               Título: """ + titulo + "\n" + 
        "Descrição: " + descricao + "\n" + 
        "Carga Horária: " + cargaHoraria + "\n" + 
        "Tipo de conteúdo: " + tipoConteudo + "\n";
    }


    
}

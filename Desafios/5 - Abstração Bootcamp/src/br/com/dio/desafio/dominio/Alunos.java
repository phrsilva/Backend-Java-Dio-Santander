package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Alunos {

    private String nome;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();

   // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    // métodos

    public void novaInscricao(Bootcamp bootcamp) {
        this.cursosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getAlunosInscritos().add(this);

    }

    public void progredir() {

        Optional<Curso> curso = this.cursosInscritos.stream().findFirst();
        if (curso.isPresent()) {
            this.cursosConcluidos.add(curso.get());
            this.cursosInscritos.remove(curso.get());
        } else {
            System.err.println("Nao existem mais cursos para serem concluidos");
        }
    
    
    }

    // toString
    @Override
    public String toString() {
        return nome;
    }



    
}

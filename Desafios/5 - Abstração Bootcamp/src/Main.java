import br.com.dio.desafio.dominio.Alunos;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Backend Java");
        curso1.setCargaHoraria(24);
        curso1.setDescricao("Fundamentos de Java para Backend");

        Conteudo conteudo1 = new Conteudo();

        conteudo1.setCargaHoraria(12);
        conteudo1.setDescricao("Introdução à Linguagem de Programação Java, com seus fundamentos e operações Básicas");
        conteudo1.setTipoConteudo("Video-Aula");
        conteudo1.setTitulo("Introdução à Java");

        Conteudo conteudo2 = new Conteudo();

        conteudo2.setCargaHoraria(10);
        conteudo2.setTitulo("Orientação à Objetos");
        conteudo2.setDescricao("Pilares da orientação à objetos e seus conceitos");
        conteudo2.setTipoConteudo("Vídeo-Aula");

        curso1.getConteudos().add(conteudo1);
        curso1.getConteudos().add(conteudo2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java 2024");
        bootcamp1.setDescricao("Bootcamp voltado para ensinar a linguagem Java");

        bootcamp1.getConteudos().add(curso1);

        Alunos alunos1 = new Alunos();
        alunos1.setNome("João");
        alunos1.novaInscricao(bootcamp1);

        Alunos alunos2 = new Alunos();
        alunos2.setNome("Maria");
        alunos2.novaInscricao(bootcamp1);

        System.out.println(bootcamp1);

        alunos1.progredir();
        alunos2.progredir();
        
        
    }
}

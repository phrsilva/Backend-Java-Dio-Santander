public class IPhone implements MusicPlayer, NavegadorWeb, TelefoneMovel {

    @Override
    public void realizarChamada(String numero) {
        System.out.println("Realizando chamada para " + numero);

    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música");

    }

    @Override
    public void pause() {
        System.out.println("Pausando a música");
    }

    @Override
    public void escolherMusica(String nomeMusica) {
        System.out.println("Reproduzindo a musica " + nomeMusica);
    }
    
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.escolherMusica("Rock and Roll all Night");
        iPhone.receberChamada();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina("https://www.google.com.br");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.play();
        iPhone.pause();
    }
}


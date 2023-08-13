package dio.javaCloudAWS.projetoUML;

import dio.javaCloudAWS.projetoUML.interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

    private Musica musicaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            musicaAtual.tocar();
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }


    @Override
    public void selecionarMusica(String musica, String artista) {
        musicaAtual = new Musica(musica, artista);
        System.out.println("Selecionando a música: " + musicaAtual.nome + " - " + musicaAtual.artista);
    }

    @Override
    public boolean estaTocando() {
        return false;
    }

    class Musica {
        private String nome;
        private String artista;

        public Musica(String nome, String artista) {
            this.nome = nome;
            this.artista = artista;
        }

        public void tocar() {
            System.out.println("Tocando: " + nome + " - " + artista);
        }
    }
}

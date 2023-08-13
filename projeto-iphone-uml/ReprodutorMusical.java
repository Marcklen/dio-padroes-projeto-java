package dio.javaCloudAWS.projetoUML.interfaces;

public interface ReprodutorMusical {

    void tocar();

    void pausar();

    void selecionarMusica(String musica, String artista);

    boolean estaTocando();
}

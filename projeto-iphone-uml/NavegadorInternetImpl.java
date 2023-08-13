package dio.javaCloudAWS.projetoUML;

import dio.javaCloudAWS.projetoUML.interfaces.NavegadorInternet;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternetImpl implements NavegadorInternet {

    private List<AbaNavegador> aba = new ArrayList<>();
    private int abaAtual = 1;


    @Override
    public void exibirPagina(String url) {
        if (abaAtual > 0 && abaAtual < aba.size()) {
            aba.get(abaAtual).exibirPagina();
        } else {
            System.out.println("Não há páginas abertas");
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        AbaNavegador novaAba = new AbaNavegador(url.toLowerCase(), "Nova Aba", "Conteúdo da nova aba");
        aba.add(novaAba);
        abaAtual = aba.size() - 1;
    }

    @Override
    public void atualizarPagina() {
        if (abaAtual >= 0 && abaAtual < aba.size()) {
            System.out.println("Atualizando página: " + aba.get(abaAtual).url);
        } else {
            System.out.println("Não há páginas abertas");
        }
    }

    class AbaNavegador {
        String url;
        String titulo;
        String conteudo;

        public AbaNavegador(String url, String titulo, String conteudo) {
            this.url = url;
            this.titulo = titulo;
            this.conteudo = conteudo;
        }

        public void exibirPagina() {
            System.out.println("Exibindo página: " + url);
        }
    }
}

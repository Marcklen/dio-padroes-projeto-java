package dio.javaCloudAWS.projetoUML;

import dio.javaCloudAWS.projetoUML.interfaces.AparelhoTelefonico;

public class Iphone {

    public static void main(String[] args) {

        AparelhoTelefonico iphone = new AparelhoTelefonicoImpl();
        NavegadorInternetImpl navegador = new NavegadorInternetImpl();
        ReprodutorMusicalImpl reprodutor = new ReprodutorMusicalImpl();
        System.out.println("Ligando o iPhone...\nEfetuando ligação...");
        iphone.ligar();
        System.out.println("Utilizando o correio de voz...");
        iphone.iniciarCorreioDeVoz();
        System.out.println("Atendendo a ligação...");
        iphone.atender();
        System.out.println("------------------------------------");
        System.out.println("Utilizando o navegador de internet...");
        navegador.adicionarNovaAba("https://github.com/Marcklen");
        navegador.atualizarPagina();
        navegador.exibirPagina("https://www.google.com.br");
        System.out.println("------------------------------------");
        System.out.println("Utilizando o reprodutor de música...");
        reprodutor.selecionarMusica("Tempo Perdido", "Renato Russo");
        reprodutor.tocar();
        reprodutor.pausar();
    }
}

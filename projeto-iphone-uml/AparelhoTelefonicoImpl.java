package dio.javaCloudAWS.projetoUML;

import dio.javaCloudAWS.projetoUML.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    private boolean ligado;
    private boolean chamadaEmAndamento;
    private boolean correioDeVoz;

    public AparelhoTelefonicoImpl() {
        this.ligado = false;
        this.chamadaEmAndamento = false;
        this.correioDeVoz = false;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        if (ligado && !chamadaEmAndamento) {
            chamadaEmAndamento = true;
            System.out.println("Atendendo...");
        } else {
            System.out.println("Não foi possível atender a sua chamada! Verifique se o aparelho está ligado e se não há outra chamada em andamento.");
        }
    }

    @Override
    public void iniciarCorreioDeVoz() {
        if (ligado && !chamadaEmAndamento) {
            correioDeVoz = true;
            System.out.println("Correio de voz iniciado...");
        } else {
            System.out.println("Não foi possível iniciar o correio de voz! Verifique se o aparelho está ligado e se não há outra chamada em andamento.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void desligar() {
        if (isLigado()) {
            ligado = false;
        }
        System.out.println("Desligando...");
    }
}

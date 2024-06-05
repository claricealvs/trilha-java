package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    @Override
    public String ligar(String numero) {
        System.out.println("Ligando para " + numero);
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
        return musica;
    }
}

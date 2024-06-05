package testes;

import model.IPhone;

public class teste {
    public static void main(String[] args) {
        
        IPhone i08 = new IPhone();
        i08.ligar("4002-8922");
        i08.iniciarCorreioVoz();
        i08.atender();

        System.out.println("\n");

        IPhone i11 = new IPhone();
        i11.exibirPagina("dio.me");
        i11.adicionarNovaAba();
        i11.atualizarPagina();

        System.out.println("\n");

        IPhone i13 = new IPhone();
        i13.selecionarMusica("Everything Matters");
        i13.tocar();
        i13.pausar();
    }
}

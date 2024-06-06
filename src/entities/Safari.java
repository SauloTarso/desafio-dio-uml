package entities;

import interfaces.NavegadorWeb;

public class Safari implements NavegadorWeb{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Digitar endereco URL no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página Web");
    }

}

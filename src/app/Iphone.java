package app;

import java.util.List;

import entities.Aplicativos;
import entities.Contato;
import interfaces.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico {

    private String modelo;
    private String dimensoes;
    private String material;
    List<Contato> contatos;
    List<Aplicativos> aplicativos;

    @Override
    public void ligar(String numero) {
        System.out.println("Digite o número do contato");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada telefônica");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Digite o número de Correio de Voz");
    }

    public String getModelo() {
        return modelo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public String getMaterial() {
        return material;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}

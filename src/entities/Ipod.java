package entities;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música atual");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada -> " + musica);
    }

}

package packageunivers.javacore.Aintroducaoclasses.dominio;

public class ControleRemoto implements Controlador {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;


    //METODOS ESPECIAIS
    public void ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" |");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && getVolume() > 0) {
            this.setVolume(0);

        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não conseui repoduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}

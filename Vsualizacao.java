package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Vsualizacao {
    private Inscrito espectador;
    private Video filme;

    public Vsualizacao(Inscrito espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Inscrito getEspectador() {
        return espectador;
    }

    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vsualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}

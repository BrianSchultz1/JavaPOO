package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Inscrito extends Pessoa {
    private String login;
    private int totAssistindo;

    public Inscrito(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Inscrito{" + super.toString() +
                "\nlogin = " + login + '\'' +
                ", totAssistindo = " + totAssistindo +
                '}';
    }
}

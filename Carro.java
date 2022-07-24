package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    private int ano;

    public boolean correndo;

    public void status() {
        System.out.println("nome" + this.nome);
        System.out.println("nome" + this.modelo);
        System.out.println("nome" + this.ano);
        System.out.println("nome" + this.correndo);
    }

    public void correr() {
        if (this.correndo == true) {
            System.out.println(" carro correndo");
        } else {
            System.out.println("carro não correndo");
        }
    }

}

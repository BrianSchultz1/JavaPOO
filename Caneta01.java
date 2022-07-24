package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Caneta01 {

    private boolean tampada;
    private String cor;
    public String modelo;
    private float ponta;


    public Caneta01(String m, String c, float p) {
//        este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("modelo " + this.getModelo());
        System.out.println("ponta " + this.getPonta());
        System.out.println("cor " + this.cor);
        System.out.println("tampada " + this.tampada);
    }

}

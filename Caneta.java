package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Caneta {
    //atributo
    public String modelo;
    public String cor;
    private float ponta;
    public int carga;
    public boolean tampada;

    public void status() {
        System.out.println("modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }
 
    //método
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;

    }
}

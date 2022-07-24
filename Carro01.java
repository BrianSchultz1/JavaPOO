package packageunivers.javacore.Aintroducaoclasses.dominio;

public class Carro01 {
    public String nome;
    public String modelo;
    private int ano;
    public boolean correndo;


    public Carro01(String n, String m, int a) {
        this.nome = n;
        this.modelo = m;
        this.ano = a;
        this.correndo();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo() {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno() {
        this.ano = ano;
    }


    public void correndo() {
        this.correndo = true;
    }

    public void naoCorrendo() {
        this.correndo = false;
    }

    public void status() {
        System.out.println("sobre o carro: ");
        System.out.println("modelo: "+this.getModelo());
        System.out.println("nome: "+this.getNome());
        System.out.println("ano: "+this.getAno());
        System.out.println("correndo: "+this.correndo);
    }
}

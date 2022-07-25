package packageunivers.javacore.Aintroducaoclasses.dominio;

public class ContaBanco {
    //ATRIBUTO
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual () {
        System.out.println("---------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }

    //METODOS PERSONALIZADOS
    public void abrirCOnta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "ContaCorrente") {
            this.setSaldo(50);
        } else if (t == "ContaPoupanca") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharCOnta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, ela não pode ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débito, ela não pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
           this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }

    }

    public void pagarMensal() {
        //VARIAVEL LOCAL
        int v = 0;
        if (this.getTipo() == "ContaCorrente") {
            v = 12;
        } else if (this.getTipo() == "ContaPoupanca") {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }

    }

    //CONSTRUTOR
    public void ContaBanco() {
        this.saldo = 0;
    }

    //GETTERS AND SETTERS
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

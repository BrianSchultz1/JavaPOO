package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.ContaBanco;

public class ContaBancoTest {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Brian Schultz");
        p1.abrirCOnta("ContaCorrente");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Leona");
        p2.abrirCOnta("ContaPoupanca");


        p2.depositar(500);
        p2.sacar(100);

        p1.fecharCOnta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}

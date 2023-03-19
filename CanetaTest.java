package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Caneta01;

public class CanetaTest {
    public static void main(String[] args) {
        Caneta01 c1 = new Caneta01("Nic", "amarela", 0.3f);
        c1.status();
        System.out.println();
        Caneta01 c2 = new Caneta01("BIC", "Azul", 0.7f);
        c1.status();

//        c1.setModelo("BIC");
////        c1.modelo = "bic";
//
//        c1.setPonta(0.4f);
////        c1.ponta = 0.4f;
//        c1.status();
//        System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
} 

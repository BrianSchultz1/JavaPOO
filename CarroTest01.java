package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Carro01;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro01 car1 = new Carro01("Ferrari","Enzo", 2015 );
        car1.status();

        System.out.println("-------------------------");

        Carro01 car2 = new Carro01("Chevrolet", "Classic", 1999);
        car1.status();



//        car1.nome = "Gol";
//        car1.modelo = "sport";
//        car1.correr();
//        car1 = car2;
//        car1.status();
//        car2.nome = "Mustang";
//        car2.modelo = "GT 500";
//
//        System.out.println(car1.nome + " modelo: " + car1.modelo + " ano " );
//        System.out.println(car2.nome + " modelo: " + car2.modelo + " ano " );
    }
}

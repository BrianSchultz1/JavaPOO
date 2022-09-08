package packageunivers.javacore.Aintroducaoclasses.test;

import packageunivers.javacore.Aintroducaoclasses.dominio.Inscrito;
import packageunivers.javacore.Aintroducaoclasses.dominio.Video;
import packageunivers.javacore.Aintroducaoclasses.dominio.Vsualizacao;

public class ProjetoVideoTest {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");



        Inscrito i[] = new Inscrito[2];
        i[0] = new Inscrito("Brian", 18, "M",2, "Schultz");
        i[1] = new Inscrito("Friedrich", 18, "M",2, "Santos");

        Vsualizacao vis = new Vsualizacao(i[0], v[2]);
        System.out.printf(vis.toString());

//        System.out.println(v[0].toString());
//        System.out.println(i[0].toString());
    }
}

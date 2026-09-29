package ex_01;

public class Codigo_Lampada {


    public static void main(String[] args) {

        var lampada = new Lampada();

        System.out.println(lampada.Estaligada());
        lampada.ligar();
        System.out.println(lampada.Estaligada());
        lampada.alternar();
        System.out.println(lampada.Estaligada());
        lampada.alternar();
        System.out.println(lampada.Estaligada());

    }
}

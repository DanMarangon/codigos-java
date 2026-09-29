package ex_04;

public class Codigo_Contador {


    public static void main(String[] args){


        var contador = new Contador(10);
        var contador1 = new Contador();


        contador.incrementar();
        contador1.incrementar();

        System.out.println(contador.getValor());
        System.out.println(contador1.getValor());

        contador.decrementar();
        contador1.decrementar();

        System.out.println(contador.getValor());
        System.out.println(contador1.getValor());

        contador.zerar();

        System.out.println(contador.getValor());

        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();

        System.out.println(contador1.getValor());



    }

}

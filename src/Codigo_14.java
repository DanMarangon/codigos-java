import java.util.Scanner;



public class Codigo_14 {

    public static void main(String[] args){

        var Joao = new Pessoa();
        Joao.setNome("Joao");
        Joao.setIdade(18);

        var Maria = new Pessoa();
        Maria.setIdade(20);
        Maria.setNome("Maria");

        System.out.println("Nome1: " + Joao.getNome() + " Nome2: " + Maria.getNome() + " Idade1: " + Joao.getIdade() + " Idade2: " + Maria.getIdade());


    }

}

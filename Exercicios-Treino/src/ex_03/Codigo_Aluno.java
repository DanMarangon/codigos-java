package ex_03;

public class Codigo_Aluno {

    public static void main(String[] args){

        var aluno1 = new Aluno("Pedro", 8,7,9);

        System.out.println(aluno1.calcularMedia());
        System.out.println(aluno1.estaAprovado());
        System.out.println(aluno1.getSituacao());


        var aluno2 = new Aluno("Bruno", 5,6,4);

        System.out.println(aluno2.calcularMedia());
        System.out.println(aluno2.estaAprovado());
        System.out.println(aluno2.getSituacao());

        var aluno3 = new Aluno("Caio",2,3,4);

        System.out.println(aluno3.calcularMedia());
        System.out.println(aluno3.estaAprovado());
        System.out.println(aluno3.getSituacao());
    }



}

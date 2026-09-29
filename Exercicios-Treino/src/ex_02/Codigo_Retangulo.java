package ex_02;

public class Codigo_Retangulo {


    public static void main(String[] args){


       var retangulo = new Retangulo(2,4);
       var retanguloo = new Retangulo(2,2);

       System.out.println(retangulo);
       System.out.println(retangulo.ehQuadrado());
       System.out.println(retangulo.calcularArea());
       System.out.println(retangulo.calcularPerimetro());
       System.out.println(retanguloo.ehQuadrado());



    }

}

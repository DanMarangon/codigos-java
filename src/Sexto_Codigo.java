import java.util.Scanner;

public class Sexto_Codigo {

    public static void main(String[] Args){

        var scanner = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();
        System.out.print("Você é emancipado? ");
        var emancipado = scanner.nextBoolean();
        boolean resultado = idade >= 18 || (emancipado == true && idade >= 16);
        System.out.println("Você pode dirigir? " + resultado);


    }

}

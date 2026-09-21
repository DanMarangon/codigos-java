import java.util.Scanner;

public class Quarto_Codigo {


    public static void main(String[] Args){

        var scanner = new Scanner(System.in);

        System.out.println("Digite um numero diferente de 6: ");
        int resultado = scanner.nextInt();
        boolean Correto = resultado != 6;
        System.out.println("Você digitou um número diferente de 6? " + Correto);



    }



}

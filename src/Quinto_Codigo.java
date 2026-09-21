import java.util.Scanner;

public class Quinto_Codigo {

    public static void main(String[] Args){


        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        int resultado = scanner.nextInt();
        boolean Maior = resultado >= 18;
        System.out.println("Você está apto a dirigir? " + Maior);


    }






}

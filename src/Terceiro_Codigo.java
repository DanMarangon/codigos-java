import java.util.Scanner;

public class Terceiro_Codigo {

    public static void main(String[] args) {

           var scanner = new Scanner(System.in);
           System.out.println("Quanto é 2 + 2? ");
           var Numero = scanner.nextInt();
           boolean EstaCerto = Numero == 4;
           System.out.println("O resultado é 4, você acertou? " + EstaCerto);

    }


}

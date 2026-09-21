import java.util.Scanner;

public class Segundo_Codigo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome: ");
        String nome=scanner.next();
        System.out.println("Olá, informe a sua idade: ");
        int idade=scanner.nextInt();
        System.out.println("Olá, " + nome + " Sua idade é: " + idade);


    }


}

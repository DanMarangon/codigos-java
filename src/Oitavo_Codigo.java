import java.util.Scanner;

public class Oitavo_Codigo {


    public static void main(String[] Args) {

        System.out.println("Primeiro Exercicio.");

        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite a sua idade: ");
        Integer Idade = scanner.nextInt();

        System.out.println("Olá " + nome + " você tem " + Idade + " anos");

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Segundo Exercicio: ");

        System.out.println("Digite o valor do lado do quadrado: ");

        Integer lado = scanner.nextInt();

        System.out.println("A área do quadrado = " + (lado * lado));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Terceiro Exercicio");

        System.out.println("Digite o valor da altura do retângulo: ");

        Integer altura = scanner.nextInt();

        System.out.println("Digite o valor da base do retângulo: ");

        Integer base = scanner.nextInt();

        System.out.println("A área do seu retângulo é: " + (altura * base));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Quarto Exercicio: ");

        System.out.println("Digite o primeiro nome: ");
        String nome1 = scanner.next();

        System.out.println("Digite a primeira idade: ");
        Integer idade1 = scanner.nextInt();

        System.out.println("Digite o segundo nome: ");
        String nome2 = scanner.next();

        System.out.println("Digite a segunda idade: ");
        Integer idade2 = scanner.nextInt();

        if (idade1 > idade2) {
            System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de: " + (idade1 - idade2));

        }
        else {
            System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de: " + (idade2 - idade1));

        }
    }
}
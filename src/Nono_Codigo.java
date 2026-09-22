import java.util.Scanner;

public class Nono_Codigo {

    public static void main(String[] Args){


            var scanner= new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite a sua idade: ");
            Integer idade = scanner.nextInt();

            if (idade >= 18){
                System.out.println(nome + ", você é de maior, pois tem " + idade + " anos.");
            } else if (idade < 0) {
                System.out.println("Idade inválida.");
            } else{
                System.out.println(nome + ", você é de menor, pois possui " + idade + " anos");
            }


    }

}

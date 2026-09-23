import java.util.Scanner;

public class Codigo_12 {

    public static void main(String[] Args){

        String nome;
        var scanner = new Scanner(System.in);

        while(true){

            System.out.println("Digite um nome: ");
            nome = scanner.next();
            System.out.println("Seja bem vindo (a): " + nome);

            if(nome.equalsIgnoreCase("exit")){

                break;

            }


        }

        Integer numero = 1;

        do {
            System.out.println(numero);
            numero ++;
        } while (numero != 10);




    }


}

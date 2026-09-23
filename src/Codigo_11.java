import java.util.Scanner;


 class Codigo_11 {

    public static void main(String[] Args){

        var scanner = new Scanner(System.in);
        Integer i = 0;
        Integer numero = 0;
        for(i = 0; i < 100; i++){
            System.out.println("Digite um nome: ");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("exit")) break;

            System.out.println(nome);
        }

        for(i = 0; i < 20; i++){


            System.out.println(numero);
            numero++;

        }


    }

}

import java.util.Scanner;

public class Codigo_13 {

    public static void main(String[] args){


        // PRIMEIRO EXERCICIO
    Integer numero;
    var scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    numero = scanner.nextInt();
    Integer i;
    for(i = 1; i < 11; i++){

        System.out.println( (numero * i) );

    }
    // SEGUNDO EXERCICIO ------------------------------------


    float altura;
    float peso;

    System.out.println("Digite sua altura: ");
    altura = scanner.nextFloat();
    System.out.println("Digite o seu peso: ");
    peso = scanner.nextFloat();
    float IMC = peso / (altura * altura);
    if (IMC <= 18.5){

        System.out.println("Abaixo do peso.");

    } else if (IMC >= 18.6 && IMC <= 24.9) {
        System.out.println("Peso Ideal");
    } else if (IMC >= 25 && IMC <= 29.9) {
        System.out.println("Levemente acima do peso.");
    } else if (IMC >= 30 && IMC <= 34.9) {
        System.out.println("Obesidade grau I");
    } else if (IMC >= 35 && IMC <= 39.9) {
        System.out.println("Obesidade grau II (Severa)");
    }
    else {

        System.out.println("Obesidade III (Mórbida)");

    }
    // TERCEIRO EXERCICIO -----------------------------------

        Integer numero1;
        Integer numero2;
        Integer iii;
        Integer ii;
        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        String escolha;
        System.out.println("Escolha entre Par ou Impar: ");
        escolha = scanner.next();
        if (numero1 > numero2){
            return;
        }

        else{

            switch (escolha){

                case "Impar":
                    System.out.println("Você escolheu o número: " + numero1 + " e o numero: " +numero2);
                    for(iii= numero2; iii >= numero1; iii-- ){

                        if (iii % 2 == 1){

                            System.out.println(iii);
                        }


                    }
                    break;
                case "Par":
                    System.out.println("Você escolheu o número: " + numero1 + " e o numero: " +numero2);
                    for(ii = numero2; ii >= numero1; ii--){

                        if (ii % 2 == 0){
                            System.out.println(ii);

                        }

                    }
                    break;
            }


        }


    // EXERCICIO QUATRO -----------------------------------------


        System.out.println("Digite o número base: ");
        Integer numeroo = scanner.nextInt();
        Integer divisor;
        do {
            System.out.println("Digite os números: ");
             divisor = scanner.nextInt();

        } while ( (numeroo % divisor) == 0);
    }
}

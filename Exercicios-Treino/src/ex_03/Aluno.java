package ex_03;

public class Aluno {

    private String nome;
    private double nota;
    private double nota1;
    private double nota2;


    public Aluno(String nome, double nota, double nota1, double nota2){

        this.nome = nome;
        this.nota = nota;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }
    public double calcularMedia(){

        double resultado;

        resultado = (nota + nota1 + nota2)/3;

        return resultado;

    }
    public boolean estaAprovado(){

        boolean esta;

        if (calcularMedia() >= 7){

            return esta = true;

        }
        else{

            return esta = false;


        }

    }
    public String getSituacao(){

        if (estaAprovado() == true){

            return "Aprovado";

        } else if(calcularMedia() <= 7 && calcularMedia() >= 5){

            return "Recuperação";

        }
        else{

            return "Reprovado";

        }

    }

    public String getNome(){

        return nome;

    }
}

package ex_04;

public class Contador {
    private int valor;
    public Contador(){

        valor = 0;

    }
    public Contador(int valor){

        this.valor = valor;

    }

    public void incrementar(){

        valor += 1;

    }

    public void decrementar(){

        if (valor > 0) {

            valor--;

        }





    }
    public void zerar(){

        valor = 0;

    }

    public int getValor(){

        return valor;

    }



}

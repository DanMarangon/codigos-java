package ex_01;

public class Lampada {


    private boolean ligada = false;


    public void ligar(){

        ligada = true;

    }

    public void desligar(){

        ligada = false;

    }

    public boolean Estaligada(){

        return ligada;

    }

    public void alternar(){

        if (ligada == true){

            ligada = false;



        }
        else {

            ligada = true;

        }


    }


}

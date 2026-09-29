package ex_02;

public class Retangulo {


    private double altura;
    private double largura;


    public Retangulo(double altura, double largura){

        this.altura = altura;
        this.largura = largura;


    }
    public double calcularArea() {

        double resultado;
        resultado = altura * largura;

        return resultado;

    }

    public double calcularPerimetro() {

        double perimetro;

        perimetro = altura * 2 + largura * 2;

        return perimetro;

    }

    public boolean ehQuadrado() {

        if (largura == altura) {

            return true;

        } else {

            return false;

        }
    }

    public void setLado(double largura) {

        this.largura = largura;

    }

    public void setAltura(double altura){

        this.altura = altura;


    }

}



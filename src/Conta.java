public class Conta {

    private double Saldo_Inicial;

    private double valor_cheque;

    public Conta(double DepositoInicial){

        Saldo_Inicial = DepositoInicial;
        if (Saldo_Inicial <= 500.0){

            valor_cheque = 50;



        }
        else if(Saldo_Inicial > 500.0){

            valor_cheque = Saldo_Inicial/2;



        }



    }







        public boolean getCheque() {
            return Saldo_Inicial < 0;
        }



    public void sacar(double valor){

        if(valor <= Saldo_Inicial + valor_cheque) {
            Saldo_Inicial = Saldo_Inicial - valor;
        }
        else{

            System.out.println("Você não tem esse valor disponível para saque.");

        }

    }

    public void depositar(double deposito){

        if (Saldo_Inicial < 0){


            Saldo_Inicial = Saldo_Inicial - (valor_cheque * 0.2);

        }
        else {
            Saldo_Inicial = Saldo_Inicial + deposito;
        }

    }
    public void Boleto(String codigo, double valor){

        if (Saldo_Inicial + valor_cheque >= valor){

            Saldo_Inicial = Saldo_Inicial - valor;
             System.out.println("Seu boleto está pago. Seu novo Saldo é de: " + Saldo_Inicial);

        }
        else{

            System.out.println("Você não possui saldo suficiente para pagar esse boleto.");

        }

    }
    public double getSaldo(){

        return Saldo_Inicial;

    }
    public double getvalor_cheque(){

        return valor_cheque;

    }
}

package models;

public class ContaEspecial extends ContaComum{
    private double limiteConta;

    //Encapsulamento
    public double getLimiteConta(double limiteConta){
        return limiteConta;
    }
    public void setLimiteConta(){
        this.limiteConta = limiteConta;
    }

    //Métodos
    public long abrirConta(int senha, double limite) {
        this.limiteConta = limite;

        return super.abrirConta(senha);
    }
    public String sacarValor(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return "Saque efetuado com sucesso";
        }
        else if(this.saldo+limiteConta >= valor){
            this.saldo -=valor;
            this.limiteConta += saldo;

            return "Saque efetuado com sucesso";
        }
        else{
            return "Saque não efetuado, saldo insuficiente";
        }
    }
}

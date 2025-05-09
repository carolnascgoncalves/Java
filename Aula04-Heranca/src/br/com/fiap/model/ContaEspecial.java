package br.com.fiap.model;
import br.com.fiap.enums.*;
import br.com.fiap.model.*;


public class ContaEspecial extends ContaComum {
    private double limiteConta;

    //Encapsulamento
    public double getLimiteConta(){
        return limiteConta;

        //O get retorna o valor escrito, então ele MOSTRA o valor
    }
    public void setLimiteConta(double limiteConta){
        this.limiteConta = limiteConta;

        //O set altera o valor
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
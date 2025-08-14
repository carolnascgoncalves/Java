package models;
import Exception.*;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        saldo -= valor;
        System.out.println("Saque realizado. Salto atual: R$" + saldo);
    }
}

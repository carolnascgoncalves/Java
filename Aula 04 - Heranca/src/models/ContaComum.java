package models;

import enums.SituacaoEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaComum {
    protected Long nroConta;
    protected LocalDateTime dtAbertura;
    protected LocalDateTime dtEncerramento;
    protected SituacaoEnum situacaoEnum;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;

    //Encapsulamento
    public Long getNroConta(){
        return nroConta;
    }
    public void setNroConta(Long nroConta){
        this.nroConta = nroConta;
    }
    //------
    public LocalDateTime getDtAbertura(){
        return dtAbertura;
    }
    public void setDtAbertura(LocalDateTime dtAbertura){
        this.dtAbertura = dtAbertura;
    }
    //------
    public LocalDateTime getDtEncerramento(){
        return dtEncerramento;
    }
    public void setDtEncerramento(LocalDateTime dtEncerramento){
        this.dtEncerramento = dtEncerramento;
    }
    //------
    public SituacaoEnum getSituacaoEnum(){
        return situacaoEnum;
    }
    public void setSituacaoEnum(SituacaoEnum situacaoEnum){
        this.situacaoEnum = situacaoEnum;
    }
    //------
    public int getSenha(){
        return senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    //------
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //------
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    //------

    //Metodos
    public Long abrirConta(int senha) {
        this.senha = senha;

        dtAbertura = LocalDateTime.now();
        situacaoEnum = SituacaoEnum.ATIVA;

        saldo = 100;

        this.nroConta = 12345l;

        return nroConta; //prof ensina nois
    }

    public boolean validarSenha(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    public String sacarValor(double valor) {
        if(valor <= saldo){
            saldo -= valor;

            return "Saque efetuado com sucesso";
        }
        return "Saque não efetuado, saldo insuficiente";

    }
    public void depositarValor(double valor, long nroConta){
        if(this.nroConta == nroConta){
            saldo += valor;
        }
    }
    public String encerrarConta(long nroConta){
        if(this.nroConta == nroConta){
            situacaoEnum = SituacaoEnum.INATIVA;
            saldo = 0;

            return "Conta encerrada";
        }
        return "Conta inválida";
    }

}

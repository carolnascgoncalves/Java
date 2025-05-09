package br.com.fiap.models;

public class Professor extends Funcionario{
    private double cargaHoraria;
    private double valorHora;


    //Encapsulamento
    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    //Construtores
    public Professor(String nome, String cpf, String nroCtps, double salario,
                     double cargaHoraria, double valorHorario){

        super(nome, cpf, nroCtps, salario);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHorario;
    }
    public Professor(){}


    //Métodos
    public void CalcularSalario(){
        salario = (cargaHoraria * valorHora) * 1.5;
    }
}
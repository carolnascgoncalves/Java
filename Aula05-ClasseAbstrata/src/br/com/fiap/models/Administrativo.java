package br.com.fiap.models;

public class Administrativo extends Funcionario{
    private int jornada;
    private int qtdSalariosMinimos;


    //Encapsulamento
    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public int getQtdSalariosMinimos() {
        return qtdSalariosMinimos;
    }

    public void setQtdSalariosMinimos(int qtdSalariosMinimos) {
        this.qtdSalariosMinimos = qtdSalariosMinimos;
    }


    //Construtores
    public Administrativo(String nome, String cpf, String nroCtps, double salario,
                          int jornada, int qtdSalariosMinimos){

        super(nome, cpf, nroCtps, salario);
        this.jornada = jornada;
        this.qtdSalariosMinimos = qtdSalariosMinimos;
    }
    public Administrativo(){}


    //Métodos
    public void CalcularSalario(){
        if(jornada == 40){
            salario = qtdSalariosMinimos * 1200 * 4.5;
        }
        else{
            salario = (qtdSalariosMinimos * 1200 * 4.5) / 2;
        }
    }
}
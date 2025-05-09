package br.com.fiap.models;

//Classe abstrata não pode ser instanciada pois não existe no mundo real
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String numeroCtps;
    protected double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCtps() {
        return numeroCtps;
    }

    public void setNumeroCtps(String numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Funcionario(String nome, String cpf, String numeroCtps, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCtps = numeroCtps;
        this.salario = salario;
    }
    public Funcionario(){}


    public abstract void CalcularSalario();
}
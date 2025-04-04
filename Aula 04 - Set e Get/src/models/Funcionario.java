package models;

public class Funcionario {
    private String nome;
    private double salario;
    private int quantidadeAnos;

    //ENCAPSULAMENTO
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    //-----
    public void setSalario(double salario){
        if(quantidadeAnos >= 1){
            this.salario = salario + (salario * 0.1);
        }
        else{
            this.salario = salario;
        }
    }
    public double getSalario(){
        return salario;
    }

    public void setQuantidadeAnos(int anos){
        this.quantidadeAnos = anos;
        if(quantidadeAnos > 0)
        {
            setSalario(this.salario);
        }
    }
    public int getQuantidadeAnos(){
        return quantidadeAnos;
    }


    //MÉTODOS
    public String exibirFuncionario(){
        return "Nome do funcionario: "+nome+
                "\nSalario do funcionário: R$"+salario +
                "\nAnos na empresa: "+quantidadeAnos;
    }




}

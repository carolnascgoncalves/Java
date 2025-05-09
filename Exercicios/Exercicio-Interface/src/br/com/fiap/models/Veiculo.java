package br.com.fiap.models;

public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    //Encapsulamento
    public double getValorHora(){return valorHora;}
    public void setValorHora(double valorHora){this.valorHora = valorHora;}

    public double getValorAdicional() {return valorAdicional;}
    public void setValorAdicional(double valorAdicional) {this.valorAdicional = valorAdicional;}

    public double getHoras() {return horas;}
    public void setHoras(double horas) {this.horas = horas;}

    //Métodos
    public double doTotal() {
        return valorHora + (valorAdicional * (horas - 1));
    }
    public String doViewCupom() {
        return "O estacionamento foi utilizado por "+horas+"h. \n" +
                "Com o valor/h sendo: R$"+valorHora +"\n"+
                "O total foi de: R$"+doTotal() + "\n";
    }
}

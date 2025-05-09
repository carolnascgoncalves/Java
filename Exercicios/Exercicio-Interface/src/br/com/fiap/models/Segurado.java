package br.com.fiap.models;

import br.com.fiap.interfaces.ISeguroService;

public class Segurado extends Veiculo implements ISeguroService {
    private double seguro;

    //Encasulamento
    public double getSeguro(){return seguro;}
    public void setSeguro(double seguro){this.seguro = seguro;}

    public Segurado(double seguro){
        this.seguro = seguro;
    }
    public double doTotal(){
        return super.doTotal() - doDesconto();
    }
    public String doViewCupom(){
        return super.doViewCupom() + "Pois com o seguro, foi aplicado um desconto de: R$"+doDesconto();
    }
    public double doDesconto(){
        return super.doTotal() * (seguro / 100);
    }
}

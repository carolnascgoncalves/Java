public class Pessoa {
    String nome;
    double altura;
    double peso;

    public double calcularImc()
    {
        return peso / (altura * altura);
    }
    public String exibirClassificacao()
    {
        double imc = calcularImc();

        if(imc <= 18.5) {return "< 18.5 - Abaixo do peso";}
        else if(imc <= 25) {return "< 25 - Peso normal";}
        else if(imc <= 30) {return "< 3 - Acima do peso";}
        else if(imc <= 35) {return "< 35 - Obesidade I";}
        else if(imc <= 40) {return "< 40 - Obesidade II";}
        return ">= 40 - Obesidade III";
    }

    public Pessoa(String nome, double altura, double peso)
    {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
}

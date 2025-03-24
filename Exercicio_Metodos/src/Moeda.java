public class Moeda {
    double valorReal;
    double cotacaoDolar;
    double quantidadeDolar;

    public void calcularConversao()
    {
        quantidadeDolar = valorReal / cotacaoDolar;
        System.out.println("Dólar convertido: "+quantidadeDolar);
    }

    public Moeda(double real, double cotacao)
    {
        this.valorReal = real;
        this.cotacaoDolar = cotacao;
    }
}

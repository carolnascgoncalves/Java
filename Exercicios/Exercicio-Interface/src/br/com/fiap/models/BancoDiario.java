package br.com.fiap.models;

public class BancoDiario {
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo obj){
        qtdeCarros++;
        total += obj.doTotal();
    }
    public String doGerarRelatorio(){
        return "Quantidade de carros: "+qtdeCarros + "\n"+
                "Total: R$"+total+"\n";
    }
}

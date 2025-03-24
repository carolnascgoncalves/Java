public class Funcionario {
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double valorPorHora;


    public String nomeCompleto()
    {
        return nome+" "+sobrenome;
    }

    public double calcularSalario()
    {
        return ((horasTrabalhadas * 5) * valorPorHora) * 4;
    }

}

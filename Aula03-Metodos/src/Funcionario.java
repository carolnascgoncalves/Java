public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public double calcularBonus()
    {
        if(salario > 5000)
        {
            return salario * 0.05;
        }

        return 0;
    }

    public double calcularGratificacao()
    {
        //Comparações com String é feita com .equals ou .equalsIgnoreCase
        //String != variavel, String = Classe com métodos
        if(cargo.equalsIgnoreCase("Vendedor"))
        {
            return salario * 0.05;
        }

        return 500;
    }

    public double calcularIRPF()
    {
        if(salario > 10000){return salario * 0.270;}
        if(salario > 5000){return salario * 0.125;}
        if(salario > 2259){return salario * 0.075;}
        return 0;
    }
    //Ordem operadores lógicas: !, && e ||
}
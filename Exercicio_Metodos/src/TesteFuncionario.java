import java.util.Scanner;

public class TesteFuncionario
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nome, Sobrenome;
        int HorasTrabalhadas;
        double ValorHora;
        System.out.println("Digite o nome do funcionario: ");
        Nome = entrada.nextLine();
        System.out.println("Digite o sobrenome do funcionário: ");
        Sobrenome = entrada.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        HorasTrabalhadas = entrada.nextInt();
        System.out.println("Digite o valor por hora: ");
        ValorHora = entrada.nextDouble();


        Funcionario funcionario = new Funcionario();
        funcionario.nome = Nome;
        funcionario.sobrenome = Sobrenome;
        funcionario.horasTrabalhadas = HorasTrabalhadas;
        funcionario.valorPorHora = ValorHora;

        System.out.println("Nome completo: "+funcionario.nomeCompleto());
        System.out.println("Salario: R$"+funcionario.calcularSalario());
    }
}
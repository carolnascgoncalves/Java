package tests;

import models.Funcionario;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        double salario = input.nextDouble();
        System.out.println("Digita a quantidade de anos que o funcionario está na empresa");
        int anos = input.nextInt();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        funcionario.setQuantidadeAnos(anos);

        System.out.println(funcionario.exibirFuncionario());
    }
}

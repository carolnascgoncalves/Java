package br.com.fiap.tests;

import br.com.fiap.models.Academia;
import br.com.fiap.models.Aluno;
import br.com.fiap.models.Instrutor;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class AcademiaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;

        Academia academia = new Academia();

        do{
            System.out.println("=== MENU ACADEMIA === \n" +
                    "1 - Cadastrar Aluno \n" + //:)
                    "2 - Cadastrar Instrutor \n" + //:)
                    "3 - Cadastrar Modalidade \n" +
                    "4 - Matricular aluno em Modalidade \n" +
                    "5 - Relatório: Listar Modalidades \n" + //:)
                    "6 - Relatório: Listar Instrutores \n" + //:)
                    "7 - Relatório: Listar Alunos \n" + //:)
                    "8 - Relatório: Modalidade com mais alunos \n" + //:)
                    "9 - Listar Alunos de uma Modalidade \n" +
                    "0 - Sair \n"); //:)
            op = input.nextInt();

            switch(op){
                case 1:
                    input.nextLine();

                    System.out.println("Digite o nome do aluno: ");
                    String nomeAluno = input.nextLine();
                    System.out.println("Digite a idade do aluno: ");
                    int idadeAluno = input.nextInt();
                    System.out.println("Digite a matricula do aluno: ");
                    String matriculaAluno = input.next();

                    Aluno aluno = new Aluno(nomeAluno, idadeAluno, matriculaAluno);

                    academia.cadastrarAluno(aluno);
                    break;

                case 2:
                    input.nextLine();

                    System.out.println("Digite o nome do instrutor: ");
                    String nomeInstrutor = input.nextLine();
                    System.out.println("Digite a idade do instrutor: ");
                    String especialidadeInstrutor = input.nextLine();
                    System.out.println("Digite o registro profissional do instrutor: ");
                    String registroProfInstrutor = input.nextLine();

                    Instrutor instrutor = new Instrutor(nomeInstrutor, especialidadeInstrutor, registroProfInstrutor);

                    academia.cadastrarInstrutor(instrutor);
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    academia.listarModalidades();
                    break;

                case 6:
                    academia.listarInstrutores();
                    break;

                case 7:
                    academia.listarAlunos();
                    break;

                case 8:
                    academia.relatorioModalidadeComMaisAlunos();
                    break;

                case 9:
                    break;

                case 0:
                    System.out.println("Finalizando");
                    break;
            }
        }while(op != 0);
    }
}

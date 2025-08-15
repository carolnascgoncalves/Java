package br.com.fiap.tests;
import br.com.fiap.enums.TipoEnum;
import br.com.fiap.models.*;

import java.io.IOException;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "D:\\Java\\Exercicios\\Exercicio-Arquivo\\Agenda.txt";
        int op;

        try{
            do{
                System.out.println("===== MENU =====\n" +
                        "1- Adicionar cliente\n" +
                        "2- Ler agenda\n" +
                        "3- Listar clientes VIP\n" +
                        "4- Listar clientes PREMIUM\n" +
                        "0- Sair\n");
                op = input.nextInt();

                switch (op){
                    case 1:
                        input.nextLine();

                        System.out.println("Digite o nome do cliente: ");
                        String nomeCliente = input.nextLine();

                        System.out.println("Digite o celular do cliente: ");
                        String celularCliente = input.nextLine();

                        System.out.println("Digite o email do cliente: ");
                        String emailCliente = input.nextLine();

                        System.out.println("Digite o instagram do cliente: ");
                        String instagramCliente = input.nextLine();

                        System.out.println("Digite o endereco do cliente: ");
                        String enderecoCliente = input.nextLine();

                        System.out.println("Qual o tipo do cliente\n" +
                                "1- Comum\n" +
                                "2- VIP\n" +
                                "3- Premium");
                        int opCliente = input.nextInt();
                        TipoEnum tipoCliente;

                        if(opCliente == 1){tipoCliente = TipoEnum.COMUM;}
                        else if(opCliente == 2){tipoCliente = TipoEnum.VIP;}
                        else{tipoCliente = TipoEnum.PREMIUM;}

                        Cliente cliente = new Cliente(nomeCliente, celularCliente, emailCliente, instagramCliente, tipoCliente, enderecoCliente);

                        ManipularAgenda.escrever(path, cliente);
                        break;

                    case 2:
                        ManipularAgenda.lerArquivo(path);
                        break;

                    case 3:
                        ManipularAgenda.lerClienteVip(path);
                        break;

                    case 4:
                        ManipularAgenda.lerClientePremium(path);
                        break;

                    case 0:
                        System.out.println("Saindo..");
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;

                }
            }while(op != 0);
        }catch(IOException e){
            System.out.println("Erro no arquivo");
        }
    }
}

package br.com.fiap.tests;

import br.com.fiap.enums.TipoCapaEnum;
import br.com.fiap.models.Editora;
import br.com.fiap.models.Livro;

import java.util.Scanner;

public class  TesteLivro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        Editora novatec = new Editora("NovaTec"); /*Dessa forma consegue acessar o private nome*/
        /*novatec.nome = "Nova Tec";*/
        novatec.setSite("www.novatec.com");
        novatec.setTelefone("1157292232");

        Livro meuLivro = new Livro(novatec);
        meuLivro.setTitulo("UML 2");
        meuLivro.setAutor("Gilleanes Guedes");
        meuLivro.setPreco(50);
        meuLivro.setPaginas(484);
        meuLivro.setResumo("UML abordagem prática");

        meuLivro.exibirLivro();

        //--------------------------

        Livro livro = new Livro(novatec);
        System.out.println("Digite o nome do livro: ");
        livro.setTitulo(entrada.nextLine());

        System.out.println("Tipo de capa: \n" +
                "1- Comum \n" +
                "2- Dura \n" +
                "3- Personalizada \n\n" +
                "Escolha o tipo de capa desejada: ");
        int opcao = leitorNumerico.nextInt();

        if(opcao == 1)
            livro.setTipoCapa(TipoCapaEnum.COMUM);
        else if(opcao == 2)
            livro.setTipoCapa(TipoCapaEnum.DURA);
        else
            livro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        System.out.println("Capa: "+livro.getTipoCapa());
    }
}

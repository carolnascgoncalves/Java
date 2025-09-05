package br.com.fiap.tests;

import br.com.fiap.dao.FilmeDao;
import br.com.fiap.enums.ClassificacaoIndicativaEnum;
import br.com.fiap.enums.GeneroEnum;
import br.com.fiap.models.Filme;

import java.util.Scanner;

public class TesteFilme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Filme filme = new Filme();
        FilmeDao filmeDao = new FilmeDao();
        int op;

        do{
            System.out.println("=== MENU === \n" +
                    "1 - Cadastrar \n" +
                    "2 - Alterar \n" +
                    "3 - Excluir \n" +
                    "4 - Listar \n" +
                    "5 - Buscar filme pelo ID \n" +
                    "6 - Buscar filmes por CATEGORIA \n" +
                    "7 - Buscar filmes por GÊNERO \n" +
                    "0 - Sair");
            op = input.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o ID do filme: ");
                    long id_filme = input.nextLong();
                    filme.setId(id_filme);

                    System.out.println("Digite o NOME do filme: ");
                    String nome_filme = inputString.nextLine();
                    filme.setNome(nome_filme);

                    System.out.println("Digite o DURAÇÃO do filme: ");
                    int duracao_filme = input.nextInt();
                    filme.setDuracao(duracao_filme);

                    System.out.println("Digite o Gênero do filme: \n" +
                            "1- ACAO \n" +
                            "2- AVENTURA \n" +
                            "3- COMEDIA \n" +
                            "4- DRAMA \n" +
                            "5- FICCAO_CIENTIFICA \n" +
                            "6- TERROR \n" +
                            "7- SUSPENSE \n" +
                            "8- ROMANCE \n" +
                            "9- FANTASIA \n" +
                            "10- GUERRA \n" +
                            "11- FAROESTE \n" +
                            "12- ANIMACAO \n" +
                            "13- MUSICAL \n" +
                            "14- POLICIAL \n" +
                            "15- DOCUMENTARIO\n" +
                            "Escolha: ");

                    //Todo item do ENUM tem um índice -> o primeiro item tem indice 0
                    //Int -> Genero
                    GeneroEnum genero_filme = GeneroEnum.values()[input.nextInt() - 1];
                    filme.setGenero(genero_filme);

                    System.out.println("CLASSIFICACAO: LIVRE, A10, A12, A13, A16, A18: ");
                    String classificacao_filme = input.next();
                    //Precisa digitar exatamente o TEXTO
                    //String -> Genero
                    filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(classificacao_filme));

                    System.out.println("Digite o ANO do filme: ");
                    int ano_filme = input.nextInt();
                    filme.setAno(ano_filme);

                    System.out.println("Digite o CAPA do filme: ");
                    String capa_filme = inputString.nextLine();
                    filme.setCapa(capa_filme);

                    System.out.println("Digite o DIRETOR do filme: ");
                    String diretor_filme = inputString.nextLine();
                    filme.setDiretor(diretor_filme);

                    System.out.println("Digite o ELENCO do filme: ");
                    String elenco_filme = inputString.nextLine();
                    filme.setElenco(elenco_filme);

                    System.out.println("Digite o DESCRICAO do filme: ");
                    String desc_filme = inputString.nextLine();
                    filme.setDescricao(desc_filme);

                    System.out.println("Digite o AVALIACAO do filme: ");
                    double aval_filme = input.nextDouble();
                    filme.setAvaliacao(aval_filme);

                    filmeDao.cadastrarFilme(filme);
                    break;

                case 2:
                    System.out.println("Digite o ID do filme: ");
                    long novo_id = input.nextLong();
                    filme.setId(novo_id);

                    System.out.println("Digite o NOVO NOME do filme: ");
                    String novo_nome = inputString.nextLine();
                    filme.setNome(novo_nome);

                    System.out.println("Digite o NOVO DURAÇÃO do filme: ");
                    int novo_durac = input.nextInt();
                    filme.setDuracao(novo_durac);

                    System.out.println("Digite o NOVO Gênero do filme: \n" +
                            "1- ACAO \n" +
                            "2- AVENTURA \n" +
                            "3- COMEDIA \n" +
                            "4- DRAMA \n" +
                            "5- FICCAO_CIENTIFICA \n" +
                            "6- TERROR \n" +
                            "7- SUSPENSE \n" +
                            "8- ROMANCE \n" +
                            "9- FANTASIA \n" +
                            "10- GUERRA \n" +
                            "11- FAROESTE \n" +
                            "12- ANIMACAO \n" +
                            "13- MUSICAL \n" +
                            "14- POLICIAL \n" +
                            "15- DOCUMENTARIO\n" +
                            "Escolha: ");

                    //Todo item do ENUM tem um índice -> o primeiro item tem indice 0
                    //Int -> Genero
                    GeneroEnum novo_genero = GeneroEnum.values()[input.nextInt() - 1];
                    filme.setGenero(novo_genero);

                    System.out.println("DIGITE A NOVA CLASSIFICACAO: LIVRE, A10, A12, A13, A16, A18: ");
                    String novo_class = input.next();
                    //Precisa digitar exatamente o TEXTO
                    //String -> Genero
                    filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(novo_class));

                    System.out.println("Digite o NOVO ANO do filme: ");
                    int novo_ano = input.nextInt();
                    filme.setAno(novo_ano);

                    System.out.println("Digite o NOVO CAPA do filme: ");
                    String novo_capa = inputString.nextLine();
                    filme.setCapa(novo_capa);

                    System.out.println("Digite o NOVO DIRETOR do filme: ");
                    String novo_diretor = inputString.nextLine();
                    filme.setDiretor(novo_diretor);

                    System.out.println("Digite o NOVO ELENCO do filme: ");
                    String novo_elenco = inputString.nextLine();
                    filme.setElenco(novo_elenco);

                    System.out.println("Digite o NOVO DESCRICAO do filme: ");
                    String novo_desc = inputString.nextLine();
                    filme.setDescricao(novo_desc);

                    System.out.println("Digite o NOVO AVALIACAO do filme: ");
                    double novo_aval = input.nextDouble();
                    filme.setAvaliacao(novo_aval);

                    filmeDao.alterarFilme(filme);
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println(filmeDao.listar());
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }while(op != 0);
    }
}

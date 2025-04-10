//Aluna Carolina Nascimento Gonçalves rm564786
//Aluno Erick Takeshi Andrade Nakajune rm566059

import java.util.Scanner;

public class CP1_TesteAnime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do anime: ");
        String nomeAnime = input.nextLine();

        System.out.println("Digite o autor do anime: ");
        String autor = input.nextLine();

        System.out.println("Digite o gênero do anime: ");
        String genero = input.nextLine();

        System.out.println("Digite a classificação indicativa 10, 12, 14, 16, 18, para " +
                "classificação livre digite 0");
        int classificacaoIndicativa = input.nextInt();

        System.out.println("Digite a quantidade de episódios: ");
        int episodios = input.nextInt();

        System.out.println("Digite o número de temporadas: ");
        int temporadas = input.nextInt();

        CP1_Anime anime = new CP1_Anime(nomeAnime, classificacaoIndicativa, autor, genero, episodios, temporadas);
        anime.exibirDadosAnime();

        System.out.println(anime.mensagem);
    }
}

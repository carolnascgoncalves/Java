public class CP1_Anime {
    String nome;
    int classificacaoIndicativa;
    String genero;
    String autor;
    int qtdEpisodios;
    int numeroTemporadas;
    String mensagem;

    //---------------------------
    public CP1_Anime(String nome, int classificacao, String autor, String genero,
                 int episodios, int temporadas)
    {
        this.nome = nome;
        this.classificacaoIndicativa = classificacao;
        this.autor = autor;
        this.genero = genero;
        this.qtdEpisodios = episodios;
        this.numeroTemporadas = temporadas;
    }
    //---------------------------

    public int mediaEpisodiosPorTemporada()
    {
        return qtdEpisodios / numeroTemporadas;
    }

    public String exibirClassificacao()
    {
        if(classificacaoIndicativa == 18) {return "NÃO É RECOMENDADO PARA " +
                "MENORES DE 18 ANOS";}
        else if(classificacaoIndicativa == 16) {return "NÃO É RECOMENDADO PARA " +
                "MENORES DE 16 ANOS";}
        else if(classificacaoIndicativa == 14) {return "NÃO É RECOMENDADO PARA " +
                "MENORES DE 14 ANOS";}
        else if(classificacaoIndicativa == 12) {return "NÃO É RECOMENDADO PARA " +
                "MENORES DE 12 ANOS";}
        else if(classificacaoIndicativa == 10) {return "NÃO É RECOMENDADO PARA " +
                "MENORES DE 10 ANOS";}

        return "LIVRE PARA TODOS OS PÚBLICOS";
    }

    public void exibirDadosAnime()
    {
        mensagem = "Nome do anime: "+nome+ "\n"+
                "De acordo com o ministério da justiça esse anime é "+exibirClassificacao()+"\n"+
                "A média de episódios por temporada é "+mediaEpisodiosPorTemporada();
    }

}

package br.com.fiap.models;

import java.util.List;

public class Serie extends Titulo{
    private int numeroTemporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    private List<Temporada> temporadas;

    public Serie(int numTemp, boolean ativa, int epTemp, int minEp, List<Temporada> temporadas) {
        this.numeroTemporada = numTemp;
        this.ativa = ativa;
        this.episodiosPorTemporada = epTemp;
        this.minutosPorEpisodio = minEp;
        this.temporadas = temporadas;
    }

//    @Override
//    public String toString() {
//        return "Temporadas{" +
//                "Número da temporada=" + numeroTemporada +
//                ", episodios=" + episodiosPorTemporada +
//                "}";
//    }
//
    public void exibirFichaTecnica() {
        System.out.println("====== Ficha tecnica ======");
        super.exibirFichaTecnica();
        System.out.println("Número de temporadas: " + numeroTemporada);
        System.out.println("Ativa: " + ativa);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos: " + minutosPorEpisodio);
    }
}

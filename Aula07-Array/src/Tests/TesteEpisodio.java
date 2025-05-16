package Tests;

import models.Episodio;
import models.Serie;
import models.Temporada;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TesteEpisodio {
    public static void main(String[] args) {
        Episodio episodio1 = new Episodio(1, "ep", 8.5, 120);
        Episodio episodio2 = new Episodio(1, "ep 2", 7.3, 110);
        Episodio episodio3 = new Episodio(1, " ep 3", 9, 135);
        Episodio episodio4 = new Episodio(1, "ep 4", 10, 250);
        Episodio episodio5 = new Episodio(1, "ep 5", 8.2, 200);
        Episodio episodio6 = new Episodio(1, "ep 6", 9.1, 180);
        Episodio episodio7 = new Episodio(1, "ep 7", 8.5, 200);

        var temporada1 = new Temporada(1, List.of(episodio1, episodio2, episodio3));
        var temporada2 = new Temporada(2, List.of(episodio4, episodio5, episodio6, episodio7));

        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(temporada1);
        temporadas.add(temporada2);

        Serie serie = new Serie("Lucifer", 1, true, 10, 45,
                temporadas);

        //Usando for Each
//        for(var temporada: temporadas){
//            System.out.println("Numero da temporada: " + temporada.getNumeroTemporada());
//            for(var episodio: temporada.getEpisodios()){
//                System.out.println("Episodio: " + episodio.getNome());
//            }
//        }

//        temporadas.forEach(System.out::println);
        temporadas.forEach(x ->
        {
            System.out.println("\nTemporada "+x.getNumeroTemporada());
            x.getEpisodios().forEach(y -> System.out.println("Nome: "+y.getNome()));
        });
    }
}

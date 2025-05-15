package Listas;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void exibirListaFor(ArrayList<String> nomes){
        for(String nome : nomes){
            System.out.println("Nome: " + nome);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Carolina");
        nomes.add("Bob");
        nomes.add("Daniela");
        nomes.add("Jonas");

        exibirListaFor(nomes);
    }
}

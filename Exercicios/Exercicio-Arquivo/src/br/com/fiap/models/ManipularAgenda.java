package br.com.fiap.models;

import java.io.*;
import java.util.Scanner;

public class ManipularAgenda {
    public static void escrever(String caminho, Cliente cliente) throws IOException {
        BufferedWriter arquivo = new BufferedWriter(new FileWriter(caminho, true));

        arquivo.append(cliente+"\n");
        arquivo.close();
    }

    public static void lerArquivo(String caminho) throws IOException {
        BufferedReader leitura = new BufferedReader(new FileReader(caminho));

        String linha = "";

        while (linha != null) {
            System.out.println(linha);

            linha = leitura.readLine();
        }
    }

    public static void lerClienteVip(String caminho) throws IOException {
        BufferedReader leitura = new BufferedReader(new FileReader(caminho));
        String linha = "";

    }

}




























}

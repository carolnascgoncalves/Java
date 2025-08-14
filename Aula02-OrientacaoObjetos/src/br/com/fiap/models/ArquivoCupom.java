package br.com.fiap.models;

import java.io.*;
import java.util.Scanner;

public class ArquivoCupom {
    public static void leitor(String path) throws IOException {
        //Para ler o arquivo
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String linha = "";
        while(true){
            if(linha != null){
                System.out.println(linha);
            }else{
                break;
            }
            linha = reader.readLine();
        }
    }

    public static void escrita(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        Scanner input = new Scanner(System.in);

        String linha;
        System.out.println("Escreva algo: ");
        linha = input.nextLine();

        writer.append(linha + "\n");
        writer.close();
    }
}

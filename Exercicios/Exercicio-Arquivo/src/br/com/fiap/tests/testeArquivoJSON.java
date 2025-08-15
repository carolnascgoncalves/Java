package br.com.fiap.tests;


import br.com.fiap.enums.TipoEnum;
import br.com.fiap.models.Cliente;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testeArquivoJSON {
    public static void leituraJson(){
        Gson gson = new Gson();

        try(FileReader reader = new FileReader("cliente.json")){
            Cliente cliente = gson.fromJson(reader, Cliente.class);
            System.out.println(cliente);
        }catch(IOException e){
            System.out.println("Ocorreu um erro ao ler o arquivo 'cliente.json'");
        }
    }

    public static void escritaJson(){

    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carolina Nasc","119454141013", "carol@gmail", "besclo", TipoEnum.PREMIUM, "Rua vieira 624124");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter writer = new FileWriter("cliente.json")){
            gson.toJson(cliente, writer);
            System.out.println("Arquivo cliente.json escrito com sucesso");
        }catch(IOException e){
            System.out.println("Erro ao escrever o arquivo cliente");
        }
        testeArquivoJSON.leituraJson();
    }

}


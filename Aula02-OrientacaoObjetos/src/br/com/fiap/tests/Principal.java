package br.com.fiap.tests;

import br.com.fiap.enums.TipoCapaEnum;
import br.com.fiap.models.*;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        String path = "C:\\Users\\Carolina\\Desktop\\FIAP\\DDD_1TDSPJ\\ddd-livraria\\cupom.txt";

        try{
            ArquivoCupom.escrita(path);
            ArquivoCupom.leitor(path);

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

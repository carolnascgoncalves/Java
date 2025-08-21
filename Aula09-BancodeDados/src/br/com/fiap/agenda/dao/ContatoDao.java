package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDao {
    private Connection conexao;

    public void cadastrarContato(Contato contato){
        //estabelecer a conexão
        conexao = ConnectionFactory.obterConexao();

        //Classe que faz os comandos (que faz as estruturas, que nem o insert)
        PreparedStatement comandoSQL = null;

        try{
            String sql = "insert into tbl_contato (id_contato, nome_contato, celular_contato, email_contato, instagram, tipo) \n" +
                    "values (?, '?', '?', '?', '?', '?');";
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

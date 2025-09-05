package br.com.fiap.dao;

import br.com.fiap.enums.ClassificacaoIndicativaEnum;
import br.com.fiap.enums.GeneroEnum;
import br.com.fiap.models.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {
    private Connection conexao;

    public void cadastrarFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;

        try{
            String sql = "insert into tbl_filme (id_filme, tx_nome, nr_duracao, tp_genero, tp_classificacao, nr_ano, tx_capa, tx_diretor, " +
                    "tx_elenco, tx_descricao, nr_avaliacao) values(?,?,?,?,?,?,?,?,?,?,?)";

            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setLong(1, filme.getId());
            comandoSQL.setString(2, filme.getNome());
            comandoSQL.setInt(3, filme.getDuracao());
            comandoSQL.setString(4, filme.getGenero().toString());
            comandoSQL.setString(5, filme.getClassificacao().toString());
            comandoSQL.setInt(6, filme.getAno());
            comandoSQL.setString(7, filme.getCapa());
            comandoSQL.setString(8, filme.getDiretor());
            comandoSQL.setString(9, filme.getElenco());
            comandoSQL.setString(10, filme.getDescricao());
            comandoSQL.setDouble(11, filme.getAvaliacao());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Filme buscaPorId(Long id){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        Filme filme = new Filme();
        try{
            comandoSQL = conexao.prepareStatement("SELECT * from TBL_FILME where ID_FILME = ?");

            comandoSQL.setLong(1, id);
            ResultSet rs = comandoSQL.executeQuery();

            if(rs.next()){
                filme.setId(rs.getLong(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getInt(3));
                filme.setGenero(GeneroEnum.valueOf(rs.getString(4)));
                filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(rs.getString(5)));
                filme.setAno(rs.getInt(6));
                filme.setCapa(rs.getString(7));
                filme.setDiretor(rs.getString(8));
                filme.setElenco(rs.getString(9));
                filme.setDescricao(rs.getString(10));
                filme.setAvaliacao(rs.getDouble(11));
            }

            comandoSQL.close();
            conexao.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }

        return filme;
    }

    public List<Filme> listar(){
        List<Filme> filmes = new ArrayList<>();

        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            comandoSQL = conexao.prepareStatement("SELECT * FROM TBL_FILME");
            //recebe a tabela
            ResultSet  rs = comandoSQL.executeQuery();

            while(rs.next()){
                Filme filme = new Filme();
                filme.setId(rs.getLong(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getInt(3));
                filme.setGenero(GeneroEnum.valueOf(rs.getString(4)));
                filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(rs.getString(5)));
                filme.setAno(rs.getInt(6));
                filme.setCapa(rs.getString(7));
                filme.setDiretor(rs.getString(8));
                filme.setElenco(rs.getString(9));
                filme.setDescricao(rs.getString(10));
                filme.setAvaliacao(rs.getDouble(11));

                filmes.add(filme);
            }
            comandoSQL.close();
            conexao.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filmes;
    }

    public void alterarFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;

        try{
            String sql = "UPDATE tbl_filme SET id_filme = ?, tx_nome = ?, nr_duracao = ?, tp_genero = ?, tp_classificacao = ?, nr_ano = ?, tx_capa = ?, tx_diretor = ?, tx_elenco = ?, tx_descricao = ?, nr_avaliacao = ?";

            comandoSQL = conexao.prepareStatement(sql);

            comandoSQL.setLong(1, filme.getId());
            comandoSQL.setString(2, filme.getNome());
            comandoSQL.setInt(3, filme.getDuracao());
            comandoSQL.setString(4, filme.getGenero().toString());
            comandoSQL.setString(5, filme.getClassificacao().toString());
            comandoSQL.setInt(6, filme.getAno());
            comandoSQL.setString(7, filme.getCapa());
            comandoSQL.setString(8, filme.getDiretor());
            comandoSQL.setString(9, filme.getElenco());
            comandoSQL.setString(10, filme.getDescricao());
            comandoSQL.setDouble(11, filme.getAvaliacao());

            conexao.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void excluirFilme(int id){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;

        try{
            comandoSQL = conexao.prepareStatement("delete from tbl_filme where id_filme = ?");

            comandoSQL.setInt(1,id);
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        }catch(SQLException e ){
            e.printStackTrace();
        }
    }

    public List<Filme> buscarPorCategoria(String categoria){
        List<Filme> filmes = new ArrayList<>();

        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            comandoSQL = conexao.prepareStatement("SELECT * FROM TBL_FILME WHERE TP_CATEGORIA = ?");

            comandoSQL.setString(1, categoria);
            ResultSet rs = comandoSQL.executeQuery();
            while(rs.next()){
                Filme filme = new Filme();

                filme.setId(rs.getLong(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getInt(3));
                filme.setGenero(GeneroEnum.valueOf(rs.getString(4)));
                filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(rs.getString(5)));
                filme.setAno(rs.getInt(6));
                filme.setCapa(rs.getString(7));
                filme.setDiretor(rs.getString(8));
                filme.setElenco(rs.getString(9));
                filme.setDescricao(rs.getString(10));
                filme.setAvaliacao(rs.getDouble(11));

                filmes.add(filme);
            }

            conexao.close();
            comandoSQL.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return filmes;
    }

    public List<Filme> buscarPorGenero(String genero){
        List<Filme> filmes = new ArrayList<>();

        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            comandoSQL = conexao.prepareStatement("SELECT * FROM TBL_FILME WHERE TP_GENERO = ?");

            comandoSQL.setString(1, genero);
            ResultSet rs = comandoSQL.executeQuery();
            while(rs.next()){
                Filme filme = new Filme();

                filme.setId(rs.getLong(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getInt(3));
                filme.setGenero(GeneroEnum.valueOf(rs.getString(4)));
                filme.setClassificacao(ClassificacaoIndicativaEnum.valueOf(rs.getString(5)));
                filme.setAno(rs.getInt(6));
                filme.setCapa(rs.getString(7));
                filme.setDiretor(rs.getString(8));
                filme.setElenco(rs.getString(9));
                filme.setDescricao(rs.getString(10));
                filme.setAvaliacao(rs.getDouble(11));

                filmes.add(filme);
            }

            conexao.close();
            comandoSQL.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return filmes;
    }
}

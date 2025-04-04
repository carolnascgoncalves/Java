package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa; //COMUM, DURA

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    public String getAutor()
    {
        return autor;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }


    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }


    public Editora getEditora(){
        return editora;
    }
    public void setEditora(Editora editora){
        this.editora = editora;
    }


    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }


    public String getResumo(){
        return resumo;
    }
    public void setResumo(String resumo){
        this.resumo = resumo;
    }


    public TipoCapaEnum getTipoCapa(){
        return tipoCapa;
    }
    public void setTipoCapa(TipoCapaEnum tipoCapa){
        this.tipoCapa = tipoCapa;
    }


    //CONSTRUTORES

    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }
    public Livro(Editora editora)
    {
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM; //A capa por padrão vai ser comum
        //só muda se ela for especificada na hora da criação

    }



    //MÉTODOS

    public void exibirLivro()
    {
        System.out.println("br.com.fiap.models.Livro: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("br.com.fiap.models.Editora: "+ editora.getNome());
        System.out.println("Preço: "+ preco);
        System.out.println("Tipo de capa: "+tipoCapa);
        System.out.println("----------------------------\n");
    }
}

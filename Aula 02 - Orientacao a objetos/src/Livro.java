public class Livro {
    String titulo;
    String autor;
    double preco;
    Editora editora;
    int paginas;
    String resumo;
    TipoCapaEnum tipoCapa; //COMUM, DURA


    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }
    public Livro(Editora editora)
    {
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM; //A capa por padrão vai ser comum
        //só muda se ela for especificada na hora da criação

    }


    public void exibirLivro()
    {
        System.out.println("Livro: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Editora: "+ editora.nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Tipo de capa: "+tipoCapa);
        System.out.println("----------------------------\n");
    }
}

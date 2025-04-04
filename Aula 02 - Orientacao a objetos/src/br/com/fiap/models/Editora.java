package br.com.fiap.models;

public class Editora {
    private String nome; /*Só a classe que criou tem acesso, tendo que criar métodos de acesso*/
    private String site;
    private String telefone;

    //Métodos getters e setters
    public String getNome(){ //Get é para >saida<, mostra o dado
        return nome;
    }
    public void setNome(String nome) { //Set é para >entrada<, pede o dado
        this.nome = nome;
    }


    public String getSite(){
        return site;
    }
    public void setSite(String nome) {
        this.site = site;
    }


    public String getTelefone(){
        return nome;
    }
    public void setTelefone(String nome) {
        this.telefone = telefone;
    }



    public Editora(){}
    public Editora(String nome){
        this.nome = nome;
    }

    public void exibirEditora(){
        System.out.println("br.com.fiap.models.Editora " + nome);
        System.out.println("Site: " + site);
        System.out.println("Telefone: " + telefone);
    }
}

package br.com.fiap.agenda.models;

public class Contato {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String instagram;
    private String tipo;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getInstagram() {return instagram;}
    public void setInstagram(String instagram) {this.instagram = instagram;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    @Override
    public String toString() {
        return "\nContato: " + id +
                "\nNome:" + nome +
                "\nCelular: " + telefone +
                "\nEmail: " + email +
                "\nInstagram: " + instagram  +
                "\nTipo do Contato: " + tipo +
                "\n===================================";
    }
}

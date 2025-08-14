package br.com.fiap.models;

import br.com.fiap.enums.TipoEnum;
import java.util.Random;

public class Cliente {
    private int codigo;
    private String nome;
    private String celular;
    private String email;
    private String instagram;
    private TipoEnum tipo;
    private String endereco;

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getInstagram() {return instagram;}
    public void setInstagram(String instagram) {this.instagram = instagram;}

    public TipoEnum getTipo() {return tipo;}
    public void setTipo(TipoEnum tipo) {this.tipo = tipo;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public Cliente(String nome, String celular, String email, String instagram, TipoEnum tipoCliente, String endereco){
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.instagram = instagram;
        this.tipo = tipoCliente;
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return nome + " - "+codigo+" - "+tipo+
                "\nCel: "+celular+" | email: "+email+" | instagram: "+instagram+"\n"+
                "Endereço: "+endereco + "\n";
    }
}//Carolina nascimento - 123123123 - VIP
//cel: 1194512312 | email: carol@gmail.com | instagram: besclo
//Endereço: wadawdadw

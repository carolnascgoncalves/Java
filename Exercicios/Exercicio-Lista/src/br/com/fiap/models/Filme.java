package br.com.fiap.models;

public class Filme extends  Titulo{
    private String diretor;

    public String getDiretor() {return diretor;}
    public void setDiretor(String diretor) {this.diretor = diretor;}

    @Override
    public void somarNotas(double nota) {
        super.somarNotas(nota);
    }
}

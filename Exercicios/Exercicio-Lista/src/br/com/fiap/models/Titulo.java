package br.com.fiap.models;

import br.com.fiap.enums.ClassificacaoEnum;

public abstract class Titulo {
    protected String nome;
    protected int anoDeLancamento;
    protected int duracaoEmMinutos;
    protected double somaAvaliacao;
    protected int totalAvaliacoes;
    protected ClassificacaoEnum classificacaoIndicativa;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getAnoDeLancamento() {return anoDeLancamento;}
    public void setAnoDeLancamento(int anoDeLancamento) {this.anoDeLancamento = anoDeLancamento;}

    public int getDuracaoEmMinutos() {return duracaoEmMinutos;}
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {this.duracaoEmMinutos = duracaoEmMinutos;}

    public double getSomaAvaliacao() {return somaAvaliacao;}
    public void setSomaAvaliacao(double somaAvaliacao) {this.somaAvaliacao = somaAvaliacao;}

    public int getTotalAvaliacoes() {return totalAvaliacoes;}
    public void setTotalAvaliacoes(int totalAvaliacoes) {this.totalAvaliacoes = totalAvaliacoes;}

    public ClassificacaoEnum getClassificacaoIndicativa() {return classificacaoIndicativa;}
    public void setClassificacaoIndicativa(ClassificacaoEnum classificacaoIndicativa) {this.classificacaoIndicativa = classificacaoIndicativa;}

    //Métodos
    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
        System.out.println("Soma Avaliacao: " + somaAvaliacao);
        System.out.println("Total Avaliacoes: " + totalAvaliacoes);
        System.out.println("Classificação Indicativa: " + classificacaoIndicativa);
    }

    public void somarNotas(double nota){}
}

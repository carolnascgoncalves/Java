package br.com.fiap.models;
import java.util.ArrayList;
import java.util.List;

public class Modalidade {
    private String nome;
    private Instrutor instrutor;
    private List<Aluno> listaAlunos = new ArrayList<>();

    //Construtor
    public Modalidade(String nome, Instrutor instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    //Encapsulamento
    public String getNome(){return nome;}
    public Instrutor getInstrutor(){return instrutor;}
    public int getQuantidadeAlunos(){return listaAlunos.size();}

    //Métodos
    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }
    public void listarAlunos(){
        if(listaAlunos.isEmpty()){
            System.out.println("Nenhum aluno matriculado nesta modalidade.");
        }else{
            System.out.println("Alunos matriculados em " + nome+":");
            for(Aluno aluno : listaAlunos){
                System.out.println(" • "+ aluno);
            }
        }
    }

    @Override
    public String toString() {
        return nome+" - Instrutor responsável: "+instrutor+ " | Alunos matriculados: "+getQuantidadeAlunos();
    }
}

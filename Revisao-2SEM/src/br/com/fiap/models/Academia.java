package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Instrutor> instrutores = new ArrayList<>();
    private List<Modalidade> modalidades = new ArrayList<>();


    //Métodos - CADASTROS
    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void cadastrarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
    }
    public void cadastrarModalidade(Modalidade modalidade){
        modalidades.add(modalidade);
    }

    //Métodos - BUSCA
    public Aluno buscarAlunoPorMatricula(String matricula){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula().equalsIgnoreCase(matricula)){
                return aluno;
            }
        }
        return null;
    }
    public Aluno buscarAlunoPorNome(String nome){
        for(Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }
        return null;
    }
    public Modalidade buscarModalidadePorNome(String nome){
        for(Modalidade modalidade : modalidades){
            if(modalidade.getNome().equalsIgnoreCase(nome)){
                return modalidade;
            }
        }
        return null;
    }

    //Métodos - LISTAGEM
    public void listarModalidades(){
        if(modalidades.isEmpty()){
            System.out.println("Nenhuma modalidade registrada");
        }else{
            System.out.println("Modalidades: ");
            for(Modalidade modalidade : modalidades){
                System.out.println(" • " + modalidade);
            }
        }
    }
    public void listarInstrutores(){
        if(instrutores.isEmpty()){
            System.out.println("Nenhum instrutor registrada");
        }else{
            System.out.println("Instrutores: ");
            for(Instrutor instrutor : instrutores){
                System.out.println(" • " + instrutor);
            }
        }
    }
    public void listarAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno registrado");
        }else{
            System.out.println("Alunos: ");
            for(Aluno aluno : alunos){
                System.out.println(" • " + aluno);
            }
        }
    }

    public void relatorioModalidadeComMaisAlunos(){
        if(modalidades.isEmpty()){
            System.out.println("Não há modalidades cadastradas.");
            return;
        }

        Modalidade maisPopular = modalidades.get(0);
        for(Modalidade modalidade : modalidades){
            if(modalidade.getQuantidadeAlunos() > maisPopular.getQuantidadeAlunos()){
                maisPopular = modalidade;
            }
        }

        System.out.println("Modalidade com mais alunos: "+ maisPopular.getNome() + " - "+ maisPopular.getQuantidadeAlunos() + " alunos");
    }
}

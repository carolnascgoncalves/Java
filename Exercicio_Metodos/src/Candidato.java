public class Candidato {
    String nome;
    int idade;
    String escolaridade;

    public String maiorDeIdade()
    {
        String mensagem;

        if(idade >= 18){mensagem = "O candidato é maior de idade";}
        else {mensagem = "O candidato é menor de idade";}

        return mensagem;
    }

    public String verificacaoEscolaridade()
    {
        String mensagem;

        if(escolaridade.equalsIgnoreCase("Ensino medio") ||
                escolaridade.equalsIgnoreCase("Ensino Superior"))
        {
            mensagem = "O estágio só será permitido caso esteja cursando um curso, " +
                    "favor alterar sua escolha.";
        }
        else {mensagem = "Estágio do candidato "+nome+" permitido!!";}

        return mensagem;
    }
}

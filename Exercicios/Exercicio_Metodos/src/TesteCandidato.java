import java.util.Scanner;

public class TesteCandidato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String escolaridade;
        int idade;

        System.out.println("Digite o nome do candidato: ");
        nome = entrada.nextLine();
        System.out.println("Digite a escolaridade do candidato: ");
        escolaridade = entrada.nextLine();
        System.out.println("Digite a idade do candidato: ");
        idade = entrada.nextInt();


        Candidato candidato = new Candidato();
        candidato.nome = nome;
        candidato.escolaridade = escolaridade;
        candidato.idade = idade;

        System.out.println(candidato.maiorDeIdade());
        System.out.println(candidato.verificacaoEscolaridade());

    }
}

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = input.nextLine();
        System.out.println("Digite a altura da pessoa: ");
        double altura = input.nextDouble();
        System.out.println("Digite o peso da pessoa: ");
        double peso = input.nextDouble();

        Pessoa pessoa = new Pessoa(nome, altura, peso);

        System.out.println(pessoa.exibirClassificacao());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        byte idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextByte();

        System.out.println("Bom dia " + nome + "!");
        System.out.println(idade + " anos");

    }
}
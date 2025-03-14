import java.util.Scanner;

public class  TesteLivro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Criar um objeto -> Instanciar
        //Tipo nomeObjeto = new Tipo();

        Livro livro = new Livro();
        System.out.println("Nome do livro: ");
        String nome = entrada.nextLine();
        livro.titulo = nome;

        System.out.println("Preço do livro: ");
        double preco = entrada.nextDouble();
        livro.preco = preco;

        System.out.println("Nome do livro: "+livro.titulo+", Preço do livro: R$"+livro.preco);

    }
}

import java.util.Scanner;

public class ComprarDolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Real, Cotacao;

        System.out.println("Digite a cotação do dólar: ");
        Cotacao = entrada.nextDouble();
        System.out.println("Digite o valor em real a ser convertido: ");
        Real = entrada.nextDouble();

        Moeda moeda = new Moeda(Real, Cotacao);

        moeda.calcularConversao();
    }
}

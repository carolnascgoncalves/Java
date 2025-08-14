import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextByte();

        if(idade > 18){
            System.out.println("Você ja pode votar!");
        } else if(idade >= 16 && idade <= 17){
            System.out.println("Você pode escolher votar!");
        } else{
            System.out.println("Você não pode votar!");
        }
    }
}

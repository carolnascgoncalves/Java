import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {5, 7 ,8, 3, 2};

        try{
            System.out.println("Digite a posição: ");
            int pos = input.nextInt();

            System.out.println("Valor: " + array[pos]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posicao inválida");
        }catch (InputMismatchException e){
            System.out.println("Digite somente números");
        }

    }
}

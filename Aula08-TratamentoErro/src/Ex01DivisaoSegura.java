import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01DivisaoSegura {
    public static int divisao(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            throw new ArithmeticException("Impossivel dividir por 0!");
        }
        return (num1 / num2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = input.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = input.nextInt();

            System.out.println("O resultado da divisão é: " + divisao(num1, num2));
        }catch (ArithmeticException e){
            System.out.println("Impossivel dividir por 0!");
        }catch (InputMismatchException e){
            System.out.println("Digite somente números");
        }

    }
}

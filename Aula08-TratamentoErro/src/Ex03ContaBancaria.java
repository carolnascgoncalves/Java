import java.util.Scanner;
import models.*;
import Exception.*;

public class Ex03ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(2000);

        try{
            System.out.println("Digite o valor a ser sacado");
            double valor = input.nextDouble();

            contaBancaria.sacar(valor);
        }catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente");
        }

    }
}

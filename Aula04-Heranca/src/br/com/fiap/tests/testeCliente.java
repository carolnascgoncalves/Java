package tests;
import br.com.fiap.model.*;

public class testeCliente {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.abrirConta(123,1000);
        contaEspecial.sacarValor(1000);
        System.out.println("Saldo "+contaEspecial.getSaldo());
        System.out.println("Limite utilizado "+contaEspecial.getLimiteConta());
        //OBS: ARRUMAR SACAR SALDO DA CONTA ESPECIAL
        //OBS: ARRUMAR ABRIR CONTA (RANDOM DO NUMERO DA CONTA)

        contaEspecial.setLimiteConta(1000); //COLOCANDO um valor
        System.out.println("Lendo um valor PRIVADO: "+ contaEspecial.getLimiteConta());



    }
}
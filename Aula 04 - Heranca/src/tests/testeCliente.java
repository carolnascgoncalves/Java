package tests;

import models.ContaEspecial;
import models.Cliente;
import models.ContaComum;

public class testeCliente {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial();
        ce.abrirConta(123,1000);
        ce.sacarValor(1000);
        System.out.println("Saldo "+ce.getSaldo());
        System.out.println("Limite utilizado " + ce.getLimiteConta(1000));
        //OBS: ARRUMAR SACAR SALDO DA CONTA ESPECIAL
        //OBS: ARRUMAR ABRIR CONTA (RANDOM DO NUMERO DA CONTA)
    }
}

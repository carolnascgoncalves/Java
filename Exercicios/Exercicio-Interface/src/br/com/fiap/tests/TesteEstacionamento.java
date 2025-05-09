package br.com.fiap.tests;

import br.com.fiap.models.Segurado;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);
        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(0);

        System.out.println(veicSeg.doViewCupom());
    }
}

package br.com.fiap.tests;

import br.com.fiap.models.Administrativo;
import br.com.fiap.models.Funcionario;
import br.com.fiap.models.Professor;

public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor("Carolina", "4323255222",
                "8888888", 2500, 30, 50);

        Administrativo adm = new Administrativo("Fernando",
                "43820149220", "2222222", 4000, 50, 12);

        System.out.println("Nome: "+professor.getNome());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do usuário: ");
        String nome = input.nextLine();

        Usuario usuario = new Usuario(nome);


        int op;
        String continuar;
        do {
            System.out.println("Escolha uma opção: \n" +
                    "1- Alterar Senha \n" +
                    "2- Inativar usuário \n" +
                    "3- Desbloquear usuário \n" +
                    "4- Autenticar usuário \n" +
                    "5- Sair");
            op = input.nextInt();
            switch (op)
            {
                case 1:
                    System.out.println("Digite a nova senha: ");
                    String senhaAlterar = input.next();

                    usuario.alterarSenha(senhaAlterar);
                    System.out.println("Nova senha: "+usuario.senha);
                    break;

                case 2:
                    usuario.inativar();
                    System.out.println("Usuário inativo com sucesso!");

                    System.out.println("Status usuário: "+usuario.status);
                    break;

                case 3:
                    usuario.desbloquear();
                    System.out.println("Usuário desbloqueado com sucesso!");
                    System.out.println("Status usuário: "+usuario.status);
                    break;

                case 4:
                    System.out.println("Digite a senha: ");
                    String senhaAutenticacao = input.next();

                    System.out.println(usuario.autenticar(senhaAutenticacao));
                    break;
            }

            System.out.println("Deseja continuar? (s/n)");
            continuar = input.next();
        }while(op != 5 && continuar.equals("s".toLowerCase()));

    }
}
import java.time.LocalDateTime;

public class Usuario {
    String nome;
    String senha;
    int tentativasAcesso;
    boolean primeiroAcesso;
    StatusUsuarioEnum status;
    LocalDateTime dataInativacao;

    public Usuario(String nome)
    {
        this.nome = nome;

        this.senha = "admin#123";
        this.tentativasAcesso = 0;
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;
    }

    public void alterarSenha(String senhaAlterar)
    {
        if(status == StatusUsuarioEnum.ATIVO)
        {
            senha = senhaAlterar;
            primeiroAcesso = false;
            tentativasAcesso = 0;
        }
    }

    public void inativar()
    {
        primeiroAcesso = false;
        status = StatusUsuarioEnum.INATIVO;
        dataInativacao = LocalDateTime.now();
    }

    public void desbloquear()
    {
        primeiroAcesso = true;
        status = StatusUsuarioEnum.ATIVO;
        tentativasAcesso = 0;

        this.senha = "admin#123";
    }

    public String autenticar(String senhaAutenticacao)
    {
        if(senha.equals(senhaAutenticacao)){return "Acesso liberado";}
        else if(status == StatusUsuarioEnum.BLOQUEADO || status == StatusUsuarioEnum.INATIVO)
        {return "Acesso negado!";}
        else if (tentativasAcesso >= 3) {return "Acesso negado!";}

        tentativasAcesso += 1;
        return "Usuário/senha inválidos";
    }
}

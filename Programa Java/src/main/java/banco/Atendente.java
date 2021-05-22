package banco;

public class Atendente {

    private int codigo;
    private String login;
    private String senha;

    public Atendente() {
    }

    public Atendente(int codigo) {
        this.codigo = codigo;
    }

    public Atendente(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

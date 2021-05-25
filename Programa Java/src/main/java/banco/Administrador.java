package banco;

public class Administrador {

    private int codigo;
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String sobrenome;
    private String cargo;
    private String cpf;

    public Administrador() {

    }

    public Administrador(int codigo) {
        this.codigo = codigo;
    }

    public Administrador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Administrador(int codigo, String login, String senha, String nome, String email, String sobrenome, String cargo, String cpf) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.cpf = cpf;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}

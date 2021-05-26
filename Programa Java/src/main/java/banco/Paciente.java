package banco;

public class Paciente {

    private int codigo;
    private String nome;
    private String endereco;
    private int idade;
    private String areaSaude;

    public Paciente() {

    }

    public Paciente(int codigo) {
        this.codigo = codigo;
    }

    public Paciente(String nome, String endereco, int idade, String areaSaude) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.areaSaude = areaSaude;

    }

    public Paciente(int codigo, String nome, String endereco, int idade, String areaSaude) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.areaSaude = areaSaude;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getAreaSaude() {
        return areaSaude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAreaSaude(String areaSaude) {
        this.areaSaude = areaSaude;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}


package banco;

public class Paciente {

    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String areaSaude;
    
    public Paciente() {
        
    }

    public Paciente(String nome, String sobrenome, int idade, String areaSaude) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.areaSaude = areaSaude;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getAreaSaude(){
        return areaSaude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAreaSaude(String areaSaude){
        this.areaSaude = areaSaude;
    }

}

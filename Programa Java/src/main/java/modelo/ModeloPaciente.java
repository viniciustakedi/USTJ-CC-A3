
package modelo;

public class ModeloPaciente {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Sobrenome
     */
    public String getSobrenome() {
        return Sobrenome;
    }

    /**
     * @param Sobrenome the Sobrenome to set
     */
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the areaSaude
     */
    public boolean isAreaSaude() {
        return areaSaude;
    }

    /**
     * @param areaSaude the areaSaude to set
     */
    public void setAreaSaude(boolean areaSaude) {
        this.areaSaude = areaSaude;
    }
    
    
    private int codigo;
    private String nome;
    private String Sobrenome;
    private int idade;
    private boolean areaSaude;
    
}

package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PacienteDAO {
    
    /**
     * Metodo para inserir cadastro de pacientes.
     * @param paciente 
     */

    public void inserirPacientes(Paciente paciente) {

        String sql = "INSERT INTO tb_usuario(nome, sobrenome, idade, areaSaude) VALUES (?,?,?,?)";


        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, paciente.getNome());
            pst.setString(2, paciente.getSobrenome());
            pst.setInt(3, paciente.getIdade());
            pst.setString(4, paciente.getAreaSaude());

            pst.execute();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
    
    public void visualizarFila(Paciente paciente){
        
    }

}

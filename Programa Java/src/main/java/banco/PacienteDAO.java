package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PacienteDAO {

    /**
     * Metodo para inserir cadastro de pacientes.
     *
     * @param paciente
     */
    public void inserirPacientes(Paciente paciente) {

        String sql = "INSERT INTO tb_paciente(nome, endereco, idade, areaSaude) VALUES (?,?,?,?)";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, paciente.getNome());
            pst.setString(2, paciente.getEndereco());
            pst.setInt(3, paciente.getIdade());
            pst.setString(4, paciente.getAreaSaude());

            pst.execute();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    /**
     * Metodo para deletar o cadastro do paciente.
     *
     * @param paciente
     */
    public void deletarAdministrador(Paciente paciente) {

        String sql = "DELETE FROM tb_paciente WHERE codigo = ? AND idTipoUsuario = 3";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, paciente.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Metodo para atualizar o cadastro do paciente.
     *
     * @param paciente
     */
    public void atualizarAdministrador(Paciente paciente) {
        String sql = "UPDATE tb_paciente SET nome = ?, endereco = ?,"
                + " idade = ?, areaSaude = ?"
                + " WHERE codigo = ? AND idTipoUsuario = 3";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, paciente.getNome());
            pst.setString(2, paciente.getEndereco());
            pst.setInt(3, paciente.getIdade());
            pst.setString(4, paciente.getAreaSaude());
            pst.setInt(5, paciente.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo para consultar os cadastros de pacientes.
     *
     * @param paciente
     */
    public void consultaAdministrador(Paciente paciente) {

        String sql = "SELECT * FROM tb_paciente WHERE codigo = ? and idTipoUsuario = 1";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, paciente.getCodigo());
            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void visualizarFila(Paciente paciente) {

    }

}

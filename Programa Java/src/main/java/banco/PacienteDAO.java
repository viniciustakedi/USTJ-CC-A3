package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDAO {

    /**
     * Metodo para inserir cadastro de pacientes.
     *
     * @param paciente
     */
    public void inserirPacientes(Paciente paciente) {

        String sql = "INSERT INTO tb_paciente(nome, endereco, idade, area_saude) VALUES (?,?,?,?)";

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
    public void deletarPaciente(Paciente paciente) {

        String sql = "DELETE FROM tb_paciente WHERE id_vacinado = ?";

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
    public void atualizarPaciente(Paciente paciente) {
        String sql = "UPDATE tb_paciente SET nome = ?, endereco = ?,"
                + " idade = ?, area_saude = ?"
                + " WHERE id_vacinado = ?";

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
    public void consultaPaciente(Paciente paciente) {

        String sql = "SELECT * FROM tb_paciente WHERE id_vacinado = ?";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, paciente.getCodigo());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                paciente.setNome(rs.getString("nome"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setAreaSaude(rs.getString("area_saude"));

                JOptionPane.showMessageDialog(null, "Nome: " + paciente.getNome()
                        + "\nEndereço: " + paciente.getEndereco()
                        + "\nIdade: " + paciente.getIdade()
                        + "\nArea da saude: " + paciente.getAreaSaude());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean verificaCodigo(Paciente paciente) {

        String sql = "SELECT * FROM tb_paciente WHERE id_vacinado = ?";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, paciente.getCodigo());

            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public void visualizarFila(Paciente paciente) {

    }

}

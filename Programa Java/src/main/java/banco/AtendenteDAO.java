package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtendenteDAO {

    /**
     * Metodo para verificar se o login/senha estao corretos.
     *
     * @param atendente
     * @return true caso exista o login/senha ou false caso nao exista
     */
    public boolean verificaLoginAtendente(Atendente atendente) {

        String sql = "SELECT login = ?, senha = ? FROM tb_usuario WHERE idTipoUsuario = 2";

        ConexaoBD factory = new ConexaoBD();

        try (Connection con = factory.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, atendente.getLogin());
            pst.setString(2, atendente.getSenha());
            boolean resp = false;
            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                resp = true;
                return resp;
            } else {
                return resp;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Metodo para deletar o cadastro do atendente.
     *
     * @param atendente
     */
    public void deletarAtendente(Administrador atendente) {

        String sql = "DELETE FROM tb_usuario WHERE codigo = ? AND idTipoUsuario = 2";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, atendente.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Metodo para atualizar o cadastro do atendente.
     *
     * @param atendente
     */
    public void atualizarAtendente(Atendente atendente) {
        String sql = "UPDATE tb_usuario SET nome = ?, sobrenome = ?,"
                + " email = ?, cargo = ?, login = ?, senha = ?, cpf = ? "
                + " WHERE codigo = ? AND idTipoUsuario = 2";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSobrenome());
            pst.setString(3, atendente.getEmail());
            pst.setString(4, atendente.getCargo());
            pst.setString(5, atendente.getLogin());
            pst.setString(6, atendente.getSenha());
            pst.setString(7, atendente.getCpf());
            pst.setInt(8, atendente.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo para consultar os cadastros de atendentes.
     *
     * @param atendente
     */
    public void consultaAtendente(Atendente atendente) {

        String sql = "SELECT * FROM tb_usuario WHERE codigo = ? and idTipoUsuario = 2";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, atendente.getCodigo());
            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo para inserir cadastro de atendentes.
     *
     * @param atendente
     */
    public void inserirAtendentes(Atendente atendente) {

        String sql = "INSERT INTO tb_usuario(nome, sobrenome, email, cargo, login, senha, cpf) "
                + "VALUES (?,?,?,?,?,?,?)";

        try (Connection con = ConexaoBD.conexao()) {

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSobrenome());
            pst.setString(3, atendente.getEmail());
            pst.setString(4, atendente.getCargo());
            pst.setString(5, atendente.getLogin());
            pst.setString(6, atendente.getSenha());
            pst.setString(7, atendente.getCpf());
            pst.setInt(8, atendente.getCodigo());

            pst.execute();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}

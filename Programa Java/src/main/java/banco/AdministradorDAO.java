package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdministradorDAO {

    /**
     * Metodo para verificar se o login/senha estao corretos.
     *
     * @param administrador
     * @return true caso exista o login/senha ou false caso nao exista
     */
    public boolean verificaLoginADM(Administrador administrador) {

        String sql = "SELECT * FROM tb_usuario WHERE login = ? and senha = ? and id_cargo = 1";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, administrador.getLogin());
            pst.setString(2, administrador.getSenha());
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
     * Metodo para deletar o cadastro do admnistrador.
     *
     * @param administrador
     */
    public void deletarAdministrador(Administrador administrador) {

        String sql = "DELETE FROM tb_usuario WHERE codigo = ? AND idTipoUsuario = 1";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, administrador.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Metodo para atualizar o cadastro do admnistrador.
     *
     * @param administrador
     */
    public void atualizarAdministrador(Administrador administrador) {
        String sql = "UPDATE tb_usuario SET nome = ?, sobrenome = ?,"
                + " email = ?, cargo = ?, login = ?, senha = ?, cpf = ? "
                + " WHERE codigo = ? AND idTipoUsuario = 1";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSobrenome());
            pst.setString(3, administrador.getEmail());
            pst.setString(4, administrador.getCargo());
            pst.setString(5, administrador.getLogin());
            pst.setString(6, administrador.getSenha());
            pst.setString(7, administrador.getCpf());
            pst.setInt(8, administrador.getCodigo());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo para consultar os cadastros de administradores.
     *
     * @param administrador
     */
    public void consultaAdministrador(Administrador administrador) {

        String sql = "SELECT * FROM tb_usuario WHERE codigo = ? and idTipoUsuario = 1";

        try (Connection con = ConexaoBD.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, administrador.getCodigo());
            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo para inserir cadastro de administradores.
     *
     * @param administrador
     */
    public void inserirAdministrador(Administrador administrador) {

        String sql = "INSERT INTO tb_usuario(nome, sobrenome, email, cargo, login, senha, cpf) "
                + "VALUES (?,?,?,?,?,?,?)";

        try (Connection con = ConexaoBD.conexao()) {

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSobrenome());
            pst.setString(3, administrador.getEmail());
            pst.setString(4, administrador.getCargo());
            pst.setString(5, administrador.getLogin());
            pst.setString(6, administrador.getSenha());
            pst.setString(7, administrador.getCpf());
            pst.setInt(8, administrador.getCodigo());

            pst.execute();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

}

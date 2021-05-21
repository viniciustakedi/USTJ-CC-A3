package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AdministradorDAO {

    /**
     * Metodo para verificar se o login/senha estao corretos.
     *
     * @param administrador
     * @return true caso exista o login/senha ou false caso nao exista
     */
    public boolean verificaLoginADM(Administrador administrador) {

        String sql = "SELECT ?, ? FROM tb_ usuario WHERE idTipoUsuario = 1";

        ConexaoBD factory = new ConexaoBD();

        try (Connection con = factory.conexao()) {
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

}

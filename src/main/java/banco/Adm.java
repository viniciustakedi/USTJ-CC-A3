package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Adm {
    
    private String login;
    private String senha;

    public Adm() {

    }

    public Adm(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    /**
     * Metodo para verificar se o login/senha estao corretos.
     *
     * @return true caso exista o login/senha ou false caso nao exista
     */
    public boolean verificaLogin() {

        String sql = "SELECT login, senha FROM tb_ usuario WHERE idTipoUsuario = 2";

        ConexaoBD factory = new ConexaoBD();

        try (Connection con = factory.conexao()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, this.login);
            pst.setString(2, this.senha);
            boolean resp = false;
            //Executar o comando e receber o resultado, armazenando num ResultSet
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso",
                        "Imuniza Facil", JOptionPane.INFORMATION_MESSAGE);
                resp = true;
                return resp;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos",
                        "Imuniza Facil", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Conexao nao realizada",
                    "Imuniza Facil", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
}

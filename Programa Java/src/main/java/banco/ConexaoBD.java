package banco;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    private static String usuario = "root";
    private static String senha = "Nirvana@36";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "projetoimuniza";
    

    public static Connection conexao() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario,senha );
            System.out.println("Conexao ok");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de conexão com banco de dados" + ex);
            ex.printStackTrace();
            return null;
        }
        // desconectar banco na mao//
        
        
    }
}

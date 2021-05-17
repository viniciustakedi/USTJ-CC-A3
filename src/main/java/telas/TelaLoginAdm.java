/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.Adm;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class TelaLoginAdm extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLoginAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        fundoTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextFieldLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(170, 70, 130, 30);
        jPanel1.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(170, 110, 130, 30);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntrar);
        jButtonEntrar.setBounds(150, 150, 70, 23);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(230, 150, 90, 23);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuario.setText("Usuário:");
        jPanel1.add(jLabelUsuario);
        jLabelUsuario.setBounds(120, 80, 50, 20);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setText("Senha: ");
        jPanel1.add(jLabelSenha);
        jLabelSenha.setBounds(120, 110, 50, 20);

        jLabelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\Logotipo_provisório.png")); // NOI18N
        jPanel1.add(jLabelLogo);
        jLabelLogo.setBounds(20, 70, 100, 80);

        fundoTelaLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\fundo_tela_login.jpg")); // NOI18N
        jPanel1.add(fundoTelaLogin);
        fundoTelaLogin.setBounds(0, 0, 400, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // TODO add your handling code here:

        try {
            String login = jTextFieldLogin.getText();
            String senha = String.valueOf(jPasswordFieldSenha.getPassword());

            Adm loginAdm = new Adm(login, senha);

            if (loginAdm.verificaLogin() == true) {
                //Trocar para a tela principal e fechar essa
                TelaPrincipal telaprincipal = new TelaPrincipal();
                telaprincipal.setVisible(true);
                dispose();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoTelaLogin;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}

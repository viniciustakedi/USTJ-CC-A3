/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.ConexaoBD;
import banco.Paciente;
import banco.PacienteDAO;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class TelaCadastroPacient extends javax.swing.JFrame {

    public TelaCadastroPacient() {
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

        jLabel6 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabelSaude = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jComboBoxSimNao = new javax.swing.JComboBox<>();
        FundoTelacadastro = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelCadastro.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelTitulo.setText("CADASTRO");
        jPanelCadastro.add(jLabelTitulo);
        jLabelTitulo.setBounds(240, 0, 170, 30);

        jLabelNome.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelNome.setText("NOME:");
        jPanelCadastro.add(jLabelNome);
        jLabelNome.setBounds(330, 40, 50, 15);

        jLabelEndereco.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelEndereco.setText("ENDEREÇO:");
        jPanelCadastro.add(jLabelEndereco);
        jLabelEndereco.setBounds(300, 80, 90, 15);

        jLabelIdade.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelIdade.setText("IDADE: ");
        jPanelCadastro.add(jLabelIdade);
        jLabelIdade.setBounds(320, 110, 50, 20);
        jPanelCadastro.add(jTextFieldNome);
        jTextFieldNome.setBounds(380, 30, 200, 30);
        jPanelCadastro.add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(380, 70, 200, 30);
        jPanelCadastro.add(jTextFieldIdade);
        jTextFieldIdade.setBounds(380, 110, 80, 30);

        jLabelSaude.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelSaude.setText("AREA DA SAÚDE:");
        jPanelCadastro.add(jLabelSaude);
        jLabelSaude.setBounds(260, 140, 110, 40);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonSalvar);
        jButtonSalvar.setBounds(20, 40, 70, 23);

        jButtonExcluir.setText("Excuir");
        jPanelCadastro.add(jButtonExcluir);
        jButtonExcluir.setBounds(20, 160, 70, 23);

        jButtonEditar.setText("Editar");
        jPanelCadastro.add(jButtonEditar);
        jButtonEditar.setBounds(20, 120, 70, 23);

        jButtonBuscar.setText("Buscar");
        jPanelCadastro.add(jButtonBuscar);
        jButtonBuscar.setBounds(20, 80, 70, 23);

        jComboBoxSimNao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        jComboBoxSimNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSimNaoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jComboBoxSimNao);
        jComboBoxSimNao.setBounds(380, 150, 70, 20);
        jPanelCadastro.add(FundoTelacadastro);
        FundoTelacadastro.setBounds(0, 0, 660, 450);

        getContentPane().add(jPanelCadastro);
        jPanelCadastro.setBounds(0, 0, 660, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:

        String nome = jTextFieldNome.getText();
        String endereco = jTextFieldEndereco.getText();
        int idade = Integer.parseInt(jTextFieldIdade.getText());
        String areaSaude = (String) jComboBoxSimNao.getSelectedItem();

        Paciente paciente = new Paciente(nome, endereco, idade, areaSaude);

        PacienteDAO pacienteDAO = new PacienteDAO();

        try {
            pacienteDAO.inserirPacientes(paciente);
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso",
                    "Imuniza Facil", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Conexao nao realizada",
                    "Imuniza Facil", JOptionPane.WARNING_MESSAGE);
        }

        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldIdade.setText("");


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxSimNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSimNaoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxSimNaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoTelacadastro;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxSimNao;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSaude;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}

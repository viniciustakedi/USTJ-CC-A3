
package telas;

public class TelaInicial extends javax.swing.JFrame {

     public TelaInicial() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tutuloTelInicial = new javax.swing.JLabel();
        subtituloTelaInicial = new javax.swing.JLabel();
        jButtonAdminAcesso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        fundoTelaIncial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameInicial"); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        tutuloTelInicial.setFont(new java.awt.Font("Verdana", 1, 65)); // NOI18N
        tutuloTelInicial.setText("IMUNIZA FÁCIL");
        jPanel1.add(tutuloTelInicial);
        tutuloTelInicial.setBounds(80, 10, 630, 90);

        subtituloTelaInicial.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        subtituloTelaInicial.setText("Gerenciador da fila de Vacinação Contra o CoronaVírus - covid19");
        jPanel1.add(subtituloTelaInicial);
        subtituloTelaInicial.setBounds(40, 80, 670, 30);

        jButtonAdminAcesso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\CadAdmin.png")); // NOI18N
        jButtonAdminAcesso.setBorderPainted(false);
        jButtonAdminAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdminAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminAcessoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdminAcesso);
        jButtonAdminAcesso.setBounds(170, 200, 90, 100);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Administrador");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 300, 100, 20);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\CadMedicos.png")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 200, 90, 100);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Atendente");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 300, 90, 20);

        jButtonSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\exit.png")); // NOI18N
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(690, 360, 40, 40);

        fundoTelaIncial.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thiago\\Desktop\\img proj\\fundo_tela_principal2.jpg")); // NOI18N
        jPanel1.add(fundoTelaIncial);
        fundoTelaIncial.setBounds(0, 0, 780, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // Ação do Botão Sair
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAdminAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminAcessoActionPerformed
        // Botão login admin
        TelaLoginAdm telaAdm = new TelaLoginAdm();
        telaAdm.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonAdminAcessoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoTelaIncial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdminAcesso;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subtituloTelaInicial;
    private javax.swing.JLabel tutuloTelInicial;
    // End of variables declaration//GEN-END:variables
}

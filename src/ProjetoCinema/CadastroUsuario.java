/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoCinema;

/**
 *
 * @author backdoors
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
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

        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelSobrenomeUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelConfirmaSenha = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de usuário");

        jLabelNomeUsuario.setText("Nome:");

        jLabelSobrenomeUsuario.setText("Sobrenome:");

        jLabelLogin.setText("Login:");

        jLabelSenha.setText("Senha:");

        jLabelConfirmaSenha.setText("Confirma Senha:");

        jLabelEmail.setText("E-mail:");

        jLabelTelefone.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelConfirmaSenha)
                    .addComponent(jLabelSenha)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSobrenomeUsuario)
                    .addComponent(jLabelNomeUsuario))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSobrenomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConfirmaSenha)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelefone)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(586, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelConfirmaSenha;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSobrenomeUsuario;
    private javax.swing.JLabel jLabelTelefone;
    // End of variables declaration//GEN-END:variables
}

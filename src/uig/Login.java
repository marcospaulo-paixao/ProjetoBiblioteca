package uig;

import controle.UsuarioControle;
import javax.accessibility.AccessibleRole;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    UsuarioControle uc = null;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        uc = new UsuarioControle("usuario.txt");
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/livro.png")).getImage());
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
        jButtonEntrar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jButtonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTelaLogin = new javax.swing.JMenu();
        jMenuItemUsuários = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Principal");
        setResizable(false);

        jButtonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/entrar.png"))); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Login");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Senha");

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setText("- V 1.0.0.0.0");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("Projeto Integrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSenha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jMenuTelaLogin.setText("Menu");

        jMenuItemUsuários.setText("Usuários");
        jMenuItemUsuários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuáriosActionPerformed(evt);
            }
        });

        jMenuTelaLogin.add(jMenuItemUsuários);


        jMenuBar1.add(jMenuTelaLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        try {
            if (uc.validaUsuario(jTextFieldLogin.getText(), new String(jTextFieldSenha.getPassword()))) {
                TelaMenuPrincipal menu = new TelaMenuPrincipal();
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inváĺido!");
                jTextFieldLogin.setText("");
                jTextFieldSenha.setText("");
                jTextFieldLogin.setRequestFocusEnabled(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jMenuItemUsuáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuáriosActionPerformed
        // TODO add your handling code here:
        int senha = 1234;
        if (JOptionPane.showInputDialog("Senha Admin").equals("" + senha)) {
            TelaUsuario telaUsuario = new TelaUsuario();
            telaUsuario.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida!");
        }
    }//GEN-LAST:event_jMenuItemUsuáriosActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JToggleButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemUsuários;
    private javax.swing.JMenu jMenuTelaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JPasswordField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}

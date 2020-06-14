package uig;
//
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
import controle.ExemplarControle;
import controle.LivroControle;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.classes.Exemplar;
import modelos.classes.Livro;
import modelos.utilidades.GeradorDeEtiquetas;
import modelos.interfaces.ICRUDExemplar;
import modelos.interfaces.ICRUDLivro;

public class TelaEtiqueta extends javax.swing.JFrame {

    ICRUDLivro livro = null;
    ICRUDExemplar exemplar = null;
    GeradorDeEtiquetas gEtiqueta = null;

    /**
     * Creates new form TelaEtiqueta
     */
    public TelaEtiqueta() {
        super("Biblioteca System");
        initComponents();
        livro = new LivroControle("livro.txt");
        exemplar = new ExemplarControle("exemplar.txt");
        ImageIcon icone = new ImageIcon("src/icons/livro.png");
        this.setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxLivrosEtiqueta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldArmario = new javax.swing.JTextField();
        jButtonGerarEtiqueta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldEdicao = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonBuscarExemplar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Etiqueta");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerador de Etiquetas"));

        jLabel1.setText("Selecione o Identificador do Exemplar");

        jComboBoxLivrosEtiqueta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxLivrosEtiqueta.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxLivrosEtiquetaPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel2.setText("Define a Localização do Livro na Estante");

        jButtonGerarEtiqueta.setText("Gerar Etiqueta");
        jButtonGerarEtiqueta.setEnabled(false);
        jButtonGerarEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarEtiquetaActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldEdicao.setEnabled(false);

        jTextFieldDescricao.setEnabled(false);

        jTextFieldTitulo.setEnabled(false);

        jLabel3.setText("Edição do Exemplar");

        jLabel4.setText("Titulo ");

        jLabel5.setText("Descrição do Exemplar");

        jButtonBuscarExemplar.setText("Buscar Exemplar");
        jButtonBuscarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarExemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxLivrosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEdicao)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDescricao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonGerarEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLivrosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerarEtiqueta)
                    .addComponent(jButton1)
                    .addComponent(jButtonBuscarExemplar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            TelaMenuLivros telaLivro = new TelaMenuLivros();
            telaLivro.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxLivrosEtiquetaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxLivrosEtiquetaPopupMenuWillBecomeVisible
        try {
            jComboBoxLivrosEtiqueta.removeAllItems();
            ArrayList<Exemplar> exemplaresNaLista = exemplar.listagem();
            String[] livroSet = new String[1];

            for (int pos = 0; pos < exemplaresNaLista.size(); pos++) {
                Exemplar aux = exemplaresNaLista.get(pos);
                jComboBoxLivrosEtiqueta.addItem(livroSet[0] = aux.getId() + "");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jComboBoxLivrosEtiquetaPopupMenuWillBecomeVisible

    private void jButtonGerarEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarEtiquetaActionPerformed
//        com.itextpdf.text.Document pdf = new com.itextpdf.text.Document();
        try {
            if (!jTextFieldArmario.getText().isEmpty() && jComboBoxLivrosEtiqueta.getSelectedItem() != "Selecione") {
//                Exemplar exemplarBusca = exemplar.getExemplar(Integer.parseInt("" + jComboBoxLivrosEtiqueta.getSelectedItem()));
//                gEtiqueta = new GeradorDeEtiquetas(exemplarBusca, jTextFieldArmario.getText());
//                PdfWriter.getInstance(pdf, new FileOutputStream("etiqueta.pdf"));
//
//                pdf.open();
//                pdf.add(new Paragraph("                                                      Biblioteca System - SENAI FATESG"));
//                pdf.add(new Paragraph("                                                                PROJETO INTEGRADOR"));
//                pdf.add(new Paragraph("          Sistema Gestor de Biblioteca do Escritório de Advocacia e Associados (SGBEA)            "));
//                pdf.add(new Paragraph("        " + gEtiqueta.toString()));
//                Desktop.getDesktop().open(new File("etiqueta.pdf"));
            } else {
                JOptionPane.showMessageDialog(null, "Sete o Identificador e inclua a localização!");
            }
        } catch (Exception errorInput) {
            JOptionPane.showMessageDialog(null, "Erro: " + errorInput.getMessage());
        } finally {
            jTextFieldArmario.setText("");
            jComboBoxLivrosEtiqueta.removeAllItems();
            jComboBoxLivrosEtiqueta.addItem("Selecione o Identificador");
            jTextFieldEdicao.setText("");
            jTextFieldTitulo.setText("");
            jTextFieldDescricao.setText("");
            jButtonGerarEtiqueta.setEnabled(false);
//            pdf.close();
        }

    }//GEN-LAST:event_jButtonGerarEtiquetaActionPerformed

    private void jButtonBuscarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarExemplarActionPerformed
        if (!jComboBoxLivrosEtiqueta.getSelectedItem().equals("Selecione") || !jComboBoxLivrosEtiqueta.equals("Selecione o Identificador")) {
            try {
                jButtonGerarEtiqueta.setEnabled(true);
                Exemplar exemplarBusca = exemplar.getExemplar(Integer.parseInt("" + jComboBoxLivrosEtiqueta.getSelectedItem()));
                jTextFieldEdicao.setText(exemplarBusca.getEdicao() + "");
                jTextFieldTitulo.setText(exemplarBusca.getLivro().getTitulo());
                jTextFieldDescricao.setText(exemplarBusca.getDescricao());
            } catch (Exception ex) {
                Logger.getLogger(TelaEtiqueta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sete o Identificador e inclua a localização!");
        }
    }//GEN-LAST:event_jButtonBuscarExemplarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEtiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEtiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEtiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEtiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEtiqueta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarExemplar;
    private javax.swing.JButton jButtonGerarEtiqueta;
    private javax.swing.JComboBox<String> jComboBoxLivrosEtiqueta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldArmario;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}

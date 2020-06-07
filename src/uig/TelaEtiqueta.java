package uig;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controle.ExemplarControle;
import controle.LivroControle;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.classes.Exemplar;
import modelos.classes.Livro;
import modelos.interfaces.IcrudExemplar;
import modelos.interfaces.IcrudLivro;
import modelos.utilidades.GeradorDeEtiquetas;

public class TelaEtiqueta extends javax.swing.JFrame {

    IcrudLivro livro = null;
    IcrudExemplar exemplar = null;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Etiqueta");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerador de Etiquetas"));

        jLabel1.setText("Selecione o Livro");

        jComboBoxLivrosEtiqueta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Livro" }));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxLivrosEtiqueta, 0, 289, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldArmario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGerarEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxLivrosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarEtiqueta)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                jComboBoxLivrosEtiqueta.addItem(livroSet[0] = aux.getLivro().getTitulo());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jComboBoxLivrosEtiquetaPopupMenuWillBecomeVisible

    private void jButtonGerarEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarEtiquetaActionPerformed
        com.itextpdf.text.Document pdf = new com.itextpdf.text.Document();
        try {
            if (!jTextFieldArmario.getText().isEmpty() && jComboBoxLivrosEtiqueta.getSelectedItem() != "Selecione o Livro") {
                gEtiqueta = new GeradorDeEtiquetas(livro.getTituloLivro((String) jComboBoxLivrosEtiqueta.getSelectedItem()), jTextFieldArmario.getText());

                PdfWriter.getInstance(pdf, new FileOutputStream("etiqueta.pdf"));

                pdf.open();
                pdf.add(new Paragraph("                                                      Biblioteca System - SENAI FATESG"));
                pdf.add(new Paragraph("                                                                PROJETO INTEGRADOR"));
                pdf.add(new Paragraph("          Sistema Gestor de Biblioteca do Escritório de Advocacia e Associados (SGBEA)            "));
                pdf.add(new Paragraph("        " + gEtiqueta.toString()));
                Desktop.getDesktop().open(new File("etiqueta.pdf"));
            } else {
                JOptionPane.showMessageDialog(null, "Sete o livro e inclua a localização!");
            }
        } catch (Exception errorInput) {
            JOptionPane.showMessageDialog(null, errorInput.getMessage());
        } finally {
            jTextFieldArmario.setText("");
            jComboBoxLivrosEtiqueta.removeAllItems();
            jComboBoxLivrosEtiqueta.addItem("Selecione o Livro");
            pdf.close();
        }

    }//GEN-LAST:event_jButtonGerarEtiquetaActionPerformed

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
    private javax.swing.JButton jButtonGerarEtiqueta;
    private javax.swing.JComboBox<String> jComboBoxLivrosEtiqueta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldArmario;
    // End of variables declaration//GEN-END:variables
}

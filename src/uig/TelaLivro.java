package uig;

import controle.AreaDoLivroControle;
import controle.AutorControle;
import controle.EditoraControle;
import controle.LivroControle;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.classes.AreaDoLivro;
import modelos.classes.Autor;
import modelos.classes.Editora;
import modelos.classes.Livro;
import modelos.interfaces.IcrudAreaDoLivro;
import modelos.interfaces.IcrudAutor;
import modelos.interfaces.IcrudEditora;
import modelos.interfaces.IcrudLivro;
import modelos.utilidades.GeradorID;
import modelos.utilidades.LivroTableModel;
import persistencia.AutorPersistencia;

public class TelaLivro extends javax.swing.JFrame {

    IcrudAutor autor = new AutorPersistencia("autor.txt");
    boolean incluirOn = false;
    IcrudLivro livro = null;
    IcrudEditora editora = null;
    IcrudAreaDoLivro areaDoLivro = null;
    LivroTableModel model = null;

    public TelaLivro() {
        super("Biblioteca System - Livro");
        initComponents();
        model = new LivroTableModel(new String[]{"Titulo do Livro", "Codigo do Livro", "ISBN", "Autor", "Editora", "Area do Livro"});
        jTableLivros.setModel(model);
        ImageIcon icone = new ImageIcon("src/icons/livro.png");
        this.setIconImage(icone.getImage());
        livro = new LivroControle("livro.txt");
        autor = new AutorControle("autor.txt");
        editora = new EditoraControle("editora.txt");
        areaDoLivro = new AreaDoLivroControle("areaDoLivro.txt");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonlistagem = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jComboBoxAutor = new javax.swing.JComboBox<>();
        jComboBoxEditora = new javax.swing.JComboBox<>();
        jComboBoxAreaDoLivro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/mais.png"))); // NOI18N
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/lixo.png"))); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/papel.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonlistagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/listing-option_icon-icons.com_73504.png"))); // NOI18N
        jButtonlistagem.setText("Listar");
        jButtonlistagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonlistagem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonlistagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlistagemActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/salve-.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/1491254395-returnbackredoarrow_82934.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVoltar.setIconTextGap(12);
        jButtonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/cancel_77947.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/Logout_37127.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButtonIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonlistagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSair)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonlistagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Livro"));

        jLabel2.setText("Titulo do Livro");

        txtTitulo.setEnabled(false);

        jLabel3.setText("Código do Livro");

        txtCodigo.setEnabled(false);

        jLabel4.setText("ISBN");

        txtIsbn.setEnabled(false);

        jComboBoxAutor.setMaximumRowCount(100);
        jComboBoxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxAutor.setEnabled(false);
        jComboBoxAutor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxAutorPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBoxEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxEditora.setEnabled(false);
        jComboBoxEditora.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxEditoraPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEditoraActionPerformed(evt);
            }
        });

        jComboBoxAreaDoLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxAreaDoLivro.setEnabled(false);
        jComboBoxAreaDoLivro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxAreaDoLivroPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("Editora");

        jLabel6.setText("Autor");

        jLabel7.setText("Area do Livro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 280, Short.MAX_VALUE))
                            .addComponent(jComboBoxAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxAreaDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxAreaDoLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Livros"));

        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLivros);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        habilitarBott(true);
        limparAll();
        incluirOn = true;
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        incluirOn = false;
        habilitarBott(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        try {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        habilitarBott(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            if (!txtTitulo.getText().isEmpty() && !txtCodigo.getText().isEmpty() && jComboBoxAutor.getSelectedItem() != "Autor" && jComboBoxAreaDoLivro.getSelectedItem() != "Area do Livro" && jComboBoxEditora.getSelectedItem() != "Editora") {
                if (incluirOn) {
                    GeradorID gId = new GeradorID();
                    Editora editoraIncluir = editora.getEditoraNome((String) jComboBoxEditora.getSelectedItem());
                    Autor autorIncluir = autor.getNomeAutor((String) jComboBoxAutor.getSelectedItem());
                    AreaDoLivro areaIncluir = areaDoLivro.getDescricaoLivro((String) jComboBoxAreaDoLivro.getSelectedItem());

                    Livro livroIncluir = new Livro(gId.getID(), Integer.parseInt(txtCodigo.getText()), txtIsbn.getText(), txtTitulo.getText(), editoraIncluir, autorIncluir, areaIncluir);
                    livro.incluir(livroIncluir);
                    gId.finalize();
                    habilitarBott(false);
                    JOptionPane.showMessageDialog(null, "Livro Incluido Com sucesso!");
                    imprimirNaGrid();
                } else {
                    String tituloLivro = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn()).toString();
                    Livro antigoLivro = livro.getTituloLivro(tituloLivro);

                    Editora editoraIncluir = editora.getEditoraNome((String) jComboBoxEditora.getModel().getSelectedItem());
                    Autor autorIncluir = autor.getNomeAutor((String) jComboBoxAutor.getModel().getSelectedItem());
                    AreaDoLivro areaIncluir = areaDoLivro.getDescricaoLivro((String) jComboBoxAreaDoLivro.getModel().getSelectedItem());

                    Livro novoLivro = new Livro(antigoLivro.getId(), Integer.parseInt(txtCodigo.getText()), txtIsbn.getText(), txtTitulo.getText(), editoraIncluir, autorIncluir, areaIncluir);
                    livro.alterar(antigoLivro, novoLivro);
                    habilitarBott(false);
                    JOptionPane.showMessageDialog(null, "Livro Alterado Com sucesso!");
                    imprimirNaGrid();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser setados e preenchidos!");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        } finally {
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        try {
            TelaMenuLivros livroMenu = new TelaMenuLivros();
            livroMenu.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxAutorPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAutorPopupMenuWillBecomeVisible
        try {
            jComboBoxAutor.removeAllItems();
            ArrayList<Autor> autoresList = autor.listagem();
            String[] autores = new String[1];

            for (int pos = 0; pos < autoresList.size(); pos++) {
                Autor aux = autoresList.get(pos);
                jComboBoxAutor.addItem(autores[0] = aux.getNome());
            }

        } catch (Exception ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxAutorPopupMenuWillBecomeVisible

    private void jComboBoxEditoraPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxEditoraPopupMenuWillBecomeVisible
        try {
            jComboBoxEditora.removeAllItems();
            ArrayList<Editora> editoraRList = editora.listagem();
            String[] editoraAdd = new String[1];

            for (int pos = 0; pos < editoraRList.size(); pos++) {
                Editora aux = editoraRList.get(pos);
                jComboBoxEditora.addItem(editoraAdd[0] = aux.getNome());
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxEditoraPopupMenuWillBecomeVisible
    public void imprimirNaGrid() {
        try {
            model.update(livro.listagem());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }


    private void jComboBoxEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEditoraActionPerformed

    }//GEN-LAST:event_jComboBoxEditoraActionPerformed

    private void jComboBoxAreaDoLivroPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAreaDoLivroPopupMenuWillBecomeVisible
        try {
            jComboBoxAreaDoLivro.removeAllItems();
            ArrayList<AreaDoLivro> areaRList = areaDoLivro.listagem();
            String[] areaNaLista = new String[1];

            for (int pos = 0; pos < areaRList.size(); pos++) {
                AreaDoLivro aux = areaRList.get(pos);
                jComboBoxAreaDoLivro.addItem(areaNaLista[0] = aux.getDescricao());
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxAreaDoLivroPopupMenuWillBecomeVisible

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imprimirNaGrid();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlistagemActionPerformed
        imprimirNaGrid();
    }//GEN-LAST:event_jButtonlistagemActionPerformed

    private void jTableLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivrosMouseClicked
        transferirDadosDaGrid();
    }//GEN-LAST:event_jTableLivrosMouseClicked

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            
            if (jTableLivros.getSelectedRow() != 1) {
                String titulo = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn()).toString();
                int config = JOptionPane.showConfirmDialog(rootPane, "Confirmar Exclusão de: " + titulo, titulo, 0);
                if (config == 0) {
                    livro.excluir(titulo);
                    imprimirNaGrid();
                    txtTitulo.setText("");
                    txtCodigo.setText("");
                    txtIsbn.setText("");

                    jComboBoxEditora.removeAllItems();
                    jComboBoxAutor.removeAllItems();
                    jComboBoxAreaDoLivro.removeAllItems();
                    jComboBoxEditora.addItem("Selecione");
                    jComboBoxAutor.addItem("Selecione");
                    jComboBoxAreaDoLivro.addItem("Selecione");
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Concluida!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Cancelada!");
                }
            }
        } catch (Exception erroNaExclusao) {
            JOptionPane.showMessageDialog(null, erroNaExclusao);
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try {
            pesquisarLivro(jTextField1.getText().toLowerCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    public void pesquisarLivro(String texto) {
        try {

            String[][] matrizFiltro = new String[6][livro.listagem().size()];
            String[] matrizS = new String[matrizFiltro[1].length];
            model.update(livro.listagem());
            for (int i = 0; i < model.getColumnCount(); i++) {
                for (int j = 0; j < model.getRowCount(); j++) {
                    matrizFiltro[i][j] = model.getValueAt(j, i);
                }
            }
            ArrayList<String> matriz = null;
                if (matrizFiltro.length > 0) {
                    texto = texto.toLowerCase().trim();
                    if (texto.length() == 0) {                       
                        for (int i = 0; i < matrizFiltro[1].length; i++) {
                                matrizS[i] = matrizFiltro[0][i];
                        }

                    } else {
                        matriz = new ArrayList<>();

                        for (int i = 0; i < matrizFiltro[1].length; i++) {
                            if (matrizFiltro[0][i].toLowerCase().contains(texto)
                                    || matrizFiltro[1][i].toLowerCase().contains(texto)
                                    || matrizFiltro[2][i].toLowerCase().contains(texto)
                                    || matrizFiltro[3][i].toLowerCase().contains(texto)
                                    || matrizFiltro[4][i].toLowerCase().contains(texto)
                                    || matrizFiltro[5][i].toLowerCase().contains(texto)) {
                                matriz.add(matrizFiltro[0][i]);
                            }
                        }

                        matrizS = new String[matriz.size()];
                        for (int i = 0; i < matriz.size(); i++) {
                            matrizS[i] = matriz.get(i);
                        }
                    }
                }

                model.update(matrizS);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        }

    public void habilitarBott(boolean habilitar) {
        jButtonIncluir.setEnabled(!habilitar);
        jButtonDeletar.setEnabled(!habilitar);
        jButtonAlterar.setEnabled(!habilitar);
        jButtonlistagem.setEnabled(!habilitar);
        jButtonVoltar.setEnabled(!habilitar);
        jButtonSalvar.setEnabled(habilitar);
        jButtonCancelar.setEnabled(habilitar);
        jButtonSair.setEnabled(!habilitar);

        if (habilitar) {
            txtCodigo.setEnabled(habilitar);
            txtTitulo.setEnabled(habilitar);
            txtIsbn.setEnabled(habilitar);
            jComboBoxEditora.setEnabled(habilitar);
            jComboBoxAreaDoLivro.setEnabled(habilitar);
            jComboBoxAutor.setEnabled(habilitar);
        } else {
            txtCodigo.setEnabled(false);
            txtTitulo.setEnabled(false);
            txtIsbn.setEnabled(false);
            jComboBoxEditora.setEnabled(false);
            jComboBoxAreaDoLivro.setEnabled(false);
            jComboBoxAutor.setEnabled(false);
            jButtonIncluir.setEnabled(!habilitar);
            jButtonDeletar.setEnabled(!habilitar);
            jButtonAlterar.setEnabled(!habilitar);
            jButtonlistagem.setEnabled(!habilitar);
            jButtonVoltar.setEnabled(!habilitar);
            jButtonSalvar.setEnabled(habilitar);
            jButtonCancelar.setEnabled(false);
            jButtonSair.setEnabled(!habilitar);
            txtTitulo.setText("");
            txtCodigo.setText("");
            txtIsbn.setText("");
            jComboBoxAreaDoLivro.removeAllItems();
            jComboBoxAreaDoLivro.addItem("Area do Livro");
            jComboBoxEditora.removeAllItems();
            jComboBoxEditora.addItem("Editora");
            jComboBoxAutor.removeAllItems();
            jComboBoxAutor.addItem("Autor");
        }
    }

    public void transferirDadosDaGrid() {
        if (jTableLivros.getSelectedRow() != 1) {
            String titulo = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn()).toString();
            String codigo = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn() + 1).toString();
            String isbn = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn() + 2).toString();
            String autor = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn() + 3).toString();
            String editora = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn() + 4).toString();
            String area = jTableLivros.getValueAt(jTableLivros.getSelectedRow(), jTableLivros.getSelectedColumn() + 5).toString();
            txtTitulo.setText(titulo);
            txtCodigo.setText(codigo);
            txtIsbn.setText(isbn);
            jComboBoxEditora.removeAllItems();
            jComboBoxEditora.addItem(editora);
            jComboBoxAutor.removeAllItems();
            jComboBoxAutor.addItem(autor);
            jComboBoxAreaDoLivro.removeAllItems();
            jComboBoxAreaDoLivro.addItem(area);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonlistagem;
    private javax.swing.JComboBox<String> jComboBoxAreaDoLivro;
    private javax.swing.JComboBox<String> jComboBoxAutor;
    private javax.swing.JComboBox<String> jComboBoxEditora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void limparAll() {
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtIsbn.setText("");

        jComboBoxAreaDoLivro.removeAllItems();
        jComboBoxAreaDoLivro.addItem("Area do Livro");
        jComboBoxEditora.removeAllItems();
        jComboBoxEditora.addItem("Editora");
        jComboBoxAutor.removeAllItems();
        jComboBoxAutor.addItem("Autor");
    }
}

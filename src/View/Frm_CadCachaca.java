/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CachacaDAO;
import Controller.TipoCachacaDAO;
import Model.Cachaca;
import Model.TipoCachaca;
import Util.Classes.ImagemConfig;
import Util.Classes.IntegerDocument;
import Util.Classes.NormalDocument;
import Util.Classes.PropertiesManager;
import Util.Classes.TableConfig;
import Util.Classes.UpperDocument;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_CadCachaca extends javax.swing.JFrame {

    PropertiesManager props;
    ImagemConfig imagemConfig;
    Cachaca cachaca;
    CachacaDAO cachacaDAO;
    TipoCachacaDAO tipoCachacaDAO;
    static String imagem = null;

    public Frm_CadCachaca() {
        initComponents();
        setEnabledButtons(true);
        carregaTipoCachaca();
        listaCachacas();
        setFieldsCase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbx_tipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_envelhecimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_madeira = new javax.swing.JTextField();
        txt_grau = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_referencia = new javax.swing.JTextField();
        txt_origem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cachacas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lb_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cachaca");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome*:");

        jLabel2.setText("Tipo*:");

        cbx_tipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_tipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbx_tipoFocusLost(evt);
            }
        });
        cbx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Código :");

        txt_codigo.setEnabled(false);

        jLabel5.setText("Envelhecimento:");

        jLabel6.setText("Madeira*:");

        txt_grau.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Grau *:");

        jLabel8.setText("Preço *:");

        txt_preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_precoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_precoFocusLost(evt);
            }
        });

        jLabel9.setText("Referência *:");

        jLabel10.setText("Origem *:");

        jLabel11.setText("Descrição:");

        txt_descricao.setColumns(20);
        txt_descricao.setRows(5);
        jScrollPane2.setViewportView(txt_descricao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_grau, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_envelhecimento)
                            .addComponent(cbx_tipo, 0, 241, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_origem))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_madeira)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_grau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_envelhecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_madeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Filtro:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tb_cachacas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cachacas.getTableHeader().setReorderingAllowed(false);
        tb_cachacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_cachacasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cachacas);
        if (tb_cachacas.getColumnModel().getColumnCount() > 0) {
            tb_cachacas.getColumnModel().getColumn(0).setMinWidth(70);
            tb_cachacas.getColumnModel().getColumn(0).setPreferredWidth(70);
            tb_cachacas.getColumnModel().getColumn(0).setMaxWidth(70);
            tb_cachacas.getColumnModel().getColumn(1).setMinWidth(150);
            tb_cachacas.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_cachacas.getColumnModel().getColumn(1).setMaxWidth(150);
            tb_cachacas.getColumnModel().getColumn(3).setMinWidth(100);
            tb_cachacas.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_cachacas.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/alterar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/excluir.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar)
                    .addComponent(btn_apagar))
                .addContainerGap())
        );

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/adicionar.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        lb_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_fotoMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(lb_foto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_tipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_tipoFocusGained
        carregaTipoCachaca();
    }//GEN-LAST:event_cbx_tipoFocusGained

    private void cbx_tipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_tipoFocusLost
        txt_origem.requestFocus();
    }//GEN-LAST:event_cbx_tipoFocusLost

    private void cbx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoActionPerformed

    }//GEN-LAST:event_cbx_tipoActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_cachacas, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tb_cachacas.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Editar!");
        } else {
            setEnabledButtons(false);
            lb_foto.setIcon(null);
            txt_nome.requestFocus();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (tb_cachacas.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha de cada vez para Apagar!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o cachaca " + tb_cachacas.getValueAt(tb_cachacas.getSelectedRow(), 1).toString(), "", 0, 0) == 0) {
                removeCachaca(Integer.parseInt(tb_cachacas.getValueAt(tb_cachacas.getSelectedRow(), 0).toString()));
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        cachaca = new Cachaca();
        limparCampos();
        setEnabledButtons(false);
        txt_nome.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        setEnabledButtons(true);
        limparCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void lb_fotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_fotoMousePressed
        if (lb_foto.isEnabled() == true) {
            buscaImagem();
        }
    }//GEN-LAST:event_lb_fotoMousePressed

    private void tb_cachacasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cachacasMousePressed
        if (tb_cachacas.getSelectedRowCount() == 1) {
            carregaCachacaNaTela(tb_cachacas.getValueAt(tb_cachacas.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tb_cachacasMousePressed

    private void txt_precoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_precoFocusLost
        try {
          txt_preco.setText(NumberFormat.getCurrencyInstance().format(Double.parseDouble(
                  txt_preco.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".")
          )));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_precoFocusLost

    private void txt_precoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_precoFocusGained
        txt_preco.setText(null);
    }//GEN-LAST:event_txt_precoFocusGained

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCachaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCachaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCachaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCachaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_CadCachaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cbx_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JTable tb_cachacas;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_envelhecimento;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_grau;
    private javax.swing.JTextField txt_madeira;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_origem;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_referencia;
    // End of variables declaration//GEN-END:variables

    private void setEnabledFields(boolean b) {
        txt_nome.setEnabled(!b);
        txt_referencia.setEnabled(!b);
        txt_grau.setEnabled(!b);
        txt_envelhecimento.setEnabled(!b);
        txt_madeira.setEnabled(!b);
        txt_preco.setEnabled(!b);
        cbx_tipo.setEnabled(!b);
        txt_origem.setEnabled(!b);
        txt_descricao.setEnabled(!b);
        lb_foto.setEnabled(!b);
        txt_filtro.setEnabled(b);
    }

    private void setEnabledButtons(boolean b) {
        btn_novo.setEnabled(b);
        btn_editar.setEnabled(b);
        btn_apagar.setEnabled(b);
        btn_salvar.setEnabled(!b);
        btn_cancelar.setEnabled(!b);
        tb_cachacas.setEnabled(b);
        setEnabledFields(b);
    }

     private void validaCampos() {
        if (txt_nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido!");
            txt_nome.requestFocus();
        } else {
            if (txt_referencia.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Referência Inválida!");
                txt_referencia.requestFocus();
            } else {
                if (txt_grau.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Grau Inválido!");
                    txt_grau.requestFocus();
                } else {
                    if (txt_madeira.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Madeira inválida!");
                        txt_madeira.requestFocus();
                    } else {
                        if (txt_preco.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Preço inválido!");
                            txt_preco.requestFocus();
                        } else {
                            if (cbx_tipo.getSelectedItem() == null) {
                                JOptionPane.showMessageDialog(null, "Tipo inválido!");
                                cbx_tipo.requestFocus();
                            } else {
                                if (txt_origem.getText().trim().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Origem inválida!");
                                    txt_origem.requestFocus();
                                } else {
                                    if (imagem == null) {
                                        JOptionPane.showMessageDialog(null, "Foto da cachaça inválida!");
                                    } else {
                                        salvar();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
     
    private void salvar() {
        try {
            tipoCachacaDAO = new TipoCachacaDAO();
            cachacaDAO = new CachacaDAO();

            if (!txt_codigo.getText().trim().isEmpty()) {
                cachaca.setCodCachaca(Integer.parseInt(txt_codigo.getText()));
            }
            cachaca.setNome(txt_nome.getText());
            cachaca.setReferencia(txt_referencia.getText());
            cachaca.setGraduacao(Integer.parseInt(txt_grau.getText()));
            if (!txt_envelhecimento.getText().trim().isEmpty()) {
                cachaca.setEnvelhecimento(txt_envelhecimento.getText());
            }
            cachaca.setMadeira(txt_madeira.getText());
            cachaca.setPreco(Double.parseDouble(txt_preco.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".")));
            cachaca.setCodTipo(tipoCachacaDAO.find(cbx_tipo.getSelectedItem().toString()));
            cachaca.setOrigem(txt_origem.getText());
            if (!txt_descricao.getText().trim().isEmpty()) {
                cachaca.setDescricao(txt_descricao.getText());
            }
            cachacaDAO.save(cachaca);
            JOptionPane.showMessageDialog(null, "Cachaca salva com sucesso!\n");
            limparCampos();
        } catch (Exception ex) {
            if (ex.toString().contains("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")) {
                JOptionPane.showMessageDialog(null, "Cachaca já cadastrada!");
                txt_nome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a Cachaca!\n" + ex);
            }
        } finally {
            listaCachacas();
        }
    }

    private void buscaImagem() {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);//abre o arquivo  
        File file = c.getSelectedFile();//abre o arquivo selecionado  
        if (file != null) {
            Path path = Paths.get(file.getAbsolutePath());
            imagem = path.toString();
            if (imagem.endsWith("png") || imagem.endsWith("jpg")) {
                byte[] bFile = new byte[(int) file.length()];
                if (bFile.length <= 1048576) {
                    try {
                        FileInputStream fis = new FileInputStream(file);
                        fis.read(bFile);
                        fis.close();
                        cachaca.setFoto(bFile);
                        carregaImagem(bFile);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem do diretório: " + imagem + "\n" + e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Imagem muito grande!\n");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Extenção do arquivo selecionado inválido!\n "
                        + "Tente imagens com extenção: PNG ou JPG");
            }
        }
    }

    private ImageIcon getImagemByCaminho(String caminho) {
        ImageIcon imagem = new ImageIcon(caminho);
        if (imagem != null) {
            return imagem;
        } else {
            System.err.println("Não foi possível encontrar o arquivo: " + caminho);
            return null;
        }
    }

    private void carregaImagem(byte[] imagem) {
        try {
            ImageIcon img = new ImageIcon(imagem);
            lb_foto.setIcon(new ImageIcon(alteraTamanhoImagem(img, lb_foto.getWidth() - 50)));
            lb_foto.revalidate();
            lb_foto.repaint();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Image alteraTamanhoImagem(ImageIcon imagem, int largura) {
        //Calcula a proporção para descobrir a nova altura 
        Image img=imagem.getImage();
        double proportion = largura / (double) img.getWidth(null);
        int newHeight = (int) (img.getHeight(null) * proportion);

        //Cria a imagem de destino          
        BufferedImage newImage = new BufferedImage(largura, newHeight, BufferedImage.TYPE_INT_ARGB);

        //Desenha sobre ela usando filtro Bilinear (o java não possui trinilear ou anisotrópica).  
        Graphics2D g2d = newImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(img, 0, 0, largura, newHeight, null);
        g2d.dispose();

        return newImage;
    }

    private void carregaTipoCachaca() {
        try {
            tipoCachacaDAO = new TipoCachacaDAO();
            cbx_tipo.removeAllItems();
            for (TipoCachaca tipoCachaca : tipoCachacaDAO.list()) {
                cbx_tipo.addItem(tipoCachaca.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os tipos de Cachaca!\n" + e);
        }
    }

    private void limparCampos() {
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_referencia.setText(null);
        txt_grau.setText(null);
        txt_envelhecimento.setText(null);
        txt_madeira.setText(null);
        txt_preco.setText(null);
        txt_origem.setText(null);
        cbx_tipo.setSelectedIndex(0);
        txt_descricao.setText(null);
        lb_foto.setIcon(null);
        imagem = null;
        setEnabledButtons(true);
    }

    private void listaCachacas() {
        try {
            TableConfig.limpaTabela(tb_cachacas);
            cachacaDAO = new CachacaDAO();
            for (Cachaca cachaca : cachacaDAO.list()) {
                String[] linha = new String[]{
                    cachaca.getCodCachaca().toString(),
                    cachaca.getReferencia(),
                    cachaca.getNome(),
                    NumberFormat.getCurrencyInstance().format(cachaca.getPreco())};
                TableConfig.getModel(tb_cachacas).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as Cachacas!\n" + e);
        }
    }

    private void removeCachaca(int codcachaca) {
        try {
            cachacaDAO = new CachacaDAO();
            cachacaDAO.remove(cachacaDAO.find(codcachaca));
            TableConfig.getModel(tb_cachacas).removeRow(tb_cachacas.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Cachaca removida com sucesso!\n");
            setEnabledButtons(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover a Cachaca!\n" + e);
        }
    }

    private void carregaCachacaNaTela(String codigo) {
        try {
            cachacaDAO = new CachacaDAO();
            tipoCachacaDAO=new TipoCachacaDAO();
            cachaca = cachacaDAO.find(Integer.parseInt(codigo));
            txt_codigo.setText(cachaca.getCodCachaca() + "");
            txt_nome.setText(cachaca.getNome());
            txt_referencia.setText(cachaca.getReferencia());
            txt_grau.setText(cachaca.getGraduacao() + "");
            if (cachaca.getEnvelhecimento() != null) {
                txt_envelhecimento.setText(cachaca.getEnvelhecimento());
            }
            txt_madeira.setText(cachaca.getMadeira());
            txt_preco.setText(NumberFormat.getCurrencyInstance().format(cachaca.getPreco()));
            cbx_tipo.setSelectedItem(tipoCachacaDAO.find(cachaca.getCodTipo().getDescricao()));
            txt_origem.setText(cachaca.getOrigem());
            txt_descricao.setText(cachaca.getDescricao());
            carregaImagem(cachaca.getFoto());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da cachaca: "+codigo+"\n"+e);
        }
    }

    private void setFieldsCase() {
        txt_nome.setDocument(new UpperDocument(255));
//        txt_referencia.setDocument(new IntegerDocument(13));
        txt_grau.setDocument(new IntegerDocument(2));
        txt_envelhecimento.setDocument(new UpperDocument(255));
        txt_madeira.setDocument(new UpperDocument(255));
//        txt_preco.setDocument(new MoneyDocument());
        txt_origem.setDocument(new UpperDocument(255));
        txt_descricao.setDocument(new NormalDocument(65535));
    }

}

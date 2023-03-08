package com.mycompany.exerciciorevisao1;

import javax.swing.table.DefaultTableModel;


public class DlgCadComputadores extends javax.swing.JDialog {

    /**
     * Creates new form DlgCadComputadores
     */
    public DlgCadComputadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        BuGSistemasOp = new javax.swing.ButtonGroup();
        BuGProcessador = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BuGHD = new javax.swing.ButtonGroup();
        PopMenu = new javax.swing.JPopupMenu();
        MnPCadastrar = new javax.swing.JMenuItem();
        MnPLimpar = new javax.swing.JMenuItem();
        MnPExcluir = new javax.swing.JMenuItem();
        LBNome = new javax.swing.JLabel();
        LBCidade = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        ComBoxCidade = new javax.swing.JComboBox<>();
        PNSistOp = new javax.swing.JPanel();
        RButWindows = new javax.swing.JRadioButton();
        RButLinux = new javax.swing.JRadioButton();
        PNProcessador = new javax.swing.JPanel();
        RButIntel = new javax.swing.JRadioButton();
        RButAMD = new javax.swing.JRadioButton();
        LBVersao = new javax.swing.JLabel();
        ComBoxVersao = new javax.swing.JComboBox<>();
        PNHd = new javax.swing.JPanel();
        CheckB320 = new javax.swing.JCheckBox();
        CheckB500 = new javax.swing.JCheckBox();
        CheckB1tb = new javax.swing.JCheckBox();
        LBMemoriaRam = new javax.swing.JLabel();
        ButCadastrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbRelatorio = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListMemoria = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        PopMenu.setComponentPopupMenu(PopMenu);

        MnPCadastrar.setText("Cadastrar Item");
        MnPCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });
        PopMenu.add(MnPCadastrar);

        MnPLimpar.setText("Limpar Dados");
        MnPLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPLimparActionPerformed(evt);
            }
        });
        PopMenu.add(MnPLimpar);

        MnPExcluir.setText("Excluir Linha");
        MnPExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPExcluirActionPerformed(evt);
            }
        });
        PopMenu.add(MnPExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Computadores");

        LBNome.setText("Nome");

        LBCidade.setText("Cidade");

        ComBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aracruz", "Serra", "Vitória", "Colatina" }));
        ComBoxCidade.setSelectedIndex(3);
        ComBoxCidade.setToolTipText("");

        PNSistOp.setBorder(javax.swing.BorderFactory.createTitledBorder("Sist. Operacional"));
        PNSistOp.setLayout(new java.awt.BorderLayout());

        BuGSistemasOp.add(RButWindows);
        RButWindows.setMnemonic('W');
        RButWindows.setText("Windows");
        RButWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButWindowsActionPerformed(evt);
            }
        });
        PNSistOp.add(RButWindows, java.awt.BorderLayout.PAGE_END);

        BuGSistemasOp.add(RButLinux);
        RButLinux.setMnemonic('L');
        RButLinux.setText("Linux");
        RButLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButWindowsActionPerformed(evt);
            }
        });
        PNSistOp.add(RButLinux, java.awt.BorderLayout.PAGE_START);

        PNProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));
        PNProcessador.setLayout(new java.awt.BorderLayout());

        BuGProcessador.add(RButIntel);
        RButIntel.setMnemonic('I');
        RButIntel.setText("Intel");
        PNProcessador.add(RButIntel, java.awt.BorderLayout.CENTER);

        BuGProcessador.add(RButAMD);
        RButAMD.setMnemonic('A');
        RButAMD.setText("AMD");
        PNProcessador.add(RButAMD, java.awt.BorderLayout.PAGE_START);

        LBVersao.setText("Versão");

        ComBoxVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxVersaoActionPerformed(evt);
            }
        });

        PNHd.setBorder(javax.swing.BorderFactory.createTitledBorder("HD"));
        PNHd.setLayout(new java.awt.BorderLayout());

        BuGHD.add(CheckB320);
        CheckB320.setMnemonic('3');
        CheckB320.setText("320 GB");
        PNHd.add(CheckB320, java.awt.BorderLayout.CENTER);

        BuGHD.add(CheckB500);
        CheckB500.setMnemonic('5');
        CheckB500.setSelected(true);
        CheckB500.setText("500 GB");
        CheckB500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckB500ActionPerformed(evt);
            }
        });
        PNHd.add(CheckB500, java.awt.BorderLayout.PAGE_START);

        BuGHD.add(CheckB1tb);
        CheckB1tb.setMnemonic('1');
        CheckB1tb.setText("1 TB");
        PNHd.add(CheckB1tb, java.awt.BorderLayout.PAGE_END);

        LBMemoriaRam.setText("Memória RAM");

        ButCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButCadastrar.setText("Cadastrar");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        TbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cidade", "SO", "Versão", "Processador", "HD", "Memória"
            }
        ));
        TbRelatorio.setComponentPopupMenu(PopMenu);
        jScrollPane3.setViewportView(TbRelatorio);

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        ListMemoria.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Menos que 1 GB", "1 GB", "2 GB", "3 GB", "4 GB", "Mais que 4 GB" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ListMemoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBNome)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PNSistOp, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(PNProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LBVersao)
                                    .addComponent(PNHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComBoxVersao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBCidade)
                                    .addComponent(ComBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButCadastrar)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBMemoriaRam))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBNome)
                    .addComponent(LBCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PNSistOp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PNHd, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PNProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBVersao)
                            .addComponent(LBMemoriaRam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComBoxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))
                        .addGap(18, 18, 18)
                        .addComponent(ButCadastrar)))
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckB500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckB500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckB500ActionPerformed

    private void ComBoxVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxVersaoActionPerformed
        
            
    }//GEN-LAST:event_ComBoxVersaoActionPerformed

    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
        String nome = TxtNome.getText();
        String cidade = ComBoxCidade.getSelectedItem().toString();
        String SO = "";
        String versao = ComBoxVersao.getSelectedItem().toString();
        String processador = "";
        String HD = "";
        String memoria = ListMemoria.getSelectedValue().toString();
        
        if(BuGSistemasOp.getSelection().getMnemonic() == 'W'){
          SO = "Windows";  
        }
        else if(BuGSistemasOp.getSelection().getMnemonic() == 'L'){
          SO = "Linux";   
        }
        
        if(BuGProcessador.getSelection().getMnemonic() == 'A'){
          processador = "AMD";  
        }
        else if(BuGProcessador.getSelection().getMnemonic() == 'I'){
          processador = "Intel";   
        }
        
        if(BuGHD.getSelection().getMnemonic() == '5'){
          HD = "500 GB";  
        }
        else if(BuGHD.getSelection().getMnemonic() == '3'){
          HD = "320 GB";   
        }
        else{
            HD = "1 TB";
        }

        inserirTabela(nome,cidade,SO,versao,processador,HD,memoria);
    }//GEN-LAST:event_ButCadastrarActionPerformed

    private void RButWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButWindowsActionPerformed
        // Colocar a mesma ação para o mesmo botão. Aba de Events.
        
        if(RButWindows.isSelected()){
           ComBoxVersao.removeAllItems();
           ComBoxVersao.addItem("XP");
           ComBoxVersao.addItem("Win7");
           ComBoxVersao.addItem("Win8");
           ComBoxVersao.addItem("2003 Server");
           ComBoxVersao.addItem("2008 Server");
           
           ComBoxVersao.setSelectedIndex(2);
        }
           
        if(RButLinux.isSelected()){
           ComBoxVersao.removeAllItems();
           ComBoxVersao.addItem("Ubuntu");
           ComBoxVersao.addItem("Fedora");
           ComBoxVersao.addItem("Red Hat");
           ComBoxVersao.addItem("Suse");
           ComBoxVersao.addItem("Debian");
           
           ComBoxVersao.setSelectedIndex(0);
        }
    }//GEN-LAST:event_RButWindowsActionPerformed

    private void MnPLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPLimparActionPerformed
        TxtNome.setText("");
    }//GEN-LAST:event_MnPLimparActionPerformed

    private void MnPExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPExcluirActionPerformed
        int linha = TbRelatorio.getSelectedRow();
        if(linha >= 0){
            ((DefaultTableModel) TbRelatorio.getModel()).removeRow(linha);
        }
    }//GEN-LAST:event_MnPExcluirActionPerformed

    
    private void inserirTabela (String nome, String cidade, String SO, String versao, String processador,String HD, String memoria){
        ((DefaultTableModel) TbRelatorio.getModel()).addRow(new Object[5]);
        
        int col = 0;
        int linha = TbRelatorio.getRowCount() - 1;
        
        TbRelatorio.setValueAt(nome, linha, col++);
        TbRelatorio.setValueAt(cidade, linha, col++);
        TbRelatorio.setValueAt(SO, linha, col++);
        TbRelatorio.setValueAt(versao, linha, col++);
        TbRelatorio.setValueAt(processador, linha, col++);
        TbRelatorio.setValueAt(HD, linha, col++);
        TbRelatorio.setValueAt(memoria, linha, col++);
    }
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
            java.util.logging.Logger.getLogger(DlgCadComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadComputadores dialog = new DlgCadComputadores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BuGHD;
    private javax.swing.ButtonGroup BuGProcessador;
    private javax.swing.ButtonGroup BuGSistemasOp;
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JCheckBox CheckB1tb;
    private javax.swing.JCheckBox CheckB320;
    private javax.swing.JCheckBox CheckB500;
    private javax.swing.JComboBox<String> ComBoxCidade;
    private javax.swing.JComboBox<String> ComBoxVersao;
    private javax.swing.JLabel LBCidade;
    private javax.swing.JLabel LBMemoriaRam;
    private javax.swing.JLabel LBNome;
    private javax.swing.JLabel LBVersao;
    private javax.swing.JList<String> ListMemoria;
    private javax.swing.JMenuItem MnPCadastrar;
    private javax.swing.JMenuItem MnPExcluir;
    private javax.swing.JMenuItem MnPLimpar;
    private javax.swing.JPanel PNHd;
    private javax.swing.JPanel PNProcessador;
    private javax.swing.JPanel PNSistOp;
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JRadioButton RButAMD;
    private javax.swing.JRadioButton RButIntel;
    private javax.swing.JRadioButton RButLinux;
    private javax.swing.JRadioButton RButWindows;
    private javax.swing.JTable TbRelatorio;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
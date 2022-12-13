/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraf;

import gerTarefas.GerenciadorInterfaceGraf;
import java.awt.Component;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.Cliente;
import modelo.Reserva;


public class DlgConsulta extends javax.swing.JDialog {
    
    GerenciadorInterfaceGraf interGraf;
    private Cliente cliSelecionado;
    private Reserva res;
    
    private Reserva reservaSelec;
    

    public DlgConsulta(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGraf gerenGraf) {
        super(parent, modal);
        initComponents();
        interGraf = gerenGraf;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CmBoxConsulta = new javax.swing.JComboBox<>();
        TxtConsulta = new javax.swing.JTextField();
        ButPesqConsulta = new javax.swing.JButton();
        PnTabelaConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaConsulta = new javax.swing.JTable();
        ButExcluirConsulta = new javax.swing.JButton();
        ButCancelarConsulta = new javax.swing.JButton();
        ButDevolucao = new javax.swing.JButton();
        LbConsultaFrente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Reservas");

        jPanel2.setBackground(new java.awt.Color(251, 224, 224));

        jPanel1.setBackground(new java.awt.Color(246, 230, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        CmBoxConsulta.setBackground(new java.awt.Color(255, 0, 51));
        CmBoxConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome Cliente", "Data Reserva" }));
        CmBoxConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmBoxConsultaActionPerformed(evt);
            }
        });

        ButPesqConsulta.setBackground(new java.awt.Color(255, 0, 102));
        ButPesqConsulta.setText("Pesquisar");
        ButPesqConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButPesqConsultaActionPerformed(evt);
            }
        });

        PnTabelaConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        TabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Reserva", "Codigo Cliente", "Data Reserva", "Data Devolução"
            }
        ));
        jScrollPane1.setViewportView(TabelaConsulta);

        PnTabelaConsulta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 126));

        ButExcluirConsulta.setBackground(new java.awt.Color(255, 0, 102));
        ButExcluirConsulta.setText("Excluir");
        ButExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirConsultaActionPerformed(evt);
            }
        });

        ButCancelarConsulta.setBackground(new java.awt.Color(255, 0, 102));
        ButCancelarConsulta.setText("Cancelar");
        ButCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelarConsultaActionPerformed(evt);
            }
        });

        ButDevolucao.setBackground(new java.awt.Color(255, 0, 102));
        ButDevolucao.setText("Devolução");
        ButDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnTabelaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CmBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButPesqConsulta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(ButExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(ButDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButCancelarConsulta)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButPesqConsulta))
                .addGap(18, 18, 18)
                .addComponent(PnTabelaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCancelarConsulta)
                    .addComponent(ButExcluirConsulta)
                    .addComponent(ButDevolucao))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LbConsultaFrente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        LbConsultaFrente.setText("Consultar Reserva ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(LbConsultaFrente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(LbConsultaFrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmBoxConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmBoxConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmBoxConsultaActionPerformed

    private void ButExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirConsultaActionPerformed
       int linha;
        
        linha = TabelaConsulta.getSelectedRow();
        if ( linha >= 0 ) {            
            Reserva res = (Reserva) TabelaConsulta.getValueAt(linha, 0);
            try {
                interGraf.getGerDom().excluir(res);
                ( (DefaultTableModel) TabelaConsulta.getModel() ).removeRow(linha);
                JOptionPane.showMessageDialog(this, "Reserva excluída com sucesso!" );
            } catch (ClassNotFoundException | SQLException  ex) {
                JOptionPane.showMessageDialog(this, "ERRO ao excluir reserva!" + ex ,
                        "ERRO ao excluir reserva", JOptionPane.ERROR_MESSAGE );
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma reserva!" );
        }
    }//GEN-LAST:event_ButExcluirConsultaActionPerformed

    private void ButCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarConsultaActionPerformed
        cliSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_ButCancelarConsultaActionPerformed

    private void ButPesqConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButPesqConsultaActionPerformed
       List<Reserva> lista;
        try {
            lista = interGraf.getGerDom().pesquisarReserva(TxtConsulta.getText(), CmBoxConsulta.getSelectedIndex());
            ( (DefaultTableModel) TabelaConsulta.getModel() ).setNumRows(0);
            for ( Reserva res : lista ) {
                // CRIAR uma linha em branco       
                ( (DefaultTableModel) TabelaConsulta.getModel() ).addRow( res.toArray());
            }
            
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
           JOptionPane.showMessageDialog(this, "ERRO ao pesquisar reserva!" + ex ,
                        "ERRO pesquisar reserva", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ButPesqConsultaActionPerformed

    private void ButDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButDevolucaoActionPerformed
        
        int linha;
        
        linha = TabelaConsulta.getSelectedRow();
        if ( linha >= 0 ) {            
            reservaSelec = (Reserva) TabelaConsulta.getValueAt(linha, 0);
            this.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma reserva." );
        }
         
    }//GEN-LAST:event_ButDevolucaoActionPerformed

    public Reserva getReservaSelec() {
        return reservaSelec;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCancelarConsulta;
    private javax.swing.JButton ButDevolucao;
    private javax.swing.JButton ButExcluirConsulta;
    private javax.swing.JButton ButPesqConsulta;
    private javax.swing.JComboBox<String> CmBoxConsulta;
    private javax.swing.JLabel LbConsultaFrente;
    private javax.swing.JPanel PnTabelaConsulta;
    private javax.swing.JTable TabelaConsulta;
    private javax.swing.JTextField TxtConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

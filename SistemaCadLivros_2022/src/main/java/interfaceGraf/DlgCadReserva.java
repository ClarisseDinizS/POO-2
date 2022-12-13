package interfaceGraf;

import gerTarefas.FuncoesUteis;
import gerTarefas.GerenciadorInterfaceGraf;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Livro;
import modelo.Reserva;

public class DlgCadReserva extends javax.swing.JDialog {

    GerenciadorInterfaceGraf interGraf;
    private Cliente cliSelecionado;
    private Livro livSelecionado;
    private Reserva resSelec;
    
            
    public DlgCadReserva(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGraf gerenGraf) {
        super(parent, modal);
        initComponents();
        interGraf = gerenGraf;
        this.cliSelecionado = null;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnCadReservaFundo = new javax.swing.JPanel();
        PnCadReservaTotal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LbNomeCliente = new javax.swing.JLabel();
        LbDataReserva = new javax.swing.JLabel();
        FTxtDataLivro = new javax.swing.JFormattedTextField();
        ButReservar = new javax.swing.JButton();
        LbDataDev = new javax.swing.JLabel();
        FTxtDataDev = new javax.swing.JFormattedTextField();
        CmBoxCliente = new javax.swing.JComboBox<>();
        TxtValorMulta = new javax.swing.JLabel();
        TxtMulta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtCodReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CmBoxLiv = new javax.swing.JComboBox<>();
        ButPesq = new javax.swing.JButton();
        ButAlterar = new javax.swing.JButton();
        LbTituloFrente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Reserva de Livro");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        PnCadReservaFundo.setBackground(new java.awt.Color(251, 224, 224));

        PnCadReservaTotal.setBackground(new java.awt.Color(246, 230, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        LbNomeCliente.setText("Cliente");

        LbDataReserva.setText("Data Reserva");

        try {
            FTxtDataLivro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ButReservar.setBackground(new java.awt.Color(255, 0, 102));
        ButReservar.setText("Reservar");
        ButReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButReservarActionPerformed(evt);
            }
        });

        LbDataDev.setText("Data Dev");

        try {
            FTxtDataDev.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TxtValorMulta.setText("Valor Multa");

        jLabel1.setText("Código Reserva");

        jLabel2.setText("Livros");

        ButPesq.setBackground(new java.awt.Color(255, 0, 51));
        ButPesq.setText("Pesquisar");
        ButPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButPesqActionPerformed(evt);
            }
        });

        ButAlterar.setBackground(new java.awt.Color(255, 0, 51));
        ButAlterar.setText("Alterar Devolução");
        ButAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbNomeCliente)
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CmBoxCliente, 0, 173, Short.MAX_VALUE)
                            .addComponent(CmBoxLiv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButPesq))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(LbDataReserva)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FTxtDataLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FTxtDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(LbDataDev))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(TxtValorMulta)
                                        .addGap(31, 31, 31)
                                        .addComponent(TxtMulta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addGap(107, 107, 107)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButPesq))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNomeCliente)
                    .addComponent(CmBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CmBoxLiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataReserva)
                    .addComponent(FTxtDataLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataDev)
                    .addComponent(FTxtDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButReservar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValorMulta)
                    .addComponent(ButAlterar))
                .addGap(94, 94, 94))
        );

        LbTituloFrente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        LbTituloFrente.setText("Cadastrar Reserva");

        javax.swing.GroupLayout PnCadReservaTotalLayout = new javax.swing.GroupLayout(PnCadReservaTotal);
        PnCadReservaTotal.setLayout(PnCadReservaTotalLayout);
        PnCadReservaTotalLayout.setHorizontalGroup(
            PnCadReservaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadReservaTotalLayout.createSequentialGroup()
                .addGroup(PnCadReservaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnCadReservaTotalLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(LbTituloFrente))
                    .addGroup(PnCadReservaTotalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnCadReservaTotalLayout.setVerticalGroup(
            PnCadReservaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadReservaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTituloFrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnCadReservaFundoLayout = new javax.swing.GroupLayout(PnCadReservaFundo);
        PnCadReservaFundo.setLayout(PnCadReservaFundoLayout);
        PnCadReservaFundoLayout.setHorizontalGroup(
            PnCadReservaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadReservaFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnCadReservaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnCadReservaFundoLayout.setVerticalGroup(
            PnCadReservaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadReservaFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnCadReservaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCadReservaFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCadReservaFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButReservarActionPerformed
        
        Cliente cliente = (Cliente) CmBoxCliente.getSelectedItem();
        Livro nomeLivro = (Livro) CmBoxLiv.getSelectedItem();
        int multa =  Integer.parseInt(this.TxtMulta.getText());
        int codReserva = Integer.parseInt(this.TxtCodReserva.getText());
        String dataRes =  this.FTxtDataLivro.getText();
        String dataDev =  this.FTxtDataDev.getText();
        
        
           try{
           interGraf.getGerDom().inserirReserva(cliente.getCodCliente(),codReserva, FuncoesUteis.strToDate(dataRes)
                   ,multa, FuncoesUteis.strToDate(dataDev), nomeLivro.getCodLivro());
            
                
            JOptionPane.showMessageDialog(this, "Reserva cadastrada com sucesso!.");
            limparCampos();
            
           
          
            
        }catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, "ERRO ao inserir no banco!" + ex ,
                    "ERRO cadastro de reserva", JOptionPane.ERROR_MESSAGE );
        } catch (ParseException ex) {
            Logger.getLogger(DlgCadReserva.class.getName()).log(Level.SEVERE, null, ex);
            } 

    }//GEN-LAST:event_ButReservarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        interGraf.carregarCombo(CmBoxCliente, Cliente.class);
        interGraf.carregarCombo(CmBoxLiv,Livro.class); 
    }//GEN-LAST:event_formComponentShown

    private void ButPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButPesqActionPerformed
        resSelec = interGraf.abrirConsulta();
        try {
            preencherCampos(resSelec);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data inválida!" ,
                "ERRO na data", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ButPesqActionPerformed

    private void ButAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAlterarActionPerformed
        Cliente cliente = (Cliente) CmBoxCliente.getSelectedItem();
        Livro nomeLivro = (Livro) CmBoxLiv.getSelectedItem();
        int multa =  Integer.parseInt(this.TxtMulta.getText());
        int codReserva = Integer.parseInt(this.TxtCodReserva.getText());
        String dataRes =  this.FTxtDataLivro.getText();
        String dataDev =  this.FTxtDataDev.getText();
        
        
           try{
           interGraf.getGerDom().alterarReserva(resSelec, codReserva,FuncoesUteis.strToDate(dataRes)
                   ,multa, FuncoesUteis.strToDate(dataDev));   
            JOptionPane.showMessageDialog(this, "Devolução Alterada com sucesso!.");
            limparCampos();
            
 
        }catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, "ERRO ao inserir no banco!" + ex ,
                    "ERRO cadastro de reserva", JOptionPane.ERROR_MESSAGE );
        } catch (ParseException ex) {
            Logger.getLogger(DlgCadReserva.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_ButAlterarActionPerformed
    
    private void limparCampos() {
        TxtCodReserva.setText("");
        TxtMulta.setText("");
        TxtValorMulta.setText("");
        FTxtDataDev.setText("");
        FTxtDataLivro.setText("");
        
    }
    
    private void preencherCampos(Reserva res) throws ParseException {
        
        if ( res != null ) {
            TxtCodReserva.setText(String.valueOf(res.getCodReserva()));
            TxtMulta.setText(String.valueOf(res.getValorMulta()));
            CmBoxCliente.setSelectedItem(res);
            CmBoxLiv.setSelectedItem(res);
            
            FTxtDataLivro.setText(FuncoesUteis.dateToStr(res.getDataReserva()));
            FTxtDataDev.setText(FuncoesUteis.dateToStr(res.getDataDevolucao()));

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAlterar;
    private javax.swing.JButton ButPesq;
    private javax.swing.JButton ButReservar;
    private javax.swing.JComboBox<String> CmBoxCliente;
    private javax.swing.JComboBox<String> CmBoxLiv;
    private javax.swing.JFormattedTextField FTxtDataDev;
    private javax.swing.JFormattedTextField FTxtDataLivro;
    private javax.swing.JLabel LbDataDev;
    private javax.swing.JLabel LbDataReserva;
    private javax.swing.JLabel LbNomeCliente;
    private javax.swing.JLabel LbTituloFrente;
    private javax.swing.JPanel PnCadReservaFundo;
    private javax.swing.JPanel PnCadReservaTotal;
    private javax.swing.JTextField TxtCodReserva;
    private javax.swing.JTextField TxtMulta;
    private javax.swing.JLabel TxtValorMulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

package interfaceGraf;

import gerTarefas.FuncoesUteis;
import gerTarefas.GerenciadorInterfaceGraf;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class DlgCadCliente extends javax.swing.JDialog {

    GerenciadorInterfaceGraf interGraf;
    Cliente cliSelecionado;
            
    public DlgCadCliente(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGraf gerenGraf) {
        super(parent, modal);
        initComponents();
        interGraf = gerenGraf;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ButGSexo = new javax.swing.ButtonGroup();
        PnFundoCadCliente = new javax.swing.JPanel();
        PnCadClienteFrente = new javax.swing.JPanel();
        LbCadFrente = new javax.swing.JLabel();
        PnCadClienteFundo = new javax.swing.JPanel();
        PnCadClienteNome = new javax.swing.JLabel();
        PnCadClienteCPF = new javax.swing.JLabel();
        PnCadClienteNasc = new javax.swing.JLabel();
        TxtNomeCli = new javax.swing.JTextField();
        PnSexoCli = new javax.swing.JPanel();
        RButFem = new javax.swing.JRadioButton();
        RButMasc = new javax.swing.JRadioButton();
        FTxtCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        FTxtCep = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        TxtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BTCadastrar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        BTCancelar = new javax.swing.JButton();
        LbCodCliente = new javax.swing.JLabel();
        TxtCodCliente = new javax.swing.JTextField();
        TxtNasc = new javax.swing.JFormattedTextField();
        BTPesq = new javax.swing.JButton();
        BTAlterar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        PnFundoCadCliente.setBackground(new java.awt.Color(246, 230, 230));

        PnCadClienteFrente.setBackground(new java.awt.Color(251, 224, 224));
        PnCadClienteFrente.setToolTipText("Cadastro de Aluno");

        LbCadFrente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        LbCadFrente.setText("Cadastro de Cliente");

        javax.swing.GroupLayout PnCadClienteFrenteLayout = new javax.swing.GroupLayout(PnCadClienteFrente);
        PnCadClienteFrente.setLayout(PnCadClienteFrenteLayout);
        PnCadClienteFrenteLayout.setHorizontalGroup(
            PnCadClienteFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadClienteFrenteLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(LbCadFrente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnCadClienteFrenteLayout.setVerticalGroup(
            PnCadClienteFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCadClienteFrenteLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(LbCadFrente)
                .addContainerGap())
        );

        PnCadClienteFundo.setBackground(new java.awt.Color(255, 255, 255));

        PnCadClienteNome.setText("Nome");

        PnCadClienteCPF.setText("CPF");

        PnCadClienteNasc.setText("Dt. Nasc");

        PnSexoCli.setBackground(new java.awt.Color(255, 255, 255));
        PnSexoCli.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        PnSexoCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RButFem.setBackground(new java.awt.Color(255, 255, 255));
        ButGSexo.add(RButFem);
        RButFem.setMnemonic('F');
        RButFem.setText("Feminino");
        RButFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButFemActionPerformed(evt);
            }
        });
        PnSexoCli.add(RButFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        RButMasc.setBackground(new java.awt.Color(255, 255, 255));
        ButGSexo.add(RButMasc);
        RButMasc.setMnemonic('M');
        RButMasc.setText("Masculino");
        PnSexoCli.add(RButMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        try {
            FTxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("CEP");

        try {
            FTxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Endereço");

        jLabel4.setText("Bairro");

        TxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBairroActionPerformed(evt);
            }
        });

        jLabel5.setText("Cidade");

        BTCadastrar.setBackground(new java.awt.Color(255, 51, 102));
        BTCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTCadastrar.setText("Cadastrar");
        BTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCadastrarActionPerformed(evt);
            }
        });

        BtLimpar.setBackground(new java.awt.Color(255, 0, 102));
        BtLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        BTCancelar.setBackground(new java.awt.Color(255, 51, 102));
        BTCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTCancelar.setText("Cancelar");
        BTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCancelarActionPerformed(evt);
            }
        });

        LbCodCliente.setText("Codigo");

        try {
            TxtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BTPesq.setBackground(new java.awt.Color(255, 51, 102));
        BTPesq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTPesq.setText("Pesquisar");
        BTPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPesqActionPerformed(evt);
            }
        });

        BTAlterar.setBackground(new java.awt.Color(255, 51, 102));
        BTAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTAlterar.setText("Alterar");
        BTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnCadClienteFundoLayout = new javax.swing.GroupLayout(PnCadClienteFundo);
        PnCadClienteFundo.setLayout(PnCadClienteFundoLayout);
        PnCadClienteFundoLayout.setHorizontalGroup(
            PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(LbCodCliente))
                        .addGap(22, 22, 22)
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCadClienteFundoLayout.createSequentialGroup()
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(BTCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(BTAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BTCancelar))
                            .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PnCadClienteNome)
                                            .addComponent(PnCadClienteCPF))
                                        .addGap(24, 24, 24)
                                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                                        .addComponent(PnCadClienteNasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(TxtNasc))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PnSexoCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTPesq, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26))))
        );
        PnCadClienteFundoLayout.setVerticalGroup(
            PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PnCadClienteNome)
                    .addComponent(TxtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTPesq))
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PnCadClienteCPF)
                            .addComponent(FTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PnCadClienteNasc)
                            .addComponent(TxtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCodCliente)
                            .addComponent(TxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnCadClienteFundoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(PnSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(PnCadClienteFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTCadastrar)
                    .addComponent(BtLimpar)
                    .addComponent(BTCancelar)
                    .addComponent(BTAlterar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout PnFundoCadClienteLayout = new javax.swing.GroupLayout(PnFundoCadCliente);
        PnFundoCadCliente.setLayout(PnFundoCadClienteLayout);
        PnFundoCadClienteLayout.setHorizontalGroup(
            PnFundoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCadClienteFrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PnFundoCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnCadClienteFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnFundoCadClienteLayout.setVerticalGroup(
            PnFundoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnFundoCadClienteLayout.createSequentialGroup()
                .addComponent(PnCadClienteFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnCadClienteFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnFundoCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnFundoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RButFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RButFemActionPerformed

    private void TxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBairroActionPerformed

    private void BTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BTCancelarActionPerformed

    private void BTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCadastrarActionPerformed
        
        int codCliente = Integer.parseInt(this.TxtCodCliente.getText());
        char sexo;
        String cep = this.FTxtCep.getText();
        String cpf = this.FTxtCPF.getText();
        String nomeCli = this.TxtNomeCli.getText();
        String endereco = this.TxtEndereco.getText();
        String bairro = this.TxtBairro.getText();
        String cidade = this.TxtCidade.getText();
        String dataNasc = this.TxtNasc.getText();
        
        if (this.ButGSexo.getSelection().getMnemonic() == 'F'){
            sexo = 'F';
        }else{
            sexo = 'M';
        }
        
        try{
            interGraf.getGerDom().inserirCliente(codCliente,nomeCli,cpf,FuncoesUteis.strToDate(dataNasc),
                    sexo,cep,endereco,bairro,cidade);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!.");
            limparCampos();
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, "ERRO ao inserir no banco!" + ex ,
                    "ERRO cadastro de cliente", JOptionPane.ERROR_MESSAGE );
        } catch (ParseException ex) {
            Logger.getLogger(DlgCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTCadastrarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        this.FTxtCPF.setValue("");
        this.FTxtCep.setValue("");
        this.TxtNasc.setValue("");
        this.TxtNomeCli.setText("");
        this.TxtCodCliente.setText("");
        this.TxtCidade.setText("");
        this.TxtBairro.setText("");
        this.TxtEndereco.setText("");
        this.RButFem.setSelected(false);
        this.RButMasc.setSelected(false);
    }//GEN-LAST:event_BtLimparActionPerformed

    private void BTPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPesqActionPerformed
        cliSelecionado = interGraf.abrirConsultaCliente();
        try {
            preencherCampos(cliSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data inválida!" ,
                "ERRO na data", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BTPesqActionPerformed

    private void BTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAlterarActionPerformed
        int codCliente = Integer.parseInt(this.TxtCodCliente.getText());
        char sexo;
        String cep = this.FTxtCep.getText();
        String cpf = this.FTxtCPF.getText();
        String nomeCli = this.TxtNomeCli.getText();
        String endereco = this.TxtEndereco.getText();
        String bairro = this.TxtBairro.getText();
        String cidade = this.TxtCidade.getText();
        String dataNasc = this.TxtNasc.getText();
        
        if (this.ButGSexo.getSelection().getMnemonic() == 'F'){
            sexo = 'F';
        }else{
            sexo = 'M';
        }
        
        try{
            interGraf.getGerDom().alterarCliente(cliSelecionado,nomeCli,cpf,FuncoesUteis.strToDate(dataNasc),codCliente,
                    sexo,cep,endereco,bairro,cidade);
            JOptionPane.showMessageDialog(this, "Cliente Alterado!.");
            limparCampos();
            
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, "ERRO ao inserir no banco!" + ex ,
                    "ERRO alterar cliente", JOptionPane.ERROR_MESSAGE );
        } catch (ParseException ex) {
            Logger.getLogger(DlgCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTAlterarActionPerformed

 private void limparCampos() {
        TxtCidade.setText("");
        TxtBairro.setText("");
        TxtEndereco.setText("");
        TxtCodCliente.setText("");
        ButGSexo.clearSelection();
        TxtNomeCli.setText("");
        FTxtCPF.setText("");
        FTxtCep.setText("");
        TxtNasc.setText("");
    }
 private void preencherCampos(Cliente cli) throws ParseException {
        
        if ( cli != null ) {
            
            TxtNomeCli.setText(cli.getNomeCli());
            TxtNasc.setText(cli.getDtNascFormatada());
            
            //Marcar o campo de sexo de acordo com o que foi selecionado
            if ( cli.getSexo() == 'F' ) {
                RButFem.setSelected(true);
            } else {
                RButMasc.setSelected(true);
            };
            
            TxtEndereco.setText(cli.getEndereco());
            TxtBairro.setText(cli.getBairro());
            TxtCidade.setText(cli.getCidade());
            TxtCodCliente.setText(String.valueOf(cli.getCodCliente()));
            FTxtCPF.setText(String.valueOf(cli.getCpf()));
            FTxtCep.setText(String.valueOf(cli.getCep()));
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAlterar;
    private javax.swing.JButton BTCadastrar;
    private javax.swing.JButton BTCancelar;
    private javax.swing.JButton BTPesq;
    private javax.swing.JButton BtLimpar;
    private javax.swing.ButtonGroup ButGSexo;
    private javax.swing.JFormattedTextField FTxtCPF;
    private javax.swing.JFormattedTextField FTxtCep;
    private javax.swing.JLabel LbCadFrente;
    private javax.swing.JLabel LbCodCliente;
    private javax.swing.JLabel PnCadClienteCPF;
    private javax.swing.JPanel PnCadClienteFrente;
    private javax.swing.JPanel PnCadClienteFundo;
    private javax.swing.JLabel PnCadClienteNasc;
    private javax.swing.JLabel PnCadClienteNome;
    private javax.swing.JPanel PnFundoCadCliente;
    private javax.swing.JPanel PnSexoCli;
    private javax.swing.JRadioButton RButFem;
    private javax.swing.JRadioButton RButMasc;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtCodCliente;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JFormattedTextField TxtNasc;
    private javax.swing.JTextField TxtNomeCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

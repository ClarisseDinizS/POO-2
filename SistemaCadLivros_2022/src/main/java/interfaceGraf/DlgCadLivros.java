package interfaceGraf;

import static gerTarefas.FuncoesUteis.IconToBytes;
import gerTarefas.GerenciadorInterfaceGraf;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DlgCadLivros extends javax.swing.JDialog {

    private GerenciadorInterfaceGraf interGraf;
    
            
    public DlgCadLivros(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGraf gerenGraf) {
        super(parent, modal);
        initComponents();
        this.interGraf = gerenGraf;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PnCadLivroFrente = new javax.swing.JPanel();
        PnCadLivroTotal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PnNomeLivro = new javax.swing.JLabel();
        PnGeneroLivro = new javax.swing.JLabel();
        PnAutorLivro = new javax.swing.JLabel();
        PnEditoraLivro = new javax.swing.JLabel();
        PnAnoLivro = new javax.swing.JLabel();
        TxtNomeLivro = new javax.swing.JTextField();
        TxtGeneroLivro = new javax.swing.JTextField();
        TxtAutorLivro = new javax.swing.JTextField();
        TxtEditoraLivro = new javax.swing.JTextField();
        TxtAnoLivro = new javax.swing.JTextField();
        ButCadLivro = new javax.swing.JButton();
        ButCancelar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        LbCodLivro = new javax.swing.JLabel();
        TxtCodLivro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LbFoto = new javax.swing.JLabel();
        ButFoto = new javax.swing.JButton();
        LbCadLivroFrente = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros");

        PnCadLivroFrente.setBackground(new java.awt.Color(251, 224, 224));

        PnCadLivroTotal.setBackground(new java.awt.Color(246, 230, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        PnNomeLivro.setText("Nome");

        PnGeneroLivro.setText("Gênero");

        PnAutorLivro.setText("Autor");

        PnEditoraLivro.setText("Editora");

        PnAnoLivro.setText("Ano");

        ButCadLivro.setBackground(new java.awt.Color(255, 0, 102));
        ButCadLivro.setText("Cadastrar ");
        ButCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadLivroActionPerformed(evt);
            }
        });

        ButCancelar.setBackground(new java.awt.Color(255, 0, 51));
        ButCancelar.setText("Cancelar");
        ButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelarActionPerformed(evt);
            }
        });

        BtLimpar.setBackground(new java.awt.Color(255, 0, 102));
        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        LbCodLivro.setText("Código");

        TxtCodLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodLivroActionPerformed(evt);
            }
        });

        LbFoto.setText("             Capa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        ButFoto.setText("Escolher");
        ButFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(ButCadLivro)
                            .addGap(18, 18, 18)
                            .addComponent(BtLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(ButCancelar))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PnNomeLivro)
                                .addComponent(PnGeneroLivro)
                                .addComponent(PnAutorLivro)
                                .addComponent(PnAnoLivro)
                                .addComponent(LbCodLivro))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtAnoLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtAutorLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addComponent(TxtGeneroLivro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNomeLivro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCodLivro, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PnEditoraLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEditoraLivro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ButFoto)
                        .addGap(11, 11, 11)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCodLivro)
                            .addComponent(TxtCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PnNomeLivro)
                                    .addComponent(TxtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(PnGeneroLivro))
                            .addComponent(TxtGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PnAutorLivro)
                            .addComponent(TxtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PnEditoraLivro)
                            .addComponent(TxtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PnAnoLivro)
                            .addComponent(TxtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButCadLivro)
                            .addComponent(BtLimpar)
                            .addComponent(ButCancelar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButFoto)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout PnCadLivroTotalLayout = new javax.swing.GroupLayout(PnCadLivroTotal);
        PnCadLivroTotal.setLayout(PnCadLivroTotalLayout);
        PnCadLivroTotalLayout.setHorizontalGroup(
            PnCadLivroTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLivroTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnCadLivroTotalLayout.setVerticalGroup(
            PnCadLivroTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLivroTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LbCadLivroFrente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        LbCadLivroFrente.setText("Cadastro de Livros");

        javax.swing.GroupLayout PnCadLivroFrenteLayout = new javax.swing.GroupLayout(PnCadLivroFrente);
        PnCadLivroFrente.setLayout(PnCadLivroFrenteLayout);
        PnCadLivroFrenteLayout.setHorizontalGroup(
            PnCadLivroFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLivroFrenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnCadLivroTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCadLivroFrenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbCadLivroFrente)
                .addGap(132, 132, 132))
        );
        PnCadLivroFrenteLayout.setVerticalGroup(
            PnCadLivroFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCadLivroFrenteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LbCadLivroFrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnCadLivroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCadLivroFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnCadLivroFrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadLivroActionPerformed
        String nomeAutor = this.TxtAutorLivro.getText();
        String nomeEditora = this.TxtGeneroLivro.getText();
        String genero = this.TxtGeneroLivro.getText();
        String nomeLivro = this.TxtNomeLivro.getText();
        int anoLivro = Integer.parseInt(this.TxtAnoLivro.getText());
        int codLivro = Integer.parseInt(this.TxtCodLivro.getText());
        Icon fotoCapa = LbFoto.getIcon();
        byte[] capa = IconToBytes(fotoCapa);
        
        //boolean disponivel = true;
        
        try {
            
            interGraf.getGerDom().inserirLivro(codLivro, nomeLivro, genero, nomeAutor, 
                    nomeEditora,anoLivro,capa);
            JOptionPane.showMessageDialog(this, "Livro cadastrado!.");
            limparCampos();
            
        
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao inserir no banco!" + ex ,
                    "ERRO cadastro de livro", JOptionPane.ERROR_MESSAGE );
        }

    }//GEN-LAST:event_ButCadLivroActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        this.TxtAnoLivro.setText("");
        this.TxtAutorLivro.setText("");
        this.TxtEditoraLivro.setText("");
        this.TxtNomeLivro.setText("");
        this.TxtGeneroLivro.setText("");
        this.TxtCodLivro.setText("");
        
    }//GEN-LAST:event_BtLimparActionPerformed

    private void ButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButCancelarActionPerformed

    private void TxtCodLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodLivroActionPerformed

    private void ButFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButFotoActionPerformed
        JFileChooser janArq = new JFileChooser();
        
        janArq.setAcceptAllFileFilterUsed(false);
        janArq.setFileFilter( new FileNameExtensionFilter("Arquivos de imagem","png","bmp","jpg","gif") );
        
        if ( janArq.showOpenDialog(this) == JFileChooser.APPROVE_OPTION ) {
            // Pegar o arquivo selecionado
            File arq = janArq.getSelectedFile();
            
            // Converter o arquivo para imagem
            ImageIcon img = new ImageIcon ( arq.getPath() );
            
            mostrarFoto(img);
        }
    }//GEN-LAST:event_ButFotoActionPerformed
    
    private void mostrarFoto(ImageIcon imagem) {
        
        // Redimensionar
        imagem.setImage(imagem.getImage().getScaledInstance(LbFoto.getWidth(), LbFoto.getHeight(), Image.SCALE_DEFAULT));
        LbFoto.setText("");                
        LbFoto.setIcon(imagem);
    } 
    
     private void limparCampos() {
        this.TxtCodLivro.setText("");
        this.TxtGeneroLivro.setText("");
        this.TxtAnoLivro.setText("");
        this.TxtAutorLivro.setText("");
        this.TxtEditoraLivro.setText("");
        this.TxtNomeLivro.setText("");
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton ButCadLivro;
    private javax.swing.JButton ButCancelar;
    private javax.swing.JButton ButFoto;
    private javax.swing.JLabel LbCadLivroFrente;
    private javax.swing.JLabel LbCodLivro;
    private javax.swing.JLabel LbFoto;
    private javax.swing.JLabel PnAnoLivro;
    private javax.swing.JLabel PnAutorLivro;
    private javax.swing.JPanel PnCadLivroFrente;
    private javax.swing.JPanel PnCadLivroTotal;
    private javax.swing.JLabel PnEditoraLivro;
    private javax.swing.JLabel PnGeneroLivro;
    private javax.swing.JLabel PnNomeLivro;
    private javax.swing.JTextField TxtAnoLivro;
    private javax.swing.JTextField TxtAutorLivro;
    private javax.swing.JTextField TxtCodLivro;
    private javax.swing.JTextField TxtEditoraLivro;
    private javax.swing.JTextField TxtGeneroLivro;
    private javax.swing.JTextField TxtNomeLivro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}




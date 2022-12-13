package interfaceGraf;

import gerTarefas.GerenciadorInterfaceGraf;
import java.awt.print.Book;
import javax.swing.ImageIcon;

public class FMPrincipal extends javax.swing.JFrame {

    GerenciadorInterfaceGraf intGraf;

    public FMPrincipal(GerenciadorInterfaceGraf gerGraf) {
        initComponents();
        intGraf = gerGraf;
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagens/favconLogo.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MnCadPrincipal = new javax.swing.JMenu();
        MnItemCadCliente = new javax.swing.JMenuItem();
        MnItemCadLivro = new javax.swing.JMenuItem();
        MnCadReserva = new javax.swing.JMenuItem();
        MnConsultaPrincipal = new javax.swing.JMenu();
        MnItemConsultarReserv = new javax.swing.JMenuItem();
        MnConsultaCliente = new javax.swing.JMenuItem();
        MnDevolucao = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Book Store");

        PnPrincipal.setBackground(new java.awt.Color(246, 230, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N

        javax.swing.GroupLayout PnPrincipalLayout = new javax.swing.GroupLayout(PnPrincipal);
        PnPrincipal.setLayout(PnPrincipalLayout);
        PnPrincipalLayout.setHorizontalGroup(
            PnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPrincipalLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(487, 487, 487)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnPrincipalLayout.setVerticalGroup(
            PnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPrincipalLayout.createSequentialGroup()
                .addGroup(PnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPrincipalLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(PnPrincipalLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        MenuPrincipal.setBackground(new java.awt.Color(234, 214, 214));
        MenuPrincipal.setForeground(new java.awt.Color(255, 153, 153));

        MnCadPrincipal.setBackground(new java.awt.Color(255, 153, 153));
        MnCadPrincipal.setText("Cadastros");

        MnItemCadCliente.setText("Cadastrar Cliente");
        MnItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemCadClienteActionPerformed(evt);
            }
        });
        MnCadPrincipal.add(MnItemCadCliente);

        MnItemCadLivro.setText("Cadastrar Livro");
        MnItemCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemCadLivroActionPerformed(evt);
            }
        });
        MnCadPrincipal.add(MnItemCadLivro);

        MnCadReserva.setText("Cadastrar Reserva");
        MnCadReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadReservaActionPerformed(evt);
            }
        });
        MnCadPrincipal.add(MnCadReserva);

        MenuPrincipal.add(MnCadPrincipal);

        MnConsultaPrincipal.setText("Consultas");

        MnItemConsultarReserv.setText("Consultar Reserva");
        MnItemConsultarReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemConsultarReservActionPerformed(evt);
            }
        });
        MnConsultaPrincipal.add(MnItemConsultarReserv);

        MnConsultaCliente.setText("Consultar Cliente");
        MnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnConsultaClienteActionPerformed(evt);
            }
        });
        MnConsultaPrincipal.add(MnConsultaCliente);

        MenuPrincipal.add(MnConsultaPrincipal);

        MnDevolucao.setText("Relatórios");
        MenuPrincipal.add(MnDevolucao);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemCadClienteActionPerformed
        intGraf.abrirCadCliente();
    }//GEN-LAST:event_MnItemCadClienteActionPerformed

    private void MnItemCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemCadLivroActionPerformed
        intGraf.abrirCadLivros();
    }//GEN-LAST:event_MnItemCadLivroActionPerformed

    private void MnCadReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadReservaActionPerformed
        intGraf.abrirCadReserva();
    }//GEN-LAST:event_MnCadReservaActionPerformed

    private void MnItemConsultarReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemConsultarReservActionPerformed
        intGraf.abrirConsulta();
    }//GEN-LAST:event_MnItemConsultarReservActionPerformed

    private void MnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnConsultaClienteActionPerformed
        intGraf.abrirConsultaCliente();
    }//GEN-LAST:event_MnConsultaClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MnCadPrincipal;
    private javax.swing.JMenuItem MnCadReserva;
    private javax.swing.JMenuItem MnConsultaCliente;
    private javax.swing.JMenu MnConsultaPrincipal;
    private javax.swing.JMenu MnDevolucao;
    private javax.swing.JMenuItem MnItemCadCliente;
    private javax.swing.JMenuItem MnItemCadLivro;
    private javax.swing.JMenuItem MnItemConsultarReserv;
    private javax.swing.JPanel PnPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

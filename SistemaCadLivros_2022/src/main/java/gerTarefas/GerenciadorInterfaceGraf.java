/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerTarefas;

import interfaceGraf.DlgCadCliente;
import interfaceGraf.DlgCadLivros;
import interfaceGraf.DlgCadReserva;
import interfaceGraf.DlgConsulta;
import interfaceGraf.DlgConsultaCliente;

import interfaceGraf.FMPrincipal;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Livro;
import modelo.Reserva;

public class GerenciadorInterfaceGraf {
    
    private FMPrincipal principal;
    private DlgCadCliente cadCliente;
    private DlgCadLivros cadLivro; 
    private DlgCadReserva reserva;
    private DlgConsulta consulta;
    private DlgConsultaCliente consultaCli;
    
    private GerenciadorDominio gerDom;

    public GerenciadorInterfaceGraf() {
        
        gerDom = new GerenciadorDominio();
        principal = null;
        cadCliente = null;
        cadLivro = null;
        reserva = null;
        consulta = null;
        
        consultaCli = null;
        
    }

    // ABRIR JANELAS
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorInterfaceGraf.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(principal, "Erro ao abrir a janela " + classe.getName() );
            }
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void abrirJanPrincipal() {
       
        principal = new FMPrincipal(this);
        principal.setVisible(true);
    }
    
    public void abrirCadCliente(){        
       cadCliente = (DlgCadCliente) abrirJanela(principal, cadCliente, DlgCadCliente.class);
    }
    
    public void abrirCadLivros() {
        cadLivro = (DlgCadLivros) abrirJanela(principal, cadLivro, DlgCadLivros.class);
    }
    
    public Reserva abrirConsulta() {
        consulta = (DlgConsulta) abrirJanela(principal, consulta, DlgConsulta.class);
        return consulta.getReservaSelec();
    }
    
    public void abrirCadReserva() {
        reserva = (DlgCadReserva) abrirJanela(principal, reserva, DlgCadReserva.class );
    }
    
    public Cliente abrirConsultaCliente() {
        consultaCli = (DlgConsultaCliente) abrirJanela(principal, consulta, DlgConsultaCliente.class);
        return consultaCli.getCliente();
    }

    public FMPrincipal getPrincipal() {
        return principal;
    }

    public DlgCadCliente getCadCliente() {
        return cadCliente;
    }

    public DlgCadLivros getCadLivro() {
        return cadLivro;
    }

    public DlgCadReserva getReserva() {
        return reserva;
    }

    public DlgConsulta getConsulta() {
        return consulta;
    }

    public GerenciadorDominio getGerDom() {
        return gerDom;
    }
    
    public void inserirCliente(int codCliente, String nomeCli, String cpf, Date dataNasc, 
            char sexo, String cep, String endereco, String bairro, String cidade) throws ClassNotFoundException, SQLException{
        
        gerDom.inserirCliente(codCliente, nomeCli, cpf, dataNasc, sexo, cep, endereco, bairro, cidade);
        
    }
    
    public void inserirLivro(int codLivro, String nomeLivro, String genero, String autor, 
            String Editora, int ano, int QtdeExemplares, byte[] foto) throws ClassNotFoundException, SQLException{
        
        gerDom.inserirLivro(codLivro, nomeLivro, genero, autor, Editora, ano, foto);
        
    }
    
    
    public void carregarCombo(JComboBox combo, Class classe) {
        List lista;
        try {
            lista = gerDom.listar(classe);
            combo.setModel( new DefaultComboBoxModel( lista.toArray() )  );
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(principal, "Erro ao carregar o combo." + ex,
                    "Erro combo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void carregarLista(JList list, Class classe) {
        List lista;
        try {
            lista = gerDom.listar(classe);
            list.setModel( new DefaultComboBoxModel( lista.toArray() )  );
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(principal, 
                    "Erro ao carregar a lista." + ex,
                    "Erro lista", JOptionPane.ERROR_MESSAGE);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        
        GerenciadorInterfaceGraf gerIG = new GerenciadorInterfaceGraf();
        gerIG.abrirJanPrincipal();
    }
    
}



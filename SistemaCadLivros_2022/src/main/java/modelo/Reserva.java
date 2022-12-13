package modelo;

import gerTarefas.FuncoesUteis;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name= "Reservas", schema= "sistemaLivros")
public class Reserva implements Serializable{
    
    @ManyToOne (fetch = FetchType.EAGER )
    @JoinColumn(name = "codigoCliente")
    private Cliente cliente;
    
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "codigoLivro")
    private Livro livro;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private int codReserva;
    
    @Temporal ( TemporalType.DATE )
    private Date dataReserva;
    
    @Column
    private int valorMulta;
    
    @Temporal (TemporalType.DATE)
    private Date dataDevolucao;
    

    public Reserva() {
    }

    public Reserva(Cliente cliente, Livro livro, int codReserva, Date dataReserva, int valorMulta, Date dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.codReserva = codReserva;
        this.dataReserva = dataReserva;
        this.valorMulta = valorMulta;
        this.dataDevolucao = dataDevolucao;
        
    }
    
    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(int valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public Object[] toArray() throws ParseException {        
        return new Object[] {this, codReserva,dataReserva,dataDevolucao};
    }

    @Override
    public String toString() {
        return "" + codReserva;
    }
    
     
}

package modelo;

import gerTarefas.FuncoesUteis;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name= "Clientes", schema= "sistemaLivros")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int codCliente;
    
    @Column (length = 200)
    private String nomeCli;
    
    @Column ( unique = true, updatable = false, length = 14)
    private String cpf;
    
    @Temporal ( TemporalType.DATE )
    private Date dataNasc;
    
    @Column (length = 9)
    private char sexo;
    
    @Column
    private String cep;
    
    @Column
    private String endereco;
    
    @Column
    private String bairro;
    
    @Column
    private String cidade;
    
    @OneToMany (mappedBy="cliente", fetch = FetchType.LAZY )
    private List<Reserva> reservaCli = new ArrayList();
    
    public Cliente(){
        
    }
   
    public Cliente(int codCliente, String nomeCli, String cpf, Date dataNasc, 
            char sexo, String cep, String endereco, String bairro, String cidade) {
        this.codCliente = codCliente;
        this.nomeCli = nomeCli;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date  getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDtNascFormatada() throws ParseException {
        return FuncoesUteis.dateToStr(dataNasc);
    }

    @Override
    public String toString() {
        return nomeCli;
    }
    
    public Object[] toArray() throws ParseException {        
        return new Object[] {this,cpf,dataNasc,cidade};
    }
  
}

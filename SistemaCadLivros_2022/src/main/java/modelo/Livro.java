package modelo;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name= "Livros", schema= "sistemaLivros")
public class Livro implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int codLivro;
    
    @Column
    private String nomeLivro;
    
    @Column
    private String genero;
    
    @Column
    private String autor;
    
    @Column
    private String Editora;
    
    @Column
    private int ano;
    
    @Lob
    private byte[] foto;
    

    public Livro(){
        
    }

    public Livro(int codLivro, String nomeLivro, String genero, String autor, 
            String Editora, int ano, byte[] foto) {
        this.codLivro = codLivro;
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.autor = autor;
        this.Editora = Editora;
        this.ano = ano;
        this.foto =  foto;
        
    }
 
    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }


    
    @Override
    public String toString() {
        return nomeLivro;
    }
}


package gerTarefas;

import gerDados.ClienteDAO;
import gerDados.ConexaoHibernate;
import gerDados.LivroDAO;
import gerDados.ReservaDAO;
import gerDados.genericDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import modelo.Cliente;
import modelo.Livro;
import modelo.Reserva;


public class GerenciadorDominio {
    
    private genericDAO genDao;
    private ClienteDAO cliDao;
    private LivroDAO livroDao;
    private ReservaDAO reservaDao;
   

    public GerenciadorDominio(){
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDao = new genericDAO();
        cliDao = new ClienteDAO();
        livroDao = new LivroDAO();
        reservaDao = new ReservaDAO();

    }
    
    // ---- INSERIR ---- 
    
    public int inserirCliente(int codCliente, String nomeCli, String cpf, Date dataNasc, 
            char sexo, String cep, String endereco, String bairro, String cidade) throws ClassNotFoundException, SQLException  {

        Cliente cli = new Cliente(codCliente,nomeCli, cpf, dataNasc,
                sexo, cep, endereco,  bairro,  cidade);

        cliDao.inserir(cli);
        return cli.getCodCliente();
    }
    
    public int inserirLivro(int codLivro, String nomeLivro, String genero, String autor, 
            String Editora, int ano, byte [] foto) 
            throws ClassNotFoundException, SQLException {

        Livro liv = new Livro(codLivro,nomeLivro,genero,autor,Editora,
                ano, foto);

        livroDao.inserir(liv);
        return liv.getCodLivro();
    }
    
    public void inserirReserva(int idcliente, int codReserva, Date dataReserva, int valorMulta, 
            Date dataDevolucao, int idLivro) throws ClassNotFoundException, SQLException  {

        Reserva res =  new Reserva(cliDao.pesquisar(idcliente), livroDao.pesquisar(idLivro), 
                codReserva,dataReserva, valorMulta, dataDevolucao);
        reservaDao.inserir(res);
        
    }
    
    // ---- ALTERAR ----
    
    public void alterarCliente(Cliente cli, String nomeCli, String cpf, Date dataNasc, int codCliente, 
        char sexo, String cep, String endereco, String bairro, String cidade) throws ClassNotFoundException, SQLException  {

        cli.setNomeCli(nomeCli);
        cli.setCpf(cpf);
        cli.setDataNasc(dataNasc);
        cli.setCodCliente(codCliente);
        cli.setSexo(sexo);
        cli.setCep(cep);
        cli.setEndereco(endereco);
        cli.setBairro(bairro);
        cli.setCidade(cidade);
        
        cliDao.alterar(cli); 

    }
    
    public void alterarReserva(Reserva res,int codReserva, Date dataReserva, int valorMulta, 
            Date dataDevolucao) throws ClassNotFoundException, SQLException  {

        res.setCodReserva(codReserva);
        res.setDataDevolucao(dataDevolucao);
        res.setDataReserva(dataReserva);
        res.setValorMulta(valorMulta);
        
        
        reservaDao.alterar(res);

    }
    
    // ---- EXCLUIR ---- 
    public void excluir(Object obj) throws ClassNotFoundException, SQLException {
        genDao.excluir(obj);            
    }
    
    // ---- PESQUISAR ----
   public List<Reserva> pesquisarReserva(String pesq, int tipo) throws ClassNotFoundException, SQLException {
        
       switch (tipo) {
            case 0: return reservaDao.pesquisarPorNome(pesq);
            case 1: return reservaDao.pesquisarPorData(pesq);
            default: return null;
        }
   
   }
   public List<Cliente> pesquisarCliente(String pesq, int tipo) throws ClassNotFoundException, SQLException {
        
       switch (tipo) {
            case 0: return cliDao.pesquisarPorNomeCli(pesq);
            case 1: return cliDao.pesquisarPorDataNasc(pesq);
            default: return null;
        }
   
   }
   
   // ---- LISTAR ---
   
   public List listar(Class classe) throws ClassNotFoundException, SQLException {
        return genDao.listar( classe );
    }
}

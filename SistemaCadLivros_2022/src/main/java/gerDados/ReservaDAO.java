package gerDados;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import modelo.Cliente;
import modelo.Reserva;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ReservaDAO extends genericDAO {
    
    public Reserva pesquisar(int idReserva) {
        Session session = ConexaoHibernate.getSessionFactory().openSession();
        Reserva res = null;
        res = session.get(Reserva.class, idReserva);
        session.close();
        return res;
    }
    
    private List<Reserva> pesquisar(String pesq, int tipo)  {
                
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Reserva.class);
            
            Root tabela = consulta.from(Reserva.class);
            
            Predicate restricoes = null;
            switch ( tipo ) {
                case 1: restricoes = builder.like(tabela.get("cliente").get("nomeCli"), pesq+"%");
                        break;       
                                        
                case 2: Expression expr = builder.function("month", Integer.class, tabela.get("dataReserva"));
                        restricoes = builder.equal(expr, pesq);
                        break;
            }

            consulta.where(restricoes);
            // EXECUTAR
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
    }
    
    public List<Reserva> pesquisarPorNome(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq, 1);
    }
    
    public List<Reserva> pesquisarPorData(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq, 2);
    }
   
}

package gerDados;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import modelo.Cliente;
import modelo.Livro;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class LivroDAO extends genericDAO{
    
    public Livro pesquisar(int idLivro) {
        Session session = ConexaoHibernate.getSessionFactory().openSession();
        Livro liv = null;
        liv = session.get(Livro.class, idLivro);
        session.close();
        return liv;
    }
   
    private List<Cliente> pesquisar(String pesq, int tipo)  {
                
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Cliente.class);
            
            Root tabela = consulta.from(Cliente.class);
            
            Predicate restricoes = null;
            switch ( tipo ) {
                case 1: restricoes = builder.like(tabela.get("nome"), pesq+"%");
                        break;      
                                        
                case 2: Expression expr = builder.function("month", Integer.class, tabela.get("dtNasc") );
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
    
    public List<Cliente> pesquisarPorLivro(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq, 2);
    }
    
}

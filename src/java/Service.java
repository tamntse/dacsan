
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.persistence.EntityManager;
import javax.persistence.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Service implements Serializable{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEmoMysqlPU");
       EntityManager em = emf.createEntityManager();
    
    public List getAll() {
        String jpql = "SELECT d FROM Donhang d order by d.id desc";
        Query query = em.createQuery(jpql);
        List result = query.getResultList();
        return result;
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}

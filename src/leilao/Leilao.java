/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import leilao.modelo.Categoria;


/**
 *
 * @author tarle
 */
public class Leilao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c = new Categoria(null, "Teste categoria");
        Categoria c1 = new Categoria(null, "Teste categoria 2");
        Categoria c2 = new Categoria(null, "Teste categoria 3");
        
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("LeilaoPU");
        
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();
        
        
        Query q = em.createNamedQuery("Categoria.findAll");
        List<Categoria> categorias = q.getResultList();
        
        for(Categoria aux : categorias)
            System.out.println(aux);
        
        em.close();
        factory.close();
        
        //System.out.println(c);
    }
    
}

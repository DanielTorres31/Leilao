/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
        
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("LeilaoPU");
        
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        em.close();
        factory.close();
        
        System.out.println(c);
    }
    
}

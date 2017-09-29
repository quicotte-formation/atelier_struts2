/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author IB
 */
public class FilmService {
    
    public List<Film> lister(){
        
        EntityManager em = Persistence.
                createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT f FROM Film f ORDER BY f.titre")
                .getResultList();
    }

    public void ajouterFilm(Film film) {
        
        EntityManager em = Persistence.
                createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(film);
        em.getTransaction().commit();
    }
}

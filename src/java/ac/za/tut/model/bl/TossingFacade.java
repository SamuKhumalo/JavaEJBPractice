/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.Tossing;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author samuk
 */
@Stateless
public class TossingFacade extends AbstractFacade<Tossing> implements TossingFacadeLocal {

    @PersistenceContext(unitName = "Paper3EJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TossingFacade() {
        super(Tossing.class);
    }

    @Override
    public Integer numGame() {
        Query query = em.createQuery("SELECT COUNT(t) FROM Tossing t");
        Long cnt = (Long) query.getSingleResult();

        return cnt.intValue();
    }

    @Override
    public Long playerWon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> playerGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tossing> getStats(Long id) {
        Query query = em.createQuery("SELECT t FROM Tossing t WHERE t.id=?1");
        query.setParameter(1, id);
        List<Tossing> tos = query.getResultList();

        return tos;
    }

    @Override
    public List<Tossing> getNamesWon() {
        Query query = em.createQuery("SELECT (t.name) FROM Tossing t WHERE t.playerWon >0");
        List<Tossing> tos = query.getResultList();

        return tos;
    }

}

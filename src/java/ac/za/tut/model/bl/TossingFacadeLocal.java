/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.Tossing;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author samuk
 */
@Local
public interface TossingFacadeLocal {

    void create(Tossing tossing);

    void edit(Tossing tossing);

    void remove(Tossing tossing);

    Tossing find(Object id);

    List<Tossing> findAll();

    List<Tossing> findRange(int[] range);

    int count();
    
    //JPQL
    Integer numGame();
    Long playerWon();
    List<String>playerGuesses();
    
    List<Tossing> getStats(Long id);
    List<Tossing> getNamesWon();
    
    
}

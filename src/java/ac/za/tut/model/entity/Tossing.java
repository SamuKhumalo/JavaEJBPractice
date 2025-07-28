/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author samuk
 */
@Entity
public class Tossing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer numGames;
    private Integer siriWon;
    private Integer playerWon;
    List<String> tossesBySiri;
    List<String> guessesByPlayer;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Tossing() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumGames() {
        return numGames;
    }

    public void setNumGames(Integer numGames) {
        this.numGames = numGames;
    }

    public Integer getSiriWon() {
        return siriWon;
    }

    public void setSiriWon(Integer siriWon) {
        this.siriWon = siriWon;
    }

    public Integer getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(Integer playerWon) {
        this.playerWon = playerWon;
    }

  

    public List<String> getTossesBySiri() {
        return tossesBySiri;
    }

    public void setTossesBySiri(List<String> tossesBySiri) {
        this.tossesBySiri = tossesBySiri;
    }

    public List<String> getGuessesByPlayer() {
        return guessesByPlayer;
    }

    public void setGuessesByPlayer(List<String> guessesByPlayer) {
        this.guessesByPlayer = guessesByPlayer;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tossing)) {
            return false;
        }
        Tossing other = (Tossing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.model.entity.Tossing[ id=" + id + " ]";
    }
    
}

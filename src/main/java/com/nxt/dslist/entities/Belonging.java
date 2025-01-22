package com.nxt.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(){}

    public Belonging(Game game, GameList list, Integer positiion) {
        id.setGame(game);
        id.setGameList(list);;
        this.position = positiion;
    }

    public BelongingPK getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public void setPosition(Integer positiion) {
        this.position = positiion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Belonging other = (Belonging) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}

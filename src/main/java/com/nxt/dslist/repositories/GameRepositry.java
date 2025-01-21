package com.nxt.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nxt.dslist.entities.Game;

public interface GameRepositry extends JpaRepository<Game, Long> {

}

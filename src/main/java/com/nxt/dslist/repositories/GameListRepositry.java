package com.nxt.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nxt.dslist.entities.GameList;


public interface GameListRepositry extends JpaRepository<GameList, Long> {

}

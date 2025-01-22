package com.nxt.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxt.dslist.dto.GameListDTO;
import com.nxt.dslist.entities.GameList;
import com.nxt.dslist.repositories.GameListRepositry;

@Service
public class GameListService {

    @Autowired
    private GameListRepositry gameListRepositry;

    @Transactional
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepositry.findAll(); 
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}

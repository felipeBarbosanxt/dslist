package com.nxt.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxt.dslist.dto.GameDTO;
import com.nxt.dslist.dto.GameMinDTO;
import com.nxt.dslist.entities.Game;
import com.nxt.dslist.projections.GameMinProjection;
import com.nxt.dslist.repositories.GameRepositry;

@Service
public class GameService {

    @Autowired
    private GameRepositry gameRepositry;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepositry.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepositry.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepositry.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}

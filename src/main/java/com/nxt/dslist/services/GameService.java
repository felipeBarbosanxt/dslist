package com.nxt.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nxt.dslist.dto.GameMinDTO;
import com.nxt.dslist.repositories.GameRepositry;

@Service
public class GameService {

    @Autowired
    private GameRepositry gameRepositry;

    public List<GameMinDTO> findAll(){
        var result = gameRepositry.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}

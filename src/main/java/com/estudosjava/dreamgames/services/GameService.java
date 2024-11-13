package com.estudosjava.dreamgames.services;


import com.estudosjava.dreamgames.dto.GameMinDto;
import com.estudosjava.dreamgames.entities.Game;
import com.estudosjava.dreamgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();


    }
}

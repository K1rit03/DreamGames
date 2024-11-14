package com.estudosjava.dreamgames.services;


import com.estudosjava.dreamgames.dto.GameDTO;
import com.estudosjava.dreamgames.dto.GameMinDto;
import com.estudosjava.dreamgames.entities.Game;
import com.estudosjava.dreamgames.repositories.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return  new GameDTO(result);

    }
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();


    }
}

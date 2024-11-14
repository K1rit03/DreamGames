package com.estudosjava.dreamgames.controllers;

import com.estudosjava.dreamgames.dto.GameDTO;
import com.estudosjava.dreamgames.dto.GameMinDTO;
import com.estudosjava.dreamgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    // Adicione a anotação @GetMapping para que o método seja um endpoint de GET
    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}

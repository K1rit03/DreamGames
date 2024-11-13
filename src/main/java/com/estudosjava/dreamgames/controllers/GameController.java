package com.estudosjava.dreamgames.controllers;

import com.estudosjava.dreamgames.dto.GameMinDto;
import com.estudosjava.dreamgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    // Adicione a anotação @GetMapping para que o método seja um endpoint de GET
    @GetMapping
    public List<GameMinDto> findAll() {
        return gameService.findAll();
    }
}
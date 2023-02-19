package com.study.hexagonal.adapter.controller;

import com.study.hexagonal.domain.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController
{
    private final GameService gameService;

    public GameController(
            GameService gameService
    ) {
        this.gameService = gameService;
    }

    @GetMapping("{id}")
    public Object get(@PathVariable("id") Long id) {
        return null;
    }

}

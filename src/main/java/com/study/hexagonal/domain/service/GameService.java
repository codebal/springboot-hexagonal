package com.study.hexagonal.domain.service;

import com.study.hexagonal.domain.model.Game;
import com.study.hexagonal.port.IGameReader;
import com.study.hexagonal.port.IGameWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

    private final IGameReader gameReader;
    private final IGameWriter gameWriter;


    public Game get(Long id) {
        return gameReader.get(id);
    }

}

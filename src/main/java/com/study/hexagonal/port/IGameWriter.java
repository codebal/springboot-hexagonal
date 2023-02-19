package com.study.hexagonal.port;

import com.study.hexagonal.domain.model.Game;

public interface IGameWriter {
    void save(Game game);
}

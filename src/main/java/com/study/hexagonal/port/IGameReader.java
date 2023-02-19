package com.study.hexagonal.port;

import com.study.hexagonal.domain.model.Game;

public interface IGameReader {
    Game get(Long id);
}

package com.study.hexagonal.adapter.persistence;

import com.study.hexagonal.domain.model.Game;
import com.study.hexagonal.port.IGameReader;
import com.study.hexagonal.port.IGameWriter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GameRepository implements IGameReader, IGameWriter {

    private Map<Long, Game> map;
    public GameRepository() {
        map = new HashMap<>();
    }

    @Override
    public Game get(Long id) {
        return map.get(id);
    }

    @Override
    public void save(Game game) {
        map.put(game.getId(), game);
    }
}

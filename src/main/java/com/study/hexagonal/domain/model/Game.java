package com.study.hexagonal.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Game {
    private final Long id;
    private final String name;
}

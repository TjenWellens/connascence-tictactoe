package com.example.demo;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Player {
    private final String name;
    private final Token token;

    public Player(String name, Token token) {
        this.name = name;
        this.token = token;
    }
}

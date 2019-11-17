package com.example.demo;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players = new ArrayList<>();
    private boolean hasStarted = false;

    public void addPlayer(String name, Token token) {
        final Player newPlayer = new Player(name, token);
        players.add(newPlayer);
    }

    public List<Player> getPlayers() {
        return players;
    }

    @SneakyThrows
    public void start() {
        if(hasStarted){
            throw new IllegalStateException("game already started");
        }
        hasStarted = true;
        Thread.sleep(1000);
    }

    public boolean isBeingPlayed() {
        return hasStarted;
    }
}

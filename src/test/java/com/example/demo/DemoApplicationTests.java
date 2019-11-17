package com.example.demo;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class DemoApplicationTests {

    @Test
    void addPlayer() {
        Game game = new Game();
        final String name = "Tjen";
        final Token token = Token.X;

        game.addPlayer(name, token);

        List<Player> players = game.getPlayers();

        assertThat(players).asList().containsExactly(new Player(name, token));
    }

    @Test
    void start() {
        final Game game = new Game();

        game.start();

        assertThat(game.isBeingPlayed()).isTrue();
    }

    @Test
    void newGameIsNotStarted() {
        final Game game = new Game();

        assertThat(game.isBeingPlayed()).isFalse();
    }

    @Test
    void gameCannotBeStartedTwice() {
        final Game game = new Game();

        game.start();

        assertThatThrownBy(() -> game.start()).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void gameNeeds2Players() {
        final Game game = new Game();

        assertThatThrownBy(() -> game.start()).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void winner() {
        throw new NotImplementedException();
    }

}

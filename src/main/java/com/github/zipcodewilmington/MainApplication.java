package com.github.zipcodewilmington;


import com.github.zipcodewilmington.casino.games.roulette.RouletteBall;
import com.github.zipcodewilmington.casino.games.roulette.RouletteGame;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        new Casino().run();
        RouletteGame game = new RouletteGame();
        game.run();
//        new Casino().run();
    }
}

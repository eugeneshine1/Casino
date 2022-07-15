package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SlotsGameTest {

    @Test
    public void randomNumber() {
        Random rand = new Random(1);
        int expected = rand.nextInt(10);
        int actual = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SlotsGameTest() {
        SlotsGame test = new SlotsGame();
        CasinoAccount testAccount = new CasinoAccount("Fred", "Bob", 5000);
        SlotsPlayer player = new SlotsPlayer(testAccount);
        test.add(player);
        test.run();
    }

    @Test
    public void pullLeverTest() {

    }
}

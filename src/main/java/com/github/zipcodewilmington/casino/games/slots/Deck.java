package com.github.zipcodewilmington.casino.games.slots;

import java.util.ArrayList;
import java.util.List;

public abstract class Deck<T extends Card> {
    private List<T> cards;

    public Deck() {
        this.cards = new ArrayList<T>();
    }

    public List<T> getCards(){
        return cards;
    }

    public void setCards(List<T> cards) {
        this.cards = cards;
    }
}

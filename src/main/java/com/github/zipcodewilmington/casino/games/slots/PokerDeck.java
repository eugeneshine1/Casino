package com.github.zipcodewilmington.casino.games.slots;

public class PokerDeck extends Deck<PokerCard>{
    private final String[] SUITS = {"SPADES", "HEARTS", "DIAMONDS"};
    private final int MIN_RANK = 1;
    private final int MAX_RANK = 10;

    public PokerDeck() {
        super();

        for (String suit : SUITS) {
            for (int rank = MIN_RANK; rank <= MAX_RANK; rank++){
                this.getCards().add(new PokerCard(suit, rank));
            }
        }
    }
}

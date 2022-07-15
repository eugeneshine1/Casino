package com.github.zipcodewilmington.casino.games.card;

import com.github.zipcodewilmington.casino.games.card.deck.Deck;

public class Card {

    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;


    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return rank.getRankValue();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return ("[" + rank + " of " + suit + "] (" + this.getValue() + ")");
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }
}




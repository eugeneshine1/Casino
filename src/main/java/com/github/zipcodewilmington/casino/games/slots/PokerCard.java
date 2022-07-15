package com.github.zipcodewilmington.casino.games.slots;

public class PokerCard implements Card{
    private String suit;
    private int rank;

    public PokerCard(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }


    @Override
    public String toString() {
        return String.format("Card: %s and the rank is %d", this.getSuit(), this.getRank());
    }
}

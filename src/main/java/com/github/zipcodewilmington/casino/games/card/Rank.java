package com.github.zipcodewilmington.casino.games.card;

public enum Rank {
    ACE("Ace", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10);


    private final String rankName;
    private final int rankValue;

    public String getRankName() {
        return rankName;
    }

    public int getRankValue() {
        return rankValue;
    }

    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }
}
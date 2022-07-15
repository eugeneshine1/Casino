package com.github.zipcodewilmington.casino.games.card.deck;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.blackjack.BlackjackPlayer;
import com.github.zipcodewilmington.casino.games.card.Card;
import com.github.zipcodewilmington.casino.games.card.Rank;
import com.github.zipcodewilmington.casino.games.card.Suit;

import java.util.ArrayList;
import java.util.Random;

public class Deck implements GameInterface {
    private ArrayList<Card> deck = new ArrayList<>();
    private Deck comingFrom;
    private Card addCard;



    public Deck() {
        super();
        this.fullDeck();
        this.shuffle();
    }

    public void fullDeck() {
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < 4; j++) {
                this.deck.add(new Card(Suit.values()[j], Rank.values()[i]));
            }
        }
    }

    public ArrayList<Card> shuffle() {
        ArrayList<Card> tempDeck = new ArrayList<Card>();
        Random random = new Random();
        int randomCard;
        int origSize = this.deck.size();
        for (int i = 0; i < origSize; i++) {
            randomCard = random.nextInt(this.deck.size());
            tempDeck.add(this.deck.get(randomCard));
            this.deck.remove(randomCard);
        }
        this.deck = tempDeck;
        return tempDeck;
    }


    public Card getCard(int i) {
        return this.deck.get(0);
    }

    public void addCard(Card addCard) {
        this.deck.add(addCard);
    }

    public void draw(BlackjackPlayer dealer) {
        this.deck.remove(0);
        System.out.println(this.deck.get(0));
    }

    private void removeCard(int i) {
    }


    public Deck(Suit suit, Rank rank) {
        super();
        deck = new ArrayList<>();
    }



    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }

    @Override
    public void bet() {

    }

    @Override
    public void continueGambling() {

    }

    @Override
    public void lose() {

    }

    @Override
    public void outcome() {

    }

    @Override
    public void bonus() {

    }

    @Override
    public void enterGame() {

    }

    @Override
    public void kickout() {

    }

    @Override
    public void account() {

    }

    @Override
    public void moneyCheck() {

    }

    @Override
    public void music() {

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


    //    public int getHandValue(){
//        int value = 0;
//        int aces = 0;
//
//        for (int i = 0; i <ArrayList<Deck
//            }
        }






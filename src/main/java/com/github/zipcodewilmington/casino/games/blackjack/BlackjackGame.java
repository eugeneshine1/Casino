package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.card.Hand;
import com.github.zipcodewilmington.casino.games.card.Shoe;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BlackjackGame extends Deck implements GameInterface {

    private Hand dealersHand = new Hand();
    private Hand playerHand = new Hand();
    private Shoe shoe = new Shoe();
    private Boolean isRunning = false;
    private Boolean dealerDefaultWin = false;
    private Boolean dealersTurn = false;

    private final IOConsole console = new IOConsole(AnsiColor.AUTO);
    public LinkedList<BlackjackPlayer> blackjackPlayer = new LinkedList<>();



    public void add(PlayerInterface player) {
        blackjackPlayer.add((BlackjackPlayer) player);

    }

    public void  run(){
        this.initializeNewGame();

        while(this.isRunning == true){
            System.out.println("Successfully started game");
            this.advanceTurn();
            this.isRunning = false;
        }

//        this.determineWinner();
//        System.out.println((this.printEndingMessage()));

    }

    private void advanceTurn() {
        if(this.dealersTurn){

        } else {
            //player's code
            console.println("Player's Turn. Current Hand:");
            System.out.println(this.playerHand.toString());
            if(this.console.getIntegerInput("Please enter your choice\n1: Hit\n2: Stand") == 1){
                this.playerHand.addCard(shoe.drawNext());
                System.out.println("Added card");
            } else {
                //if something stand related needs to happen, set up here?
                System.out.println("chose to stand");
            }
        }

        this.dealersTurn = !this.dealersTurn;
    }

    public void initializeNewGame() {
        this.initializeHands();
        this.dealInitialHands();
        this.checkDealerWinDefault();
        this.isRunning = true;

    }

    private void checkDealerWinDefault() {
        this.dealerDefaultWin = false;

        if(this.dealersHand.getCards().get(0).getRank().getRankName().equals("Ace")){
            this.dealerDefaultWin = this.dealersHand.getCards().get(1).getRank().getRankValue() == 10;
        }
    }

    private void dealInitialHands() {
        System.out.println("Hitting dealInitial Hands");
        this.playerHand.addCard(shoe.drawNext());
        this.dealersHand.addCard(shoe.drawNext());
        this.playerHand.addCard(shoe.drawNext());
        this.dealersHand.addCard(shoe.drawNext());
        this.dealersHand.getCards().get(1).setFaceUp(true);
    }

    public void initializeHands() {
        System.out.println("Hitting initialize hands");
        this.dealersHand = new Hand();
        this.playerHand = new Hand();
    }

    public String printEndingMessage() {
        return "Game Over";
    }

    public void blackjack(){
    }

    public Scanner setBet(){

        int bet;
        String input = console.getStringInput("Minimum bet is $5!");
        Scanner userInput = new Scanner(System.in);
        userInput.nextDouble();
        if (userInput.nextDouble() < 5){
            System.out.println("You must bet $5 or more");
        } else if (userInput.nextDouble() > 5) {
            System.out.println("You bet " + userInput);

        }
        return userInput;


    }

    public void betOption(){
       // Scanner userInput = new Scanner(System.in);
       // if ( i!= 21) {
         //   System.out.println("Would you like to Hit or Stand?");
           // userInput.nextLine();
        //if (userInput == Hit){
          //  draw();
        //} else {

       // }


      //  }

    }



        public void win(PlayerInterface player, int winnings){
//       //collect player winnings
            //add to account
    }
        public void losings(PlayerInterface player, int losings){
        //collect losings
            //deduct from account
        }

    public Shoe getShoe() {
        return null;

    }




    @Override
    public void remove(PlayerInterface player) {
        blackjackPlayer.add((BlackjackPlayer) player);
    }



            public String toString() {
                return null;
            }

        }





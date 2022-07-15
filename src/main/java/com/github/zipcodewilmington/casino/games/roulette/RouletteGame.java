package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import javax.xml.crypto.NoSuchMechanismException;
import java.util.LinkedList;
import java.util.Scanner;

public class RouletteGame implements GameInterface {

    BallNumberGenerator gen = new BallNumberGenerator() {
                @Override
        public void add(PlayerInterface player) {

        }

        @Override
        public void remove(PlayerInterface player) {

        }

        @Override
        public void run() {

        }
    };
        Scanner input = new Scanner(System.in);
        int bet;
        int betOption;

        int money = 1000;
        int roundCounter = 1;

        int randomNumber = 0;


        private final IOConsole console = new IOConsole(AnsiColor.RED);

        public LinkedList<RoulettePlayer> roulettePlayers = new LinkedList<>();

        @Override
        public void add(PlayerInterface player) {
            roulettePlayers.add((RoulettePlayer) player);
        }

        @Override
        public void remove(PlayerInterface player) {
            roulettePlayers.remove((RoulettePlayer) player);
        }

        @Override
        public void run() throws NumberFormatException {

            printSummary();


            while (money > 0) {
                bet = console.getIntegerInput("Please input the amount you desire to bet.");

                betOption = console.getIntegerInput("Please select bet option");
                if(bet == 0 && betOption != 0) {
                    bet = console.getIntegerInput("INVALID! Please input the amount you desire to bet.");
                    betOption = console.getIntegerInput("Please select bet option");
                }
                winningMethod();
                printHelp();
                console.print("Results: " + gen.generator().getColor());

                console.print("Your bank account: " + money + "\n");
                roundCounter++;

                console.print("Rounds: " + roundCounter + "\n");

                if (money <= 0)
                    break;
                if(bet == 0 && betOption != 0)
                    break;
            }

        }

        public void printSummary() {
            System.out.println("Welcome to Roulette!");
            System.out.println("Below is the pay out of your desired option.");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| Bet              | Payout          | Probability   |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [3]Odd           | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [4]Even          | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [5]Single number | 35 : 1          | ~2.6%         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [6]First Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [7]Second Twelve | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [8]Third Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [9]  No. 1 - 18  | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [10] No. 19 - 36 | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [0] Insert 0 [help] for further assistance         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("                                                      ");
            System.out.println("Please decide how much you want to bet and chose bet. ");
            System.out.println("                                                      ");
        }

        public void printHelp() {
            if (betOption == 0 && bet == 0) {
                System.out.println("Here is the help desk.");
                System.out.println("Below is the pay out of your desired option.");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| Bet              | Payout          | Probability   |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [3]Odd           | 1 : 1           | ~47.3%        |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [4]Even          | 1 : 1           | ~47.3%        |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [5]Single number | 35 : 1          | ~2.6%         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [6]First Twelve  | 2 : 1           | ~31.5         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [7]Second Twelve | 2 : 1           | ~31.5         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [8]Third Twelve  | 2 : 1           | ~31.5         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [9]  No. 1 - 18  | 1 : 1           | ~31.5         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [10] No. 19 - 36 | 1 : 1           | ~31.5         |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("| [0] Type 0 [ for help] in both inputs              |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("                                                      ");
                System.out.println("Please decide how much you want to bet and chose bet. ");
                System.out.println("                                                      ");
            }
        }

        public void winningMethod() {
            //Bet is red and received a 1 : 1 payout.
//        if(betOption.equals("1") && bet.equals(gen.generator())){
//           bet += money;
            //Bet is red and receive a 1 : 1 payout.
            if (betOption == 1 &&
                    gen.generator().getColor().equals(gen.colorResult(gen.getNumber()))) this.money+=bet;
            //Bet is black and receive a 1 : 1 payout.
            if (betOption == 2 && gen.generator().equals("black")) money += bet;
            //Bet is odd and receive a 1 : 1 payout.
            if (betOption == 3 && gen.generator().equals("odd")) money += bet;
            //Bet is even and receive a 1 : 1 payout.
            if (betOption == 4 && gen.generator().equals("even")) money += bet;
            //Bet is Single Number and receive a 35 : 1 payout.
            if (betOption == 5 && gen.generator().equals("single number")) money += bet * 35;
            //Bet is First Twelve and receive a 2 : 1 payout.
            if (betOption == 6 && gen.generator().equals("First Twelve")) money += bet * 2;
            //Bet is Second Twelve and receive a 2 : 1 payout.
            if (betOption == 7 && gen.generator().equals("Second Twelve")) money += bet * 2;
            //Bet is Third Twelve and receive a 2 : 1 payout.
            if (betOption == 8 && gen.generator().equals("Third Twelve")) money += bet * 2;
            //Bet is No. 1 - 18 and receive a 1 : 1 payout.
            if (betOption == 9 && gen.generator().equals("No.1 -18")) money += bet;
            //Bet is No. 19 - 36 and receive a 1 : 1 payout.
            if (betOption == 10 && gen.generator().equals("No. 19 - 36")) money += bet;
                //Lose bet
            else money -= bet;
        }
//    public void setBet(){
//        bet = console.getStringInput("Please input the amount you desire to bet.");}
    }
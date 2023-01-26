package c322.labs.lab1;

import java.util.Random;

public class GuessGame {

    public static void startGame(){
        System.out.println("I'm thinking of a number between 0 and 9...");

        Random random = new Random();
        int answer = random.nextInt(10);

        System.out.println("Number to guess is "+ answer);
        int guess1 = Player.Player1();
        int guess2 = Player.Player2();
        int guess3 = Player.Player3();

        boolean bool1 = false;
        boolean bool2 = false;
        boolean bool3 = false;


        if (answer == guess1) {
            bool1 = true;
            System.out.println("Player one got it right? " + bool1);
        } else {
            bool1 = false;
            System.out.println("Player one got it right? " + bool1);
        }

        if (answer == guess2) {
            bool2 = true;
            System.out.println("Player two got it right?" + bool2);
        } else {
            bool2 = false;
            System.out.println("Player two got it right?" + bool2);
        }

        if (answer == guess3) {
            bool3 = true;
            System.out.println("Player three got it right?" + bool3);
        } else {
            bool3 = false;
            System.out.println("Player three got it right?" + bool3);
        }

        while(!(bool1 && bool2 && bool3)) {
            if(!(bool1 && bool2 && bool3)) {
                System.out.println("I'm guessing " + guess1);
                System.out.println("I'm guessing " + guess2);
                System.out.println("I'm guessing " + guess3);
                System.out.println("Player one guessed " + guess1);
                System.out.println("Player two guessed " + guess2);
                System.out.println("Player three guessed " + guess3);
                System.out.println("Players will have to try again.");
            }else{
                System.out.println("I'm guessing " + guess1);
                System.out.println("I'm guessing " + guess2);
                System.out.println("I'm guessing " + guess3);
                System.out.println("Player one guessed " + guess1);
                System.out.println("Player two guessed " + guess2);
                System.out.println("Player three guessed " + guess3);
                System.out.println("We have a winner");
            }
        }
    }
}


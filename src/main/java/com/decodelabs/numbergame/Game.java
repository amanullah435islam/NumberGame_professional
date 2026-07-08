package com.decodelabs.numbergame;

import java.util.Random;

public class Game {

    private Difficulty difficulty = new Difficulty();

    private InputHelper inputHelper = new InputHelper();

    private Random random = new Random();



    public void startGame() {

        int maxNumber = difficulty.selectDifficulty();

        int randomNumber = random.nextInt(maxNumber) + 1;

        int attempts = 0;

        while (true) {

            System.out.print("Enter Guess : ");

            int guess = inputHelper.readInt();

            attempts++;

            if (guess > randomNumber) {

                System.out.println("Too High!");

            } else if (guess < randomNumber) {

                System.out.println("Too Low!");

            } else {

                System.out.println();
                System.out.println("Congratulations!");
                System.out.println("Correct Number : " + randomNumber);
                System.out.println("Attempts : " + attempts);

                break;

            }

        }

    }
}

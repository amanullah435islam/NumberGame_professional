package com.decodelabs.numbergame;

import java.util.Random;

public class Game {

    private Difficulty difficulty = new Difficulty();

    private InputHelper inputHelper = new InputHelper();

    private Random random = new Random();

    private Score score = new Score();

    public void startGame() {

        int maxNumber = difficulty.selectDifficulty();

        int randomNumber = random.nextInt(maxNumber) + 1;

        int attempts = 0;

        while (true) {

            int guess = inputHelper.readInt("Enter Guess : ");

            attempts++;

            if (guess > randomNumber) {

                System.out.println("Too High!");

            } else if (guess < randomNumber) {

                System.out.println("Too Low!");

            } else {

                int finalScore = score.calculateScore(attempts);

                System.out.println();
                System.out.println("Congratulations!");
                System.out.println("Correct Number : " + randomNumber);
                System.out.println("Attempts : " + attempts);
                System.out.println("Score : " + finalScore);

                break;

            }

        }

    }
}

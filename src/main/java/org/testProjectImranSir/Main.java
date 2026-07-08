package org.testProjectImranSir;

import com.decodelabs.numbergame.Difficulty;
import com.decodelabs.numbergame.Game;
import com.decodelabs.numbergame.InputHelper;
import com.decodelabs.numbergame.Score;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Difficulty difficulty = new Difficulty();

        InputHelper inputHelper = new InputHelper();

        Score score = new Score();

        Random random = new Random();

        Game game = new Game(
                difficulty,
                inputHelper,
                score,
                random);

        boolean playAgain = true;

        while (playAgain) {

            game.startGame();

            playAgain = inputHelper.readYesOrNo(
                    "Do you want to play again? (Y/N): ");

        }

        System.out.println();
        System.out.println("Thank you for playing!");

    }



}


package org.testProjectImranSir;

import com.decodelabs.numbergame.Difficulty;
import com.decodelabs.numbergame.Game;
import com.decodelabs.numbergame.InputHelper;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        boolean playAgain = true;

        while (playAgain) {

            game.startGame();

            System.out.println();
            System.out.print("Do you want to play again? (Y/N): ");

            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Y")) {

                playAgain = true;

            } else {

                playAgain = false;

            }

        }

        System.out.println();
        System.out.println("Thank you for playing!");
        scanner.close();

    }



}


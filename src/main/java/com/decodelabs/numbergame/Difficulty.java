package com.decodelabs.numbergame;

import java.util.Scanner;

public class Difficulty {


    private InputHelper inputHelper = new InputHelper();


    public int selectDifficulty() {

        while (true) {

            System.out.println("=================================");
            System.out.println("        NUMBER GAME");
            System.out.println("=================================");

            System.out.println("Choose Difficulty");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");

            System.out.print("Enter Choice : ");

            int choice = inputHelper.readInt();

            switch (choice) {

                case 1:
                    return 50;

                case 2:
                    return 100;

                case 3:
                    return 500;

                default:
                    System.out.println();
                    System.out.println("Invalid Choice!");
                    System.out.println("Please enter 1, 2 or 3.");
                    System.out.println();
            }

        }

    }

}

package com.decodelabs.numbergame;

import java.util.Scanner;

public class InputHelper {

    private Scanner scanner = new Scanner(System.in);



    public int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();

            } else {

                System.out.println("Invalid Input!");
                System.out.println("Please enter a valid number.");
                scanner.next();

            }

        }

    }



    public String readString(String message) {

        System.out.print(message);

        return scanner.next().trim();

    }



    public boolean readYesOrNo(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.next().trim();

            if (input.equalsIgnoreCase("Y")) {
                return true;
            }

            if (input.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("Invalid choice!");
            System.out.println("Please enter Y or N.");
        }

    }
    }

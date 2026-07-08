package com.decodelabs.numbergame;

import java.util.Scanner;

public class InputHelper {

    private Scanner scanner = new Scanner(System.in);



    public int readInt() {

        while (true) {

            if (scanner.hasNextInt()) {

                return scanner.nextInt();

            } else {

                System.out.println();
                System.out.println("Invalid Input!");
                System.out.println("Please enter a valid number.");

                // ami define korlam::::::
                System.out.print("Enter Choice : ");

                scanner.next();

            }

        }

    }
}

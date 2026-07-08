package com.decodelabs.numbergame;

import java.util.Scanner;

public class Difficulty {

    Scanner scanner = new Scanner(System.in);

    public int selectDifficulty(){

        System.out.println("=================================");
        System.out.println("        NUMBER GAME");
        System.out.println("=================================");

        System.out.println("Choose Difficulty");

        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        System.out.print("Enter Choice : ");

        int choice = scanner.nextInt();


    //return 0;
        if(choice == 1){
            return 50;
        }else if(choice == 2){
            return 100;
        }else{
            return 500;
        }
    }

}
